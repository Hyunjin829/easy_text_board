import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 1; i < n+1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i-1] = a + b;
		}
		for(int number : arr) {
			System.out.println(number);
		}
		sc.close();
		
	} // main
} // Class
