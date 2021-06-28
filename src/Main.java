import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i < N+1; i++) {
			for (int j = N; j != i; j--) {
				System.out.print(" ");
			}
			for (int x = 0; x < i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	} // main
} // Class
