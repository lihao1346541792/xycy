package com.xycy.web.app.user;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xycy.web.api.result.Result;
import com.xycy.web.beans.UserAddress;
import com.xycy.web.beans.UserLogin;
import com.xycy.web.service.user.UserLoginService;

@Controller
@RequestMapping("/user")
@SessionAttributes
public class UserLoinControll {

	@Resource
	private UserLoginService userLoginService;

	/**
	 * 登录 phone(或者微信号wx),password
	 * 
	 * @param userLogin
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public Result login(@RequestBody UserLogin userLogin, HttpServletRequest request) {
		Result result = new Result();
		UserLogin login = userLoginService.getUser(userLogin);
		if (login == null) {
			result.put("msg", "filed");
		} else {
			request.getSession().setAttribute("userLogin", login);
			result.put("login", login);
			result.put("msg", "success");
		}
		return result;
	}

	/**
	 * 注册 phone,password
	 * 
	 * @param userLogin
	 * @return
	 */
	@RequestMapping("/register")
	@ResponseBody
	public Result register(@RequestBody UserLogin userLogin) {
		Result result = new Result();
		int status = userLoginService.addUser(userLogin);
		if (status > 0) {
			result.put("msg", "success");
		} else {
			result.put("msg", "failed");
		}
		return result;
	}

	/**
	 * 修改个人信息
	 * 
	 * @param userLogin
	 * @return
	 */
	@RequestMapping("/upUserMsg")
	@ResponseBody
	public Result upUserMsg(@RequestBody UserLogin userLogin) {
		Result result = new Result();
		int status = userLoginService.upUserMsg(userLogin);
		if (status > 0) {
			result.put("msg", "success");
		} else {
			result.put("msg", "failed");
		}
		return result;
	}

	/**
	 * 添加收货地址
	 * 
	 * @param UserAddress
	 * @return
	 */
	@RequestMapping("/addUserAddress")
	@ResponseBody
	public Result addUserAddress(@RequestBody UserAddress userAddress, HttpServletRequest request) {
		Result result = new Result();
		UserLogin userLogin = (UserLogin) request.getSession().getAttribute("userLogin");
		userAddress.setCreatorId(userLogin.getId());
		int status = userLoginService.addUserAddress(userAddress);
		if (status > 0) {
			result.put("msg", "success");
		} else {
			result.put("msg", "failed");
		}
		return result;
	}

	/**
	 * 修改收货地址
	 * 
	 * @param UserAddress
	 * @return
	 */
	@RequestMapping("/upUserAddress")
	@ResponseBody
	public Result upUserAddress(@RequestBody UserAddress userAddress) {
		Result result = new Result();
		int status = userLoginService.upUserAddress(userAddress);
		if (status > 0) {
			result.put("msg", "success");
		} else {
			result.put("msg", 	"failed");
		}
		return result;
	}
	
}
