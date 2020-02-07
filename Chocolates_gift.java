package MVSravya.Mavengift;

public class Chocolates_gift {
      int quantity;
      int cost;
      
}
class Munch extends Chocolates_gift{
	int MunchWeight = 50;
	public void t_quantity(int n) {
		quantity=n;
	}
	public int total_weight(int n) {
		return MunchWeight*n;
	}
	public int total_cost(int n) {
		return cost*n;
	}
	public int display() {
		return quantity;
	}
}

class Kitkat extends Chocolates_gift{
	int KitkatWeight = 30;
	public void t_quantity(int n) {
		quantity=n;
	}
	public int total_weight(int n) {
		return KitkatWeight*n;
	}
	public int total_cost(int n) {
		return cost*n;
	}
	public int display() {
		return quantity;
	}
}