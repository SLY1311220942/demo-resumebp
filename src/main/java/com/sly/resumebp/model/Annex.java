package com.sly.resumebp.model;

import java.io.Serializable;

/**
 * _文件实体类
 * @author sly
 * @time 2019年3月5日
 */
public class Annex implements Serializable {

	private static final long serialVersionUID = 5145572718837780520L;
	
	/**文件Id 自增*/
	private String Id;
	/**文件名称 varchar(32)*/
	private String name;
	/**文件类型 varchar(32)*/
	private String type;
	/**文件服务器端url varchar(256)*/
	private String url;
	/**文件md5码 varchar(32)*/
	private String md5;
	/**文件本地地址 varchar(512)*/
	private String localAddr;
	/**上传进度 int*/
	private Integer upLoadProcess;
	/**文件状态 0:待上传 1:上传中 2:上传成功 */
	private Integer status;
	/**逻辑删除 Y:删除 N:未删除*/
	private String logicDel;
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
	
}

