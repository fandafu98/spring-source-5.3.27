/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2024 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2024-03-05 22:13
 */
package com.have.createBean.domain;

/**
 *
 *
 * @author zhengyankang
 * @version Computer.java, v 0.1 2024-03-05 22:13
 */
public class Computer {

	/**
	 * cpu型号
	 */
	private String cpuModel;

	/**
	 * gpu型号
	 */
	private String gpuModel;

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public String getGpuModel() {
		return gpuModel;
	}

	public void setGpuModel(String gpuModel) {
		this.gpuModel = gpuModel;
	}

}
