import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());

		for (int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			int r = 0;

			while (true) {
				arr[r] = Integer.parseInt(st.nextToken());
//				System.out.println(arr[r]);
				r++;
				if (r == N) {
					int sum = 0;
					for (int j = 0; j < arr.length; j++) {
						sum += arr[j];
					}
					System.out.println(sum);
					
					break;
				}
			}
			
			
		}

	} // main
} // Class
