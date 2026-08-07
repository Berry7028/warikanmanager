package warikanmanager;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("人数を入力してください");
		int count = scanner.nextInt();

		System.out.println("合計金額を入力してください");
		int totalAmount = scanner.nextInt();

		System.out.println("一人当たりの支払い金額は" + Calc.calc(count, totalAmount));
	}
}
