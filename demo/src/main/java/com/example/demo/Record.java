package com.example.demo;

import com.opencsv.bean.CsvBindByName;

public class Record  extends CsvBean {
	@CsvBindByName(column = "be")
	private String be;
	@CsvBindByName(column = "cd")
	private int cd;
	public String getBe() {
		return be;
	}
	public void setBe(String be) {
		this.be = be;
	}
	public int getCd() {
		return cd;
	}
	public void setCd(int cd) {
		this.cd = cd;
	}
	@Override
	public String toString() {
		return "Record [be=" + be + ", cd=" + cd + "]";
	}


}
