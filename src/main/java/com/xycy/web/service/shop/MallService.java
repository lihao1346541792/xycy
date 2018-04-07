package com.xycy.web.service.shop;

import java.util.List;

import com.xycy.web.beans.MallCart;
import com.xycy.web.beans.MallProduct;

public interface MallService {

	/**
	 * 获取商品列表
	 * 
	 * @param orderby
	 *            排序方式（1价格，2销量）
	 * @return
	 */
	public List<MallProduct> getMallProduct(int orderby);

	/**
	 * 搜索
	 * 
	 * @param context
	 *            模糊查询内容
	 * @return
	 */
	public List<MallProduct> searchMallProduct(String context);

	/**
	 * 商品详情
	 * 
	 * @param id
	 *            商品id
	 * @return
	 */
	public MallProduct getMallProductDetail(Integer id);

	/**
	 * 商品添加到购物车
	 * 
	 * @param id
	 *            商品id
	 * @return
	 */
	public int addShoppingCart(MallCart mallCart);

	/**
	 * 获取购物车商品列表
	 * 
	 * @param id
	 *            用户id
	 * @return
	 */
	public List<MallCart> getShoppingCart(Integer id);

	/**
	 * 更新购物车
	 * 
	 * @param id
	 *            用户id
	 * @return
	 */
	public int upShoppingCart(Integer id);
}
