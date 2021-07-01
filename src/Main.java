import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int num = 10;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					num--;
					break;
				}
			}
		}
		System.out.println(num);

	} // main
} // Class
