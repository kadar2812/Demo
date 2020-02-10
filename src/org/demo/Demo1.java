package org.demo;
import java.util.Scanner;

public class Demo1 {
	
	public void method()
	{
		Scanner s =new Scanner(System.in);
		String m = s.nextLine();
		System.out.println(m);
		int n= s.nextInt();
		String c = s.next();
		System.out.println(c);
		System.out.println(n);
	}
public static void main(String[] args) {
	Demo1 d = new Demo1();
	d.method();
	d.method();
}}
