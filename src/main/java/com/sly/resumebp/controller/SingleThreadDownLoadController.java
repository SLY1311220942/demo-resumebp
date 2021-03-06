package com.sly.resumebp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * _单线程下载controller
 * @author sly
 * @time 2019年3月5日
 */
@Controller
@RequestMapping("/singleThread")
public class SingleThreadDownLoadController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SingleThreadDownLoadController.class);
}

