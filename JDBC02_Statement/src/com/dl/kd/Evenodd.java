package com.dl.kd;

import java.util.Scanner;

public class Evenodd {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num");
	int num =sc.nextInt();
	if(num%2==0) {
		System.out.println("even");
	}else {
		System.out.println("odd");
	}
}
}
