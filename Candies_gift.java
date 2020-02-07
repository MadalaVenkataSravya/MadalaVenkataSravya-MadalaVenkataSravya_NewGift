package MVSravya.Mavengift;

public class Candies_gift extends App {
    int totalquantity;
	static int range=70;
}
class Greencandy extends Candies_gift{
	int green_candy_weight = 5;
	int price = 10;
	public void totalquantity(int n) {
		totalquantity=n;
	}
	public int candyweight(int n) {
		return green_candy_weight*n;
	}
	public int candyprice(int n) {
		return price*n;
	}
	public int display() {
		return totalquantity;
	}
}

class Redcandy extends Candies_gift{
	int red_candy_weight = 10;
	int price = 5;
	public void totalquantity(int n) {
		totalquantity=n;	
	}
	public int candyweight(int n) {
		return red_candy_weight*n;
	}
	public int candyprice(int n) {
		return price*n;
	}
	public int display() {
		return totalquantity;
	}
}