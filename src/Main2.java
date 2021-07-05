import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		int N = 0;
		
		for (int i = 0; i < C; i++) {
			int count = 0;
			int totalScore = 0;
			double avg = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			int[] score = new int[N];
			
			for (int j = 0; j < N; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				totalScore += score[j];
			}
			
			avg = (double)totalScore / (double)N;
			
			for (int j = 0; j < score.length; j++) {
				if (score[j] > avg) {
					count++;
				}
			}
			
			System.out.println(String.format("%.3f", ((double)count/N) * 100) + "%");
			
		}
		
	}
}