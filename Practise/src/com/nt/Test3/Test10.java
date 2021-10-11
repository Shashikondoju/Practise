package com.nt.Test3;

import java.util.Iterator;

public class Test10 {

	public static void main(String[] args) {
		   char a=97;
		   for (int i=0;i<5;i++){
		       for(int j=1;j<i;j++){
		           System.out.print(" ");
		       }if(i%2==0){
		           int b=1;
		       for(int k=i;k<5;k++){
		           System.out.print(b+" ");
		           b++;
		       }
		       }
		      else{
		          a=97;
		       for(int k=i;k<5;k++){
		           System.out.print(a+" ");
		           a++;
		       }
		      }
		       System.out.println();
		   }	
	}
}
