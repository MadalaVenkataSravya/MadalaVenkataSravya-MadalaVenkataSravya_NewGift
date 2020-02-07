package MVSravya.Mavengift;
import java.util.Scanner;
import java.util.Arrays;
public class Candies_gift_input {
	public static int Candies_gift_weight=1;
	public static int Candies_gift_price=1;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		int x[]=new int[2];
		String candy_names[]= new String[2];
		candy_names[0]="Greencandy";
		candy_names[1]="Redcandy";
		Scanner sc = new Scanner(System.in);
		System.out.println("Maximum number of Candies: " + Candies_gift.range);
    	Greencandy g_can = new Greencandy();
    	Redcandy r_can = new Redcandy();
    	System.out.println("Enter Total Quantities of Greencandy");
    	g_can.totalquantity(sc.nextInt());
    	System.out.println("Enter Total Quantities of Redcandy");
    	r_can.totalquantity(sc.nextInt());
    	if(g_can.totalquantity+r_can.totalquantity<=Candies_gift.range) {
    	System.out.println("Options:\n1.Total_Quantity\n2.Total Candies_gift");
    	int k = sc.nextInt();
    	if(k==1) {
    		System.out.println("Candies in a sorted order:");
    		//int qun = sc.nextInt();
    		x[0]=g_can.display();
    		x[1]=r_can.display();
    		for(int i=0;i<2;i++) {
    			for(int j=i+1;j<2;j++) {
    				if(x[i]>x[j]) {
    					int temp=x[i];
    					x[i]=x[j];
    					x[j]=temp;
    					String temp2=candy_names[i];
    					candy_names[i]=candy_names[j];
    					candy_names[j]=temp2;
    				}
    			}
    		}
    		System.out.println(candy_names[0]+" "+candy_names[1]);
    		System.out.println(x[0]+" "+x[1]);
    		//if(g_can.display()>=r_can.display()) {
    	//		System.out.println("Greencandy are in range of "+qun);
    			//System.out.println("No of Greencandys are : "+g_can.display());
    		//}
    		//else {
    	//		System.out.println("Redcandy are in range of "+qun);
    			//System.out.println("Number of Redcandy are : "+r_can.display());
    		//}
    		
    	}
    	else if(k==2) {
        	int total_range = g_can.display()+r_can.display();
        	if(total_range<=Candies_gift.range) {
        		System.out.println("Candies are with in range");
            	System.out.println("Total number of Candies in the New Year gift present are : " + total_range);
        	}
        	else {
        		System.out.println("Candies are not in range");
        	}
    	}
    	else {
    		System.out.println("Enter Valid input");
    		return;
    	}
    	Candies_gift_weight = r_can.candyweight(r_can.totalquantity)+g_can.candyweight(g_can.totalquantity);
    	System.out.println("Total weight of Candies: "+Candies_gift_weight+" grms\n");
    	
    	Candies_gift_price = r_can.candyprice(r_can.totalquantity) + g_can.candyprice(g_can.totalquantity);
    	System.out.println("Total price of Candies: "+Candies_gift_price+" Rs.\n");
    	}
    	else {
    		System.out.println("Candies are out of range");
    		return;
    	}
	}

}
