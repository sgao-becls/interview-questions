package org.example.duplicode;

/**
 * 第11行， 13行， 16行代码 和 第20行， 22行， 25行代码是重复的
 * 请用多种方式重构代码，只保留一份重复的代码
 * @author sgao
 */
public class Application {

	private static void printSum(int a) {
		System.out.println("========================start=======================");
		System.out.println("|                  Hello Sum !                     |");
		System.out.println("=========================end====================++==");
		int sum = - (a + a);
		System.out.println(String.format("a + b = %d", sum));
		System.out.println("Done!");
	}

	private static void printAbs(int a) {
		System.out.println("========================start=======================");
		System.out.println("|                  Hello Abs !                     |");
		System.out.println("=========================end====================++==");
		int abs = Math.abs(a);
		System.out.println(String.format("abs = %d", abs));
		System.out.println("Done!");
	}

	public static void main(String[] args) {
		printSum(10);
		printAbs(-5);
	}
}
