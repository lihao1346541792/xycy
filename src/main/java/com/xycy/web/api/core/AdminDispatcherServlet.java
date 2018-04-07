package com.xycy.web.api.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AdminDispatcherServlet extends DispatcherServlet {
	private static final long serialVersionUID = 1L;
	public static final Logger log = LoggerFactory.getLogger(AdminDispatcherServlet.class);

	@Override
	protected void initStrategies(ApplicationContext context) {
		logger.info("--香韵茶雨服务已经启动...");
		super.initStrategies(context);
	}
}
