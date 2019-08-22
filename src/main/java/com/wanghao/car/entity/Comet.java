package com.wanghao.car.entity;

import java.io.Serializable;
import java.util.Date;

public class Comet implements Serializable{

	/**
	 * <br>
	 * Description:TODO 变量描述 <br>
	 * Author:王昊823865618@qq.com) <br>
	 * Date:2019年8月17日
	 */
	private static final long serialVersionUID = -7296729607177982015L;

	private int id;
	private String coment;
	private int yuan;
	private int fen;
	private Date weidate;
	private int status;
	private int tid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}

	public int getYuan() {
		return yuan;
	}

	public void setYuan(int yuan) {
		this.yuan = yuan;
	}

	public int getFen() {
		return fen;
	}

	public void setFen(int fen) {
		this.fen = fen;
	}

	public Date getWeidate() {
		return weidate;
	}

	public void setWeidate(Date weidate) {
		this.weidate = weidate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	@Override
	public String toString() {
		return "Comet [id=" + id + ", coment=" + coment + ", yuan=" + yuan + ", fen=" + fen + ", weidate=" + weidate
				+ ", status=" + status + ", tid=" + tid + "]";
	}

	public Comet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comet(int id, String coment, int yuan, int fen, Date weidate, int status, int tid) {
		super();
		this.id = id;
		this.coment = coment;
		this.yuan = yuan;
		this.fen = fen;
		this.weidate = weidate;
		this.status = status;
		this.tid = tid;
	}

	public Comet(String coment, int yuan, int fen, Date weidate, int status, int tid) {
		super();
		this.coment = coment;
		this.yuan = yuan;
		this.fen = fen;
		this.weidate = weidate;
		this.status = status;
		this.tid = tid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coment == null) ? 0 : coment.hashCode());
		result = prime * result + fen;
		result = prime * result + id;
		result = prime * result + status;
		result = prime * result + tid;
		result = prime * result + ((weidate == null) ? 0 : weidate.hashCode());
		result = prime * result + yuan;
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
		Comet other = (Comet) obj;
		if (coment == null) {
			if (other.coment != null)
				return false;
		} else if (!coment.equals(other.coment))
			return false;
		if (fen != other.fen)
			return false;
		if (id != other.id)
			return false;
		if (status != other.status)
			return false;
		if (tid != other.tid)
			return false;
		if (weidate == null) {
			if (other.weidate != null)
				return false;
		} else if (!weidate.equals(other.weidate))
			return false;
		if (yuan != other.yuan)
			return false;
		return true;
	}

}
