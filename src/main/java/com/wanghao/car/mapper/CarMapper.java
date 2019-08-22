package com.wanghao.car.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wanghao.car.entity.City;
import com.wanghao.car.entity.Driver;

public interface CarMapper {

	List<Map> selectDriverList(@Param("driverName") String driverName);

	List<Map> getCommentList(@Param("name") String name);

	// 城市下拉
	List<City> selectCityList(@Param("pid") Integer pid);
	//
	int insertdriver(@Param("d") Driver driver);
}
