package com.nt.placements;

public class For3 {

	public static void main(String[] args) {
		int ii=1;
		int jj=0;
		for (ii=1; ii <=5;) {
			if(jj<ii) {
				System.out.print("@");
				jj++;
			}		
			 if(jj==ii) {
				System.out.println();
				ii++;
				jj=0;	
			}
		}
	}
}
