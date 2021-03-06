package week1;

public class PicturePrice {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("请输入图片的长度(以英寸为单位):");
		double Length = s.nextDouble();
		System.out.print("请输入图片的宽度(以英寸为单位):");
		double Weight = s.nextDouble();
		System.out.print("请输入框架类型(1、普通相框。2、别致相框):");
		int Frame = s.nextInt();
		System.out.print("请选择相框颜色(任何颜色):");
		String colour = s.next();
		System.out.print("请选择是否佩戴王冠(不佩戴王冠请输入0，佩戴王冠请输入具体数量):");
		double crown = s.nextInt();
		
		double price;
		double ColourCost = 0.1;
		double RegularCost = 0.15;
		double FancyCost = 0.25;
		double CardboardCost = 0.02;
		double GlassCost = 0.07;
		double CrownCost = 0.35;
		
		if(Frame == 1) {
			price = 2*(Length + Weight)*(ColourCost + RegularCost) + Length*Weight*(CardboardCost + GlassCost) + crown*CrownCost;
		}else {
			price = 2*(Length + Weight)*(ColourCost + FancyCost) + Length*Weight*(CardboardCost + GlassCost) + crown*CrownCost;
		}
		
		System.out.print("相框颜色为"+ colour + "，相框成本为" + price + "美元");
	}
}
