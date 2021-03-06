package week2;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int randomNumber;
		int myGuess;
		boolean success = false;
		int times = 0;
		int leftTimes;
		
		randomNumber = (int)(Math.random() * 1000);
		System.out.println(randomNumber);
		System.out.println("现在有一个数字处于1~1000.");
		System.out.println("猜猜我的数字！");
		System.out.println("请输入你猜的数字：");
		
		for(int i=1;i<=10;i++) {
			Scanner scan = new Scanner(System.in);
			myGuess = scan.nextInt();
			times = i;
			
			if(myGuess == randomNumber) {
				System.out.println("恭喜你猜对了！");
				success = true;
				break;
			}else {
				if(myGuess > randomNumber) {
					System.out.println("高了！再猜一次！");
				}else {
					System.out.println("低了！再猜一次！");
				}
				leftTimes = 10-i;
				System.out.println("剩余"+leftTimes+"次");
			}
			System.out.println("请再猜一次！");
		}
		if(success) {
			System.out.println("猜对了！猜了"+times+"次");
		}else {
			System.out.println("抱歉！你失败了！");
		}
	}
}
