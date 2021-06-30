import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		int max = 0, num = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (max - arr[i] < 0) {
				max = arr[0];
				max = arr[i];
				num  = i+1;
			}
		}
		System.out.println(max);
		System.out.println(num);
	} // main
} // Class
