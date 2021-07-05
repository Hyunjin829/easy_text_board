import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()); // 테스트케이스 입력
		StringTokenizer st;
		int N, r, sum;
		int[] arr;
		double avg;
		double[] high;

		for (int i = 0; i < C; i++) { // C까지 반복(0~4)

			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken()); // 점수 수 N 입력
			arr = new int[N];
			high = new double[C];

			r = 0;
			while (true) {
				arr[r] = Integer.parseInt(st.nextToken());
				r++;
				sum = 0;

				if (r == N) {
					for (int j = 0; j < N; j++) {
						sum += arr[j];
					}
					avg = sum / N;
					for (int j = 0; j < N; j++) {
						if (arr[j] > avg) {
							high[i]++;
						} // 평균 이상 인원 덧셈
					}
					break;
				} // N만큼 입력받은 후 입력 종료
			} // N개의 점수 받기
			System.out.println(String.format("%.3f", (high[i] / N) * 100) + "%");
		} // for

	} // main
} // Class
