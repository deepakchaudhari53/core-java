package com.mindscripts;

public class TestHashcodes implements Comparable{

	private int i;
	private int j;
	private int k;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
		result = prime * result + k;
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
		TestHashcodes other = (TestHashcodes) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		if (k != other.k)
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof TestHashcodes){
			TestHashcodes in = (TestHashcodes)o;
			if (in.getI()<this.getI()){
				return -1;
			}
			if (in.getI()==this.getI()){
				return 0;
			}else{
				return 1;
			}
		}
		return -1;
	}
	
}
