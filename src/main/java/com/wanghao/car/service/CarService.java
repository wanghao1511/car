package com.wanghao.car.service;

import java.util.List;
import java.util.Map;

import com.wanghao.car.entity.City;
import com.wanghao.car.entity.Driver;

public interface CarService {
	Map selectDriverList(Integer pageNum, Integer pageSize, String driverName);

	List<Map> getCommentList(String name);

	// 城市下拉
	List<City> selectCityList(Integer pid);

	//
	int insertdriver(Driver driver);
}
