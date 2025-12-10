package com.demo.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {
	private int pid;
	private String pname;
	private double price;
	private int qty;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate mfgdate;
	private int cid;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, double price, int qty, LocalDate mfgdate, int cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
		this.mfgdate = mfgdate;
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public LocalDate getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + ", mfgdate=" + mfgdate
				+ ", cid=" + cid + "]";
	}
	

}
