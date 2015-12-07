package com.licq.hessian.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class ApplicationContextUtil {
	private  ApplicationContext context;//声明一个静态变量保存  

	public void setApplicationContext(ApplicationContext applicationContext)  
            throws BeansException {  
        this.context=applicationContext;  
    }  
  
    public  ApplicationContext getContext(){  
          return context;  
    }  
}
