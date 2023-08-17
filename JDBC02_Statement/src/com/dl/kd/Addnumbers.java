package com.dl.kd;

import java.util.Scanner;

public class Addnumbers {
	public void add(int n1,int n2) {
		int sum = n1+ n2;
		System.out.println("sum"+sum);
	}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter n1");
	int n1 = sc.nextInt();
	System.out.println("enter n2");
	int n2 = sc.nextInt();
	Addnumbers obj = new Addnumbers();
	obj.add(n1, n2);
}
}
