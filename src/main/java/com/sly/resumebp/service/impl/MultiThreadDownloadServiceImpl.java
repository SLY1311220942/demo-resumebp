package com.sly.resumebp.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sly.resumebp.service.MultiThreadDownloadService;

/**
 * _多线程下载service实现
 * @author sly
 * @time 2019年3月5日
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class MultiThreadDownloadServiceImpl implements MultiThreadDownloadService {
	private static final Logger LOGGER = LoggerFactory.getLogger(MultiThreadDownloadService.class);
}

