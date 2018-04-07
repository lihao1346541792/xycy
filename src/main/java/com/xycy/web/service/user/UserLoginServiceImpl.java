package com.xycy.web.service.user;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xycy.web.beans.UserAddress;
import com.xycy.web.beans.UserLogin;
import com.xycy.web.dao.user.UserLoginDao;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Resource
	private UserLoginDao userLoginDao;

	/**
	 * 登录,获取用户数据,参数： phone（或微信号），password
	 * 
	 * @param userLogin
	 * @return
	 */
	@Override
	public UserLogin getUser(UserLogin userLogin) {
		return userLoginDao.getUser(userLogin);
	}

	/**
	 * 注册,添加用户,参数： 手机号密码（phone,password）（或微信号，需完善信息绑定手机号）
	 * 
	 * @param userLogin
	 * @return
	 */
	@Override
	public int addUser(UserLogin userLogin) {
		return userLoginDao.addUser(userLogin);
	}

	/**
	 * 修改个人信息
	 * 
	 * @param userLogin
	 * @return
	 */
	@Override
	public int upUserMsg(UserLogin userLogin) {
		return userLoginDao.upUserMsg(userLogin);
	}

	/**
	 * 添加收货地址
	 * 
	 * @param UserAddress
	 * @return
	 */
	@Override
	public int addUserAddress(UserAddress userAddress) {
		return userLoginDao.addUserAddress(userAddress);
	}

	/**
	 * 修改收货地址
	 * 
	 * @param UserAddress
	 * @return
	 */
	@Override
	public int upUserAddress(UserAddress userAddress) {
		return userLoginDao.upUserAddress(userAddress);
	}

	/**
	 * 获取用户余额
	 * 
	 * @param UserAddress
	 * @return
	 */
	@Override
	public BigDecimal getUserBalance(Integer id) {
		return userLoginDao.getUserBalance(id);
	}

	/**
	 * 获取用户积分
	 * 
	 * @param UserAddress
	 * @return
	 */
	@Override
	public int getUserIntegral(Integer id) {
		return userLoginDao.getUserIntegral(id);
	}

	/**
	 * 更新用户积分（余额）
	 * 
	 * @param UserAddress
	 * @return
	 */
	@Override
	public int upBalanceOrIntegral(Integer id) {
		return userLoginDao.upBalanceOrIntegral(id);
	}
}
