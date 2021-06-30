import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int x = A * B * C;
		int arr[] = new int[10];
		for (int i = 1; x / i != 0; i = i * 10) {
			for (int j = 0; j < 10; j++) {
				if ((x / i) % 10 == j) {
					arr[j] += 1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	} // main
} // Class
