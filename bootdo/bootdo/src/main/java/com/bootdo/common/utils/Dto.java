package com.bootdo.common.utils;

import java.util.HashMap;
import java.util.Map;

public class Dto extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	@Override
	public Dto put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
