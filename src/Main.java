import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] arr;
		
		for (int i = 0; i < T; i++) {
			arr = br.readLine().split("");
			int sum = 0, hap = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("O")) {
					sum += hap;
					hap++;
				} else {
					hap = 1;
				}
			}
			System.out.println(sum);
		}
		
		

	} // main
} // Class
