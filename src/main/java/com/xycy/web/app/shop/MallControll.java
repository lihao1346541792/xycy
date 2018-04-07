package com.xycy.web.app.shop;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xycy.web.api.result.Result;
import com.xycy.web.beans.MallCart;
import com.xycy.web.beans.MallProduct;
import com.xycy.web.service.shop.MallService;

@Controller
@RequestMapping("/mall")
public class MallControll {

	@Resource
	private MallService mallService;

	/**
	 * 获取商品列表
	 * 
	 * @param orderby
	 *            排序方式（1价格，2销量）
	 * @return
	 */
	@RequestMapping("/getMallProduct")
	public Result getMallProduct(Map map) {
		Result result = new Result();
		List<MallProduct> list = mallService.getMallProduct((int) map.get("orderby"));
		result.put("mall", list);
		return result;
	}

	/**
	 * 搜索
	 * 
	 * @param context
	 *            模糊查询内容
	 * @return
	 */
	@RequestMapping("/searchMallProduct")
	public Result searchMallProduct(Map map) {
		Result result = new Result();
		List<MallProduct> list = mallService.searchMallProduct((String) map.get("context"));
		result.put("mall", list);
		return result;
	}

	/**
	 * 商品详情
	 * 
	 * @param id
	 *            商品id
	 * @return
	 */
	@RequestMapping("/getMallProductDetail")
	public Result getMallProductDetail(Map map) {
		Result result = new Result();
		List<MallProduct> list = mallService.searchMallProduct((String) map.get("context"));
		result.put("mall", list);
		return result;
	}

	/**
	 * 商品添加到购物车
	 * 
	 * @param id
	 *            用户id mallPeoductid 商品id
	 * @return
	 */
	@RequestMapping("/addShoppingCart")
	public Result addShoppingCart(MallCart mallCart) {
		Result result = new Result();
		int status = mallService.addShoppingCart(mallCart);
		result.put("status", status);
		return result;
	}

	/**
	 * 购物车
	 * 
	 * @param id
	 *            用户id
	 * @return
	 */
	@RequestMapping("/getShoppingCart")
	public Result getShoppingCart(Map map) {
		Result result = new Result();
		List<MallCart> list = mallService.getShoppingCart((int) map.get("id"));
		result.put("shoppingCart", list);
		return result;
	}

	/**
	 * 更新购物车
	 * 
	 * @param id
	 *            用户id
	 * @return
	 */
	@RequestMapping("/upShoppingCart")
	public Result upShoppingCart(Map map) {
		Result result = new Result();
		List<MallProduct> list = mallService.searchMallProduct((String) map.get("context"));
		result.put("mall", list);
		return result;
	}
}
