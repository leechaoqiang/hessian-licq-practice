package com.licq.hessian.service.impl;

import java.util.Random;

import com.licq.hessian.service.WeatherService;

public class WeatherServiceImpl implements WeatherService{
	
	static String[] weatherStats = new String[]{"晴","小雨","中雨","大雨","雷阵雨","阴转多云","小雪","中雪","大雪","台风"}; 
	public String queryWeatherInfo(String cityName) {
		int  i = new Random().nextInt(10);
		return cityName+",天气"+weatherStats[i];
	}

}
