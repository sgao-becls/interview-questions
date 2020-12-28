package org.example.duplicode;

/**
 * 第11，12，13行， 18，19。20行代码 和 第24，25，26行， 31，32，33行代码是重复的
 * 请用多种方式重构代码，只保留一份重复的代码
 * @author sgao
 */
public class Application {

	private static void printSum(int a) {
		System.out.println("重复行:========================start=======================");
		System.out.println("重复行:|                  Hello World !                   |");
		System.out.println("重复行:=========================end====================++==");

		int sum = - (a + a);
		System.out.println(String.format("a + b = %d", sum));
		sum = - (sum + sum);
		System.out.println(String.format("sum + sum = %d", sum));

		System.out.println("重复行:Done!");
		String strA = String.valueOf(a);		// 重复行
		System.out.println("重复行:strA = " + strA);
	}

	private static void printAbs(int a) {
		System.out.println("重复行:========================start=======================");
		System.out.println("重复行:|                  Hello World !                   |");
		System.out.println("重复行:=========================end====================++==");

		int sum100 = a + 100;
		System.out.println(String.format("a + 100 = %d", sum100));
		int abs = Math.abs(a);
		System.out.println(String.format("abs = %d", abs));

		System.out.println("重复行:Done!");
		String strA = String.valueOf(a);		// 重复行
		System.out.println("重复行:strA = " + strA);
	}

	public static void main(String[] args) {
		printSum(10);
		System.out.println();
		printAbs(-5);
	}
}
