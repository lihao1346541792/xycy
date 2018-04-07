package com.xycy.web.service.shop;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xycy.web.beans.MallCart;
import com.xycy.web.beans.MallProduct;
import com.xycy.web.dao.shop.MallDao;

@Service
public class MallServiceImpl implements MallService {

	@Resource
	private MallDao mallDao;

	/**
	 * 获取商品列表
	 * 
	 * @param orderby
	 *            排序方式（1价格，2销量）
	 * @return
	 */
	@Override
	public List<MallProduct> getMallProduct(int orderby) {
		return mallDao.getMallProduct(orderby);
	}

	/**
	 * 搜索
	 * 
	 * @param context
	 *            模糊查询内容
	 * 
	 * @return
	 */
	@Override
	public List<MallProduct> searchMallProduct(String context) {
		return mallDao.searchMallProduct(context);
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
		return mallDao.getMallProductDetail(id);
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
		return mallDao.addShoppingCart(mallCart);
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
		return mallDao.getShoppingCart(id);
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
		return mallDao.upShoppingCart(id);
	}
}
