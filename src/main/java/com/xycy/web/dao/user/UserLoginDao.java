package com.xycy.web.dao.user;

import java.math.BigDecimal;

import com.xycy.web.beans.UserAddress;
import com.xycy.web.beans.UserLogin;

public interface UserLoginDao {

	/**
	 * 登录,获取用户数据,参数： phone（或微信号），password
	 * 
	 * @param userLogin
	 * @return
	 */
	public UserLogin getUser(UserLogin userLogin);

	/**
	 * 注册,添加用户,参数： 手机号密码（phone,password）（或微信号，需完善信息绑定手机号）
	 * 
	 * @param userLogin
	 * @return
	 */
	public int addUser(UserLogin userLogin);

	/**
	 * 修改个人信息
	 * 
	 * @param userLogin
	 * @return
	 */
	public int upUserMsg(UserLogin userLogin);

	/**
	 * 添加收货地址
	 * 
	 * @param UserAddress
	 * @return
	 */
	public int addUserAddress(UserAddress userAddress);

	/**
	 * 修改收货地址
	 * 
	 * @param UserAddress
	 * @return
	 */
	public int upUserAddress(UserAddress userAddress);

	/**
	 * 获取用户余额
	 * 
	 * @param id
	 * @return
	 */
	public BigDecimal getUserBalance(Integer id);

	/**
	 * 获取用户积分
	 * 
	 * @param id
	 * @return
	 */
	public int getUserIntegral(Integer id);

	/**
	 * 更新用户积分（余额）
	 * 
	 * @param id
	 * @return
	 */
	public int upBalanceOrIntegral(Integer id);

}
