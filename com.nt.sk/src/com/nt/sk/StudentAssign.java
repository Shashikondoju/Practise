package com.nt.sk;

public class StudentAssign {
	
	private int sid;
	String sname;
	String course;
	double fee;
	
	@Override
	public String toString() {
		return "sid: "+sid+", sname: "+sname+", course: "+course+", fee: "+fee;
	}

	public static void main(String[] args) {
		StudentAssign st=new StudentAssign();
		st.sid=21;
		st.sname="shashikumar";
		st.course="Core java";
		st.fee=2500;
		
		System.out.println(st);
	}


}
