package com.sly.resumebp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Id;

/**
 * _文件实体类
 * 
 * @author sly
 * @time 2019年3月5日
 */
@Entity
@Table(name = "T_ANNEX")
public class Annex implements Serializable {

	private static final long serialVersionUID = 5145572718837780520L;

	/** 文件Id 自增 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "int COMMENT '文件Id 自增'")
	private String Id;

	/** 文件名称 */
	@Column(columnDefinition = "varchar(32) COMMENT '文件名称'")
	private String name;

	/** 文件类型 */
	@Column(columnDefinition = "varchar(32) COMMENT '文件类型'")
	private String type;

	/** 文件在服务器端url */
	@Column(columnDefinition = "varchar(256) COMMENT '文件在服务器端url'")
	private String url;

	/** 文件md5码 */
	@Column(columnDefinition = "varchar(32) COMMENT '文件md5码'")
	private String md5;

	/** 文件在用户本地地址 */
	@Column(name = "localaddr", columnDefinition = "varchar(512) COMMENT '文件在用户本地地址'")
	private String localAddr;

	/** 上传进度 */
	@Column(name = "uploadprocess", columnDefinition = "int COMMENT '上传进度'")
	private Integer upLoadProcess;

	/** 文件状态 0:待上传 1:上传中 2:上传成功 */
	@Column(columnDefinition = "smallint COMMENT '文件状态 0:待上传 1:上传中 2:上传成功'")
	private Integer status;

	/** 逻辑删除 Y:删除 N:未删除 */
	@Column(name = "logicdel", columnDefinition = "char(1) COMMENT '逻辑删除 Y:删除 N:未删除'")
	private String logicDel;
	
	/**这个字段不会持久化*/
	@Transient
	private String xx;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getLocalAddr() {
		return localAddr;
	}

	public void setLocalAddr(String localAddr) {
		this.localAddr = localAddr;
	}

	public Integer getUpLoadProcess() {
		return upLoadProcess;
	}

	public void setUpLoadProcess(Integer upLoadProcess) {
		this.upLoadProcess = upLoadProcess;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getLogicDel() {
		return logicDel;
	}

	public void setLogicDel(String logicDel) {
		this.logicDel = logicDel;
	}

	public String getXx() {
		return xx;
	}

	public void setXx(String xx) {
		this.xx = xx;
	}

	
}
