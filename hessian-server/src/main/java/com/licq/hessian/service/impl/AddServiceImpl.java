package com.licq.hessian.service.impl;

import com.licq.hessian.service.AddService;

public class AddServiceImpl implements AddService {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("add(int a, int b) is invoked");  
		return a+b;
	}

	public long add(long a, long b) {
		// TODO Auto-generated method stub
		System.out.println("add(long a, long b) is invoked");  
		return a+b;
	}

}
