package com.wanghao.car.service.impI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanghao.car.entity.City;
import com.wanghao.car.entity.Driver;
import com.wanghao.car.mapper.CarMapper;
import com.wanghao.car.service.CarService;

@Service(interfaceClass = CarService.class)
public class CarServiceImp implements CarService {
	@Autowired
	private CarMapper carMapper;

	@Override
	public Map selectDriverList(Integer pageNum, Integer pageSize, String driverName) {
		// TODO Auto-generated method stub
		Map<Object, Object> map = new HashMap<>();
		PageHelper.startPage(pageNum, pageSize);
		List<Map> driverList = carMapper.selectDriverList(driverName);
		PageInfo<Map> pageInfo = new PageInfo<>(driverList);
		map.put("driverList ", driverList);
		map.put("pageInfo", pageInfo);
		return map;
	}

	@Override
	public List<Map> getCommentList(String name) {
		// TODO Auto-generated method stub
		return carMapper.getCommentList(name);
	}

	@Override
	public List<City> selectCityList(Integer pid) {
		// TODO Auto-generated method stub
		return carMapper.selectCityList(pid);
	}

	@Override
	public int insertdriver(Driver driver) {
		// TODO Auto-generated method stub
		return carMapper.insertdriver(driver);
	}

}
