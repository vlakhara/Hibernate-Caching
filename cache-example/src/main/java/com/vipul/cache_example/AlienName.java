package com.vipul.cache_example;



public class AlienName {

	private String fName;
	private String mName;
	private String lName;

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	@Override
	public String toString() {
		return "[fName=" + fName + ", mName=" + mName + ", lName=" + lName + "]";
	}
	
	
	
}
