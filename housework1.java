package housework01

import java.util.Scanner;

public class housework1 {
	public static void main(String[] args) {
java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("请输入价格(按美元来计算):");
		double price = s.nextDouble();
		
		int Dollars;
		int OneDollars;
		int TwoDollars;
		int FiftyCoins;
		int TwentyCoins;
		int TenCoins;
		int FiveCoins;
		int p = (int)(price*100);
		int m = p % 100;
		int n = m % 50;
		int a = n % 20;
		int b = a % 10;
		
		Dollars = p / 100;
		OneDollars = Dollars % 2;
		TwoDollars = Dollars / 2;
		FiftyCoins = m / 50;
		TwentyCoins = n / 20;
		TenCoins = a / 10;
		FiveCoins = b / 5;

		System.out.println("需要" + Dollars + "美元。" + "其中" + "一美元硬币"+ OneDollars +"个，" + "二美元硬币"+TwoDollars +"个。");
		System.out.println("需要50美分硬币" + FiftyCoins + "个");
		System.out.println("需要20美分硬币" + TwentyCoins + "个");
		System.out.println("需要10美分硬币" + TenCoins + "个");
		if(FiveCoins == 0) {
			System.out.println("不需要5美分硬币。" + "还剩" + FiveCoins + "美分");
		}else {
			System.out.println("需要5美分硬币" + FiveCoins +"个");
		}
	}
}
