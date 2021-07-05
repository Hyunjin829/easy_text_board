public class Main {
	
	public static int d(int n) {
		int sum = n;
		
		while(n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		
		return sum;
	}

	public static void main(String[] args) {

		boolean[] check = new boolean[10001];

		for (int i = 1; i < check.length; i++) {
			int n = d(i);

			if (n < check.length) {
				check[n] = true;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < check.length; i++) {
			if (!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);

	} // main
	
} // Class
