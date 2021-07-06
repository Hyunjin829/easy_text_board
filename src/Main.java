import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static boolean chk(int n) {
		String number = Integer.toString(n);
		int[] arr = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			arr[i] = Integer.parseInt(number.charAt(i) + "");
		}
		int i=number.length();
		boolean ans = false;
		while (true) {
			if (i <= 2) {
				ans = true;
			} else {
				ans = (arr[i-1]-arr[i-2])==(arr[i-2]-arr[i-3]) ? true : false;
				i--;
			}
			if (i - 3 < 0)
				break;
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		boolean[] check = new boolean[Integer.parseInt(n)];
		int sum = 0;

		for (int i = 0; i < Integer.parseInt(n); i++) {
			check[i] = chk(i+1);
			if (check[i]) {
				sum++;
			}
		}
		System.out.println(sum);

	} // main

} // Class
