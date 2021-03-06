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
				default:System.out.println("输入错误！！！重新选择！！！");
			}
			choose = menu();
		}
		
		System.out.println("谢谢使用，再见！");
	}
	
	public static int menu(){
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("=============TEST=============");
		System.out.println("  1. 输入两个整数(第一个必须小于第二个)	");
		System.out.println("  2. 输出两个数之间的所有奇数	");
		System.out.println("  3. 输出两个数之间所有偶数的和	");
		System.out.println("  4. 输出1到10之间的所有数字及其平方	");
		System.out.println("  5. 输出两个数之间所有奇数的平方和	");
		System.out.println("  6. Exit	");
		System.out.print("please input your choose(1-6):");
		
		int choose = s.nextInt();
		return choose;
	}
	
	public static void Input(){
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("请输入第一个整数:");
		int first = s.nextInt();
		System.out.print("请输入第二个整数:");
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
		
		System.out.println("输入成功！");
	}
	
	public static void JiNumber(){
		if(number == null){
			System.out.println("请先进行功能1 ！！！");
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
			System.out.println("请先进行功能1 ！！！");
			return 0;
		}
		int sum = 0;
		for(int i = 0;i < number.length;i++)
		{
			if(number[i] % 2 == 0)
				sum += number[i];
		}
		
		System.out.println("所有偶数的和为" + sum);
		return sum;
	}
	
	public static void PowSum(){
		if(number == null){
			System.out.println("请先进行功能1 ！！！");
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
			System.out.println("请先进行功能1 ！！！");
			return;
		}
		int sum = 0;
		for(int i = 1;i < number.length;i++)
		{
			if(number[i] % 2 != 0)
				sum += number[i] * number[i];
		}
		
		System.out.println("所有奇数的平方和为：" + sum);
	}

}
