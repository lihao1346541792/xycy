package com.xycy.web.dao.shop;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

public class OrderDaoImpl implements OrderDao {

	@Resource
	private SqlSessionTemplate sqlSession;
}
