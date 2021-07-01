import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		int max;
		double sum;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		max = arr[N - 1];
		sum = 0;
		
		for (int i = 0; i < N; i++) {
//			System.out.println(arr[i]);
//			System.out.println(((double)arr[i] / (double)max) * 100);
			sum += ((double)arr[i] / (double)max) * 100;
//			System.out.println("sum: "+sum);
		}
		System.out.println(sum/(double)N);


	} // main
} // Class
