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
		System.out.println("������һ�����ִ���1~1000.");
		System.out.println("�²��ҵ����֣�");
		System.out.println("��������µ����֣�");
		
		for(int i=1;i<=10;i++) {
			Scanner scan = new Scanner(System.in);
			myGuess = scan.nextInt();
			times = i;
			
			if(myGuess == randomNumber) {
				System.out.println("��ϲ��¶��ˣ�");
				success = true;
				break;
			}else {
				if(myGuess > randomNumber) {
					System.out.println("���ˣ��ٲ�һ�Σ�");
				}else {
					System.out.println("���ˣ��ٲ�һ�Σ�");
				}
				leftTimes = 10-i;
				System.out.println("ʣ��"+leftTimes+"��");
			}
			System.out.println("���ٲ�һ�Σ�");
		}
		if(success) {
			System.out.println("�¶��ˣ�����"+times+"��");
		}else {
			System.out.println("��Ǹ����ʧ���ˣ�");
		}
	}
}
