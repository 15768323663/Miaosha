package com.imooc.miaosha.redis;

//保证key的唯一性
public interface KeyPrefix {
		
	public int expireSeconds();
	
	public String getPrefix();
	
}
