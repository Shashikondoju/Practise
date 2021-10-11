package com.nt.Test3;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	static void secondLargest(int[] input)
  {
      int fst, sec;
      if(input[0] > input[1])
      {
          fst = input[0];
          sec = input[1];
      }
      else
      {
          fst = input[1];
          sec = input[0];
      }
      for (int i = 2; i < input.length; i++) { 
      	if(input[i] > fst)
          {
              sec= fst;
              fst = input[i];
          }
          else if (input[i] < fst && input[i] > sec)
          {
              sec = input[i];
          }
      }         
      System.out.println("secondLargest::"+sec);
  }

	static void secondSmallest(int[] input)
  {
      int fst, sec;
      if(input[0] < input[1])
      {
          fst = input[0];
          sec = input[1];
      }
      else
      {
          fst = input[1];
          sec = input[0];
      }
      for (int i = 2; i < input.length; i++) { 
      	if(input[i] <fst)
          {
              sec= fst;
              fst = input[i];
          }
          else if (input[i] > fst && input[i] <sec)
          {
              sec = input[i];
          }
      }         
      System.out.println("secondSmallest no is::"+sec);
  }


	public static void main(String[] args) {
		System.out.println("enter array size ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []input=new int[size];
		System.out.println("enter array elements");
		for (int i = 0; i <size; i++) {
			input[i]=sc.nextInt();
		}
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		System.out.println("second largest number is:"+input[input.length-2]);
		secondLargest(input);
		secondSmallest(input);
	}

}
