package week1;

public class PicturePrice {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("������ͼƬ�ĳ���(��Ӣ��Ϊ��λ):");
		double Length = s.nextDouble();
		System.out.print("������ͼƬ�Ŀ��(��Ӣ��Ϊ��λ):");
		double Weight = s.nextDouble();
		System.out.print("������������(1����ͨ���2���������):");
		int Frame = s.nextInt();
		System.out.print("��ѡ�������ɫ(�κ���ɫ):");
		String colour = s.next();
		System.out.print("��ѡ���Ƿ��������(���������������0����������������������):");
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
		
		System.out.print("�����ɫΪ"+ colour + "�����ɱ�Ϊ" + price + "��Ԫ");
	}
}
