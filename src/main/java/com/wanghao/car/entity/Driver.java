package com.wanghao.car.entity;

import java.io.Serializable;
import java.util.Date;

public class Driver implements Serializable{
	/**
	 * <br>
	 * Description:TODO 变量描述 <br>
	 * Author:王昊823865618@qq.com) <br>
	 * Date:2019年8月17日
	 */
	private static final long serialVersionUID = -5599912822144252633L;
	private int id;
	private int jid;
	private String name;
	private String sex;
	private int shenId;
	private String shenname;
	private int shiId;
	private String shiname;
	private int xianId;
	private String xianname;
	private Date datea;
	private int num;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getShenId() {
		return shenId;
	}

	public void setShenId(int shenId) {
		this.shenId = shenId;
	}

	public String getShenname() {
		return shenname;
	}

	public void setShenname(String shenname) {
		this.shenname = shenname;
	}

	public int getShiId() {
		return shiId;
	}

	public void setShiId(int shiId) {
		this.shiId = shiId;
	}

	public String getShiname() {
		return shiname;
	}

	public void setShiname(String shiname) {
		this.shiname = shiname;
	}

	public int getXianId() {
		return xianId;
	}

	public void setXianId(int xianId) {
		this.xianId = xianId;
	}

	public String getXianname() {
		return xianname;
	}

	public void setXianname(String xianname) {
		this.xianname = xianname;
	}

	public Date getDatea() {
		return datea;
	}

	public void setDatea(Date datea) {
		this.datea = datea;
	}

	public int getNum() {
		return num;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", jid=" + jid + ", name=" + name + ", sex=" + sex + ", shenId=" + shenId
				+ ", shenname=" + shenname + ", shiId=" + shiId + ", shiname=" + shiname + ", xianId=" + xianId
				+ ", xianname=" + xianname + ", datea=" + datea + ", num=" + num + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datea == null) ? 0 : datea.hashCode());
		result = prime * result + id;
		result = prime * result + jid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + shenId;
		result = prime * result + ((shenname == null) ? 0 : shenname.hashCode());
		result = prime * result + shiId;
		result = prime * result + ((shiname == null) ? 0 : shiname.hashCode());
		result = prime * result + xianId;
		result = prime * result + ((xianname == null) ? 0 : xianname.hashCode());
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
		Driver other = (Driver) obj;
		if (datea == null) {
			if (other.datea != null)
				return false;
		} else if (!datea.equals(other.datea))
			return false;
		if (id != other.id)
			return false;
		if (jid != other.jid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (shenId != other.shenId)
			return false;
		if (shenname == null) {
			if (other.shenname != null)
				return false;
		} else if (!shenname.equals(other.shenname))
			return false;
		if (shiId != other.shiId)
			return false;
		if (shiname == null) {
			if (other.shiname != null)
				return false;
		} else if (!shiname.equals(other.shiname))
			return false;
		if (xianId != other.xianId)
			return false;
		if (xianname == null) {
			if (other.xianname != null)
				return false;
		} else if (!xianname.equals(other.xianname))
			return false;
		return true;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Driver(int jid, String name, String sex, int shenId, String shenname, int shiId, String shiname, int xianId,
			String xianname, Date datea, int num) {
		super();
		this.jid = jid;
		this.name = name;
		this.sex = sex;
		this.shenId = shenId;
		this.shenname = shenname;
		this.shiId = shiId;
		this.shiname = shiname;
		this.xianId = xianId;
		this.xianname = xianname;
		this.datea = datea;
		this.num = num;
	}

	public Driver(int id, int jid, String name, String sex, int shenId, String shenname, int shiId, String shiname,
			int xianId, String xianname, Date datea, int num) {
		super();
		this.id = id;
		this.jid = jid;
		this.name = name;
		this.sex = sex;
		this.shenId = shenId;
		this.shenname = shenname;
		this.shiId = shiId;
		this.shiname = shiname;
		this.xianId = xianId;
		this.xianname = xianname;
		this.datea = datea;
		this.num = num;
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

}
