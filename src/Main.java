import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		String A = br.readLine();
		String arr[] = A.split(" ");
		br.close();

		int max = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			if (max - Integer.parseInt(arr[i]) < 0) {
				max = Integer.parseInt(arr[i]);
			}
			if (min - Integer.parseInt(arr[i]) > 0) {
				min = Integer.parseInt(arr[i]);
			}
		}
		System.out.println(min + " " + max);

	} // main
} // Class
