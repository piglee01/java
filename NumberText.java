package week3;

public class NumberText {
	public static int number[];
	
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		int choose = menu();
		while(choose != 6){
			switch(choose){
				case 1:Input();break;
				case 2:JiNumber();break;
				case 3:OuSum();break;
				case 4:PowSum();break;
				case 5:JiPowSum();break;
				default:System.out.println("������󣡣�������ѡ�񣡣���");
			}
			choose = menu();
		}
		
		System.out.println("ллʹ�ã��ټ���");
	}
	
	public static int menu(){
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("=============TEST=============");
		System.out.println("  1. ������������(��һ������С�ڵڶ���)	");
		System.out.println("  2. ���������֮�����������	");
		System.out.println("  3. ���������֮������ż���ĺ�	");
		System.out.println("  4. ���1��10֮����������ּ���ƽ��	");
		System.out.println("  5. ���������֮������������ƽ����	");
		System.out.println("  6. Exit	");
		System.out.print("please input your choose(1-6):");
		
		int choose = s.nextInt();
		return choose;
	}
	
	public static void Input(){
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("�������һ������:");
		int first = s.nextInt();
		System.out.print("������ڶ�������:");
		int second = s.nextInt();
		int m = second - first + 1;
		number = new int[m];
		while(first <= second){
			for(int i = 0;i < m;i++)
			{
				number[i] = first;
				first = first + 1;
			}
		}
		
		System.out.println("����ɹ���");
	}
	
	public static void JiNumber(){
		if(number == null){
			System.out.println("���Ƚ��й���1 ������");
			return;
		}
		for(int i = 0;i < number.length;i++)
		{
			if(number[i] % 2 != 0)
				System.out.println(number[i]);
		}
	}
	
	public static int OuSum(){
		if(number == null){
			System.out.println("���Ƚ��й���1 ������");
			return 0;
		}
		int sum = 0;
		for(int i = 0;i < number.length;i++)
		{
			if(number[i] % 2 == 0)
				sum += number[i];
		}
		
		System.out.println("����ż���ĺ�Ϊ" + sum);
		return sum;
	}
	
	public static void PowSum(){
		if(number == null){
			System.out.println("���Ƚ��й���1 ������");
			return;
		}
		for(int i = 1;i <= 10;i++)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		for(int i = 1;i <= 10;i++)
		{
			System.out.print(i*i);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void JiPowSum(){
		if(number == null){
			System.out.println("���Ƚ��й���1 ������");
			return;
		}
		int sum = 0;
		for(int i = 1;i < number.length;i++)
		{
			if(number[i] % 2 != 0)
				sum += number[i] * number[i];
		}
		
		System.out.println("����������ƽ����Ϊ��" + sum);
	}

}
