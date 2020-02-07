package MVSravya.Mavengift;

public class Halwa implements Total_weight {
		int weight=10;
			int cost_per_piece=10;
			int total;
			@Override
			public int display() {
				return total;
			}

			public int calculate(int hs) {
				return total=hs*weight;
				
			}
			public int calculate_c(int n) {
				return total=n*cost_per_piece;
			}
	}


