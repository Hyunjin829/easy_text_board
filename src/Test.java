public class Test {

	public static void main(String[] args) {
		int n = 1492;
		int sum = n;
		
		while(n != 0) {
			sum += n % 10;
			System.out.println("sum" + sum);
			n = n / 10;
			System.out.println("n" + n);
		}
		
		System.out.println(sum);;

	}

}
