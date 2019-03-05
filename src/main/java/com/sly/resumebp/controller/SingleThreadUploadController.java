package com.sly.resumebp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.sly.resumebp.common.result.BaseResult;

/**
 * _单线程上传controller
 * 
 * @author sly
 * @time 2019年3月5日
 */
@Controller
@RequestMapping("/singleThread")
public class SingleThreadUploadController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SingleThreadUploadController.class);

	@ResponseBody
	@RequestMapping("/upload")
	public BaseResult upload(HttpServletRequest request, HttpServletResponse response) {
		try {
			// 获取上传文件
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			MultipartFile multipartFile = multipartRequest.getFile("file");
			
			return null;
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
			return new BaseResult(400, "上传失败!");
		}
	}
}
