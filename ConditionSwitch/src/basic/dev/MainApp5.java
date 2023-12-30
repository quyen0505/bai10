package basic.dev;

import java.util.Scanner;

public class MainApp5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập cạnh a: ");
		int a = sc.nextInt();

		System.out.print("Nhập cạnh b: ");
		int b = sc.nextInt();

		System.out.print("Nhập cạnh c: ");
		int c = sc.nextInt();

		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Cạnh của tam giác phải là số dương");
		} else if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
			System.out.println("3 cạnh không lập thành tam giác");
		} else {
			System.out.println("3 cạnh lập thành tam giác");
		}

	}

}
