package com.vidvaan.collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx4 implements Comparable<TreeSetEx4> {

	private int sid;
	private String sname;
	private double sfee;

	public TreeSetEx4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TreeSetEx4(int sid, String sname, double sfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSfee() {
		return sfee;
	}

	public void setSfee(double sfee) {
		this.sfee = sfee;
	}

	@Override
	public String toString() {
		return "TreeSetEx4 [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
	}
	
//	@Override
//	public int compare(TreeSetEx4 o1, TreeSetEx4 o2) {
//		if(o1.getSid()>o2.getSid())
//			return 1;
//		if(o1.getSid()<o1.getSid())
//			return -1;
//		return 0;
//	}

	public static void main(String[] args) {
		TreeSet<TreeSetEx4> treeSet = new TreeSet<>();
		treeSet.add(new TreeSetEx4(102, "Naveen", 20000.00));
		treeSet.add(new TreeSetEx4(104, "Lokesh", 23000.00));
		treeSet.add(new TreeSetEx4(101, "Karthik", 24000.00));
		treeSet.add(new TreeSetEx4(103, "Ganesh", 21000.00));
		treeSet.add(new TreeSetEx4(105, "Satya", 22000.00));
for (TreeSetEx4 treeSetEx4 : treeSet) {
	System.out.println(treeSetEx4);
	
}

	}

	@Override
	public int compareTo(TreeSetEx4 o) {
		if(this.sid>o.sid)
			return 1;
		if(this.sid<o.sid)
			return -1;
		return 0;
	}



}
