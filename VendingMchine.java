package week1;

public class VendingMchine {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
				
				System.out.print("������۸�(����Ԫ������):");
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

				System.out.println("��Ҫ" + Dollars + "��Ԫ��" + "����" + "һ��ԪӲ��"+ OneDollars +"����" + "����ԪӲ��"+TwoDollars +"����");
				System.out.println("��Ҫ50����Ӳ��" + FiftyCoins + "��");
				System.out.println("��Ҫ20����Ӳ��" + TwentyCoins + "��");
				System.out.println("��Ҫ10����Ӳ��" + TenCoins + "��");
				if(FiveCoins == 0) {
					System.out.println("����Ҫ5����Ӳ�ҡ�" + "��ʣ" + FiveCoins + "����");
				}else {
					System.out.println("��Ҫ5����Ӳ��" + FiveCoins +"��");
				}
			}
}

