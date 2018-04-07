package com.xycy.web.dao.shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

import com.xycy.web.beans.MallCart;
import com.xycy.web.beans.MallProduct;

public class MallDaoImpl implements MallDao {

	@Resource
	private SqlSessionTemplate sqlSession;

	/**
	 * 获取商品列表
	 * 
	 * @param orderby
	 *            排序方式（1价格，2销量）
	 * @return
	 */
	@Override
	public List<MallProduct> getMallProduct(int orderby) {
		return sqlSession.selectList("com.xycy.web.beans.MallProduct.getMallProduct", orderby);
	}

	/**
	 * 搜索
	 * 
	 * @param context
	 *            模糊查询内容
	 * @return
	 */
	@Override
	public List<MallProduct> searchMallProduct(String context) {
		Map map = new HashMap();
		map.put("name", "%" + context + "%");
		return sqlSession.selectList("com.xycy.web.beans.MallProduct.searchMallProduct", map);
	}

	/**
	 * 商品详情
	 * 
	 * @param id
	 *            商品id
	 * @return
	 */
	@Override
	public MallProduct getMallProductDetail(Integer id) {
		return sqlSession.selectOne("com.xycy.web.beans.MallProduct.getMallProductDetail", id);
	}

	/**
	 * 商品添加到购物车
	 * 
	 * @param id
	 *            商品id
	 * @return
	 */
	@Override
	public int addShoppingCart(MallCart mallCart) {
		return sqlSession.insert("com.xycy.web.beans.MallProduct.addShoppingCart", mallCart);
	}

	/**
	 * 获取购物车商品列表
	 * 
	 * @param id
	 *            用户id
	 * @return
	 */
	@Override
	public List<MallCart> getShoppingCart(Integer id) {
		List<MallCart> list = sqlSession.selectList("com.xycy.web.beans.MallProduct.getShoppingCart", id);
		for (int i = 0; i < list.size(); i++) {
			MallProduct mallProduct = getMallProductDetail(list.get(i).getProductId());
			list.get(i).setMallProduct(mallProduct);
		}
		return list;
	}

	/**
	 * 更新购物车
	 * 
	 * @param id
	 *            用户id
	 * @return
	 */
	@Override
	public int upShoppingCart(Integer id) {
		return sqlSession.update("com.xycy.web.beans.MallProduct.upShoppingCart", id);
	}
}
