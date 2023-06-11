package com.study.myEditor;

import java.beans.PropertyEditorSupport;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-27 15:32
 */
public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] addressStr = text.split("_");

		Address address = new Address();
		address.setProvince(addressStr[0]);
		address.setCity(addressStr[1]);
		address.setDistrict(addressStr[2]);

		this.setValue(address);
	}
}
