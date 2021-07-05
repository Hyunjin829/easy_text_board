public class Test {

	public static void main(String[] args) {
		
		int n = 1457;
		int n1 = (n/1)%10;
		int n10 = (n/10)%10; 
		int n100 = (n/100)%10; 
		int n1000 = (n/1000)%10; 
		
		for (int i = 1; i < 10000; i *= 10) {
			System.out.println(i);
		}
		
		System.out.println(n1);
		System.out.println(n10);
		System.out.println(n100);
		System.out.println(n1000);

	}

}
