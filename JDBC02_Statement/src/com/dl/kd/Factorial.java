package com.dl.kd;

import java.util.Scanner;

public class Factorial {
public void fact(int num) {
	int fact = 1;
	for(int i =1;i<=num;i++) {
		fact = fact*i;
	}
System.out.println("factorial "+fact);
}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num");
	int num=sc.nextInt();
	Factorial obj = new Factorial();
	obj.fact(num);
}
}
