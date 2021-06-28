import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int x = 1; x < T+1; x++) {
			bw.write("Case #" + x + ": ");
			
			st = new StringTokenizer(br.readLine());
			bw.write( String.valueOf(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ));
			bw.newLine();
		}
		
		br.close();
		bw.close();
		
	} // main
} // Class
