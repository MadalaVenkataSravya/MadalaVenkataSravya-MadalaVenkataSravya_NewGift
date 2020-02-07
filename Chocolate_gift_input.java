package MVSravya.Mavengift;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_gift_input {
	public static int total_choco_weight = 0;
	public static int total_choco_cost = 0;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
    	Munch m = new Munch();
    	Kitkat kit = new Kitkat();
    	
    	System.out.println("Enter the quantity of Munch: ");
    	int qm = sc.nextInt();
    	
    	System.out.println("Enter the size of Munch");
    	m.t_quantity(sc.nextInt());
    	
    	System.out.println("Enter the cost of Munch: ");
    	m.cost = sc.nextInt();
    	
    	System.out.println("Enter the quantity of Kitkat: ");
    	int qk = sc.nextInt();
    	
    	System.out.println("Enter the size of Kitkat");
    	kit.t_quantity(sc.nextInt());
    	
    	
    	System.out.println("Enter the cost of Kitkat: ");
    	kit.cost = sc.nextInt();
    	
    	
    	System.out.println("Enter the option for chocolates to be sorted ");
    	System.out.println("1.Quantity\n2.Name_of_chocolate\nEnter your choice: ");
    	int option = sc.nextInt();
    	int dm = m.display();
    	int ss = kit.display();
    	ArrayList<String> ch = new ArrayList<String>();
    	if(option==1) {
    		if(dm>ss){
        		ch.add("Munch");
        		ch.add("Kitkat");
        	}
        	else{
        		ch.add("Kitkat");
        		ch.add("Munch");
        	}
        	System.out.println(ch+"\n\n");
    	}
    	else if(option==2) {
    		ch.add("Kitkat");
    		ch.add("Munch");
    		Collections.sort(ch);
    		System.out.println(ch);
    	}
    	else {
    		System.out.println("Invalid Input! Enter valid Input");
    		return;
    	}
    	
    	total_choco_weight = m.total_weight(qm) + kit.total_weight(qk);
    	System.out.println(total_choco_weight +" Grms");
    	
    	total_choco_cost = m.total_cost(qm) + kit.total_cost(qk);
    	System.out.println(total_choco_cost +" Rs.");
	}
}
