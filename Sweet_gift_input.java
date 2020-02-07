package MVSravya.Mavengift;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Arrays;

public class Sweet_gift_input {
	static public int weight_sweet;
	static public int cost_sweet;
	//int z[]=new int[2];
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> Sweets=new ArrayList<String>();
		Sweets.add("Barfi");
		Sweets.add("Halwa");
		
		int price[]=new int[Sweets.size()];
		Barfi bar=new Barfi();
		Halwa hal=new Halwa();
		
		System.out.println("Enter sweets");
		System.out.println("Enter number of Sweet Barfi");
		int bs=s.nextInt();
		System.out.println("Enter number of Halwa Sweet");
		int hs=s.nextInt();
		
		bar.calculate(bs);
		hal.calculate_c(hs);
		price[0]=bar.display();
		price[1]=hal.display();
		System.out.print("Total weight of sweets is: ");
		weight_sweet=hal.calculate(hs)+bar.calculate_weight(bs);
		System.out.println(weight_sweet+" grams\n");
		
		System.out.print("Total price of sweets is: ");
		cost_sweet=price[0]+price[1];
		System.out.println(cost_sweet+" Rs\n");
		
		
		
	}
}
