package com.sly.resumebp.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sly.resumebp.service.SingleThreadUploadService;

/**
 * _单线程上传service实现
 * @author sly
 * @time 2019年3月5日
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class SingleThreadUploadServiceImpl implements SingleThreadUploadService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SingleThreadUploadService.class);
}

