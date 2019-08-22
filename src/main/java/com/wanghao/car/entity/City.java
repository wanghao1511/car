package com.wanghao.car.entity;

import java.io.Serializable;

public class City implements Serializable{
	/**
	 * <br>
	 * Description:TODO 变量描述 <br>
	 * Author:王昊823865618@qq.com) <br>
	 * Date:2019年8月17日
	 */
	private static final long serialVersionUID = -5178339583856820695L;
	private int id;
	private int pid;
	private String cityname;
	private int type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(int id, int pid, String cityname, int type) {
		super();
		this.id = id;
		this.pid = pid;
		this.cityname = cityname;
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityname == null) ? 0 : cityname.hashCode());
		result = prime * result + id;
		result = prime * result + pid;
		result = prime * result + type;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (cityname == null) {
			if (other.cityname != null)
				return false;
		} else if (!cityname.equals(other.cityname))
			return false;
		if (id != other.id)
			return false;
		if (pid != other.pid)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", pid=" + pid + ", cityname=" + cityname + ", type=" + type + "]";
	}

}
