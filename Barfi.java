package MVSravya.Mavengift;

public class Barfi implements Total_weight {
	int weight=10;
	int cost_per_piece=20;
	int total;
	@Override
	public int display() {
		return total;
	}

	public int calculate_weight(int bs) {
		return total=bs*weight;
		
	}
	public int calculate(int n) {
		return total=n*cost_per_piece;
	}

}
