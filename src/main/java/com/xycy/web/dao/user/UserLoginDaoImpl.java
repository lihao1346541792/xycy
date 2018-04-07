package com.xycy.web.dao.user;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.xycy.web.beans.UserAddress;
import com.xycy.web.beans.UserLogin;

@Repository
public class UserLoginDaoImpl implements UserLoginDao {
	@Resource
	private SqlSessionTemplate sqlSession;

	/**
	 * 登录,获取用户数据,参数： phone（或微信号），password
	 * 
	 * @param userLogin
	 * @return
	 */
	@Override
	public UserLogin getUser(UserLogin userLogin) {
		return sqlSession.selectOne("com.xycy.web.beans.UserLogin.getUser", userLogin);
	}

	/**
	 * 注册,添加用户,参数： 手机号密码（phone,password）（或微信号，需完善信息绑定手机号）
	 * 
	 * @param userLogin
	 * @return
	 */
	@Override
	public int addUser(UserLogin userLogin) {
		int status = sqlSession.insert("com.xycy.web.beans.UserLogin.addUser", userLogin);
		if (status > 0) {
			status = sqlSession.insert("com.xycy.web.beans.UserLogin.addUserBase", userLogin);
		}
		return status;
	}

	/**
	 * 修改个人信息
	 * 
	 * @param userLogin
	 * @return
	 */
	@Override
	public int upUserMsg(UserLogin userLogin) {
		return sqlSession.update("com.xycy.web.beans.UserLogin.upUserMsg", userLogin);
	}

	/**
	 * 添加收货地址
	 * 
	 * @param UserAddress
	 * @return
	 */
	@Override
	public int addUserAddress(UserAddress userAddress) {
		return sqlSession.insert("com.xycy.web.beans.UserLogin.addUserAddress", userAddress);
	}

	/**
	 * 修改收货地址
	 * 
	 * @param UserAddress
	 * @return
	 */
	@Override
	public int upUserAddress(UserAddress userAddress) {
		return sqlSession.update("com.xycy.web.beans.UserLogin.upUserAddress", userAddress);
	}

	/**
	 * 获取用户余额
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public BigDecimal getUserBalance(Integer id) {
		return sqlSession.selectOne("com.xycy.web.beans.UserLogin.getUserBalance", id);
	}

	/**
	 * 获取用户积分
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public int getUserIntegral(Integer id) {
		return sqlSession.selectOne("com.xycy.web.beans.UserLogin.getUserIntegral", id);
	}

	/**
	 * 更新用户积分（余额）
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public int upBalanceOrIntegral(Integer id) {
		Map map = new HashMap();
		map.put("id", id);
		map.put("id", id);

		return sqlSession.update("com.xycy.web.beans.UserLogin.upBalanceOrIntegral", map);
	}
}
