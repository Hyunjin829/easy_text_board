import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = N;
		int count = 0;

		if (N < 10) {
			N *= 10;
			M = N;
		}
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
			if (M == N) {
				break;
			}
		}
		System.out.println(count);

	} // main
} // Class
