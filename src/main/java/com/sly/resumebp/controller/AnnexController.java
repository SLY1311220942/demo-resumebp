package com.sly.resumebp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sly.resumebp.common.result.BaseResult;

/**
 * _文件查询controller
 * 
 * @author sly
 * @time 2019年3月5日
 */
@Controller
@RequestMapping("/annex")
public class AnnexController {
	private static final Logger LOGGER = LoggerFactory.getLogger(AnnexController.class);
	
	/**
	 * _查询上传中的附件列表
	 * @param request
	 * @param response
	 * @return
	 * @author sly
	 * @time 2019年3月5日
	 */
	@RequestMapping("/findUploadAnnexList")
	public BaseResult findUploadAnnexList(HttpServletRequest request, HttpServletResponse response) {
		try {
			return null;
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
			return new BaseResult(400, "查询失败!");
		}
	}
	
	/**
	 * _查询下载中的附件列表
	 * @param request
	 * @param response
	 * @return
	 * @author sly
	 * @time 2019年3月5日
	 */
	@RequestMapping("/findDownLoadAnnexList")
	public BaseResult findDownLoadAnnexList(HttpServletRequest request, HttpServletResponse response) {
		try {
			return null;
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
			return new BaseResult(400, "查询失败!");
		}
	}
	
	/**
	 * _查询状态为上传完成的附件列表
	 * @param request
	 * @param response
	 * @return
	 * @author sly
	 * @time 2019年3月5日
	 */
	@RequestMapping("/findAnnexList")
	public BaseResult findAnnexList(HttpServletRequest request, HttpServletResponse response) {
		try {
			return null;
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getStackTrace(e));
			return new BaseResult(400, "查询失败!");
		}
	}
}
