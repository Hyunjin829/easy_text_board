import java.io.IOException;

public class Main {

	public static int d(int n) {
		int ans = n;
		
		for (int i = 1; i < 10000; i *= 10) {
			ans += (n/i)%10;
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {

		int a = 1;
		int b = d(a);
		
		while (b<10000) {
			b = d(b);
			System.out.println(b);
		}

	} // main
} // Class
