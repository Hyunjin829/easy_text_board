import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		M = M - 45;
		
		if(M<0) {
			H = H -1;
			M = M + 60;
			if(H<0) {
				H = H + 24;
			}
		}
		
//		if (H<0 || M<0) {
//			if (H<0 && M>0) {
//				H = H + 24;
//			} else if (H>0 && M<0) {
//				M = M + 60;
//			} else {
//				H = H + 24;
//				M = M + 60;
//			}
//		}
//		
		System.out.printf("%d %d", H, M);
		
	} // main
} // Class
