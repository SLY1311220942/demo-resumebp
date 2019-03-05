package com.sly.resumebp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author sly
 * @time 2019年3月5日
 */
@Controller
@RequestMapping("/index")
public class IndexController {

	/**
	 * _去首页
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @author sly
	 * @time 2019年3月5日
	 */
	@RequestMapping("/toIndexHome")
	public String toIndexHome(HttpServletRequest request, HttpServletResponse response) {
		return "indexHome.html";
	}

	/**
	 * _去单线程下载页面
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @author sly
	 * @time 2019年3月5日
	 */
	@RequestMapping("/toSingleThreadDownload")
	public String toSingleThreadDownload(HttpServletRequest request, HttpServletResponse response) {
		return "singleThreadDownload.html";
	}

	/**
	 * _去单线程上传页面
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @author sly
	 * @time 2019年3月5日
	 */
	@RequestMapping("/toSingleThreadUpload")
	public String toSingleThreadUpload(HttpServletRequest request, HttpServletResponse response) {
		return "singleThreadUpload.html";
	}

	/**
	 * _去多线程下载页面
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @author sly
	 * @time 2019年3月5日
	 */
	@RequestMapping("/toMultiThreadDownload")
	public String toMultiThreadDownload(HttpServletRequest request, HttpServletResponse response) {
		return "multiThreadDownload.html";
	}

	/**
	 * _去多线程上传页面
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @author sly
	 * @time 2019年3月5日
	 */
	@RequestMapping("/toMultiThreadUpload")
	public String toMultiThreadUpload(HttpServletRequest request, HttpServletResponse response) {
		return "multiThreadUpload.html";
	}
}
