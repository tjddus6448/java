package org.javaro.lecture;

public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("김성연"+"-"+"20181346");
		int a0=8;	int a1=5;	int a2=2;	int a3=3; int a4=6;
		System.out.println("동일타입변수=" + a0 +","+a1+","+a2+","+a3+","+a4);
		int [] a = new int[5];
		// int [] a = {8,5,2,3,6}
		// int [] a = new int [] {8,5,2,3,6}
		
		a[0]=8;	a[1]=5;	a[2]=2;	a[3]=3;	a[4]=6;
		System.out.println("동일타입변수=" + a[0] +","+a[1]+","+a[2]+","+a[3]+","+a[4]);
	}

}
