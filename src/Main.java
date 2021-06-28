import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String arr[] = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int X = Integer.parseInt(arr[1]);
		arr = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int Y = Integer.parseInt(arr[i]);
			if(Y < X)
				bw.write(Y + " ");
			
		}
		
		br.close();
		bw.close();
		
		
	} // main
} // Class
