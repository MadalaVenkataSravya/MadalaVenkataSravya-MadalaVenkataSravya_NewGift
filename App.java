package MVSravya.Mavengift;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
/**public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}*/
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Maximum Price of the Gift");
        int mp=s.nextInt();
        ArrayList<String> Candies=new ArrayList<String>();
        ArrayList<String> Chocolates=new ArrayList<String>();
        Candies.add("Greencandy");
        Candies.add("Redcandy");
        Chocolates.add("Munch");
        Chocolates.add("Kitkat");
        
        
        System.out.println("Candies in the Gift Pack \n");
        Candies_gift_input.main(args);
        
        System.out.println("Sweets in the Gift Pack\n");
        Sweet_gift_input.main(args);
        
        System.out.println("Choclates in the Gift Pack\n");
        Chocolate_gift_input.main(args);
        
       
        
        int total_weight=0;
        total_weight=Sweet_gift_input.weight_sweet+Candies_gift_input.Candies_gift_weight+Chocolate_gift_input.total_choco_weight;
        System.out.println("Total weight of the New Year Gift is"+total_weight+"Gms");
        
        int total_price=0;
        total_price=Sweet_gift_input.cost_sweet+Candies_gift_input.Candies_gift_price+Chocolate_gift_input.total_choco_cost;
        if(mp<total_price) {
        	System.out.println("Gift price more than expected. Please get within range of the Price");
    }
    }
}
