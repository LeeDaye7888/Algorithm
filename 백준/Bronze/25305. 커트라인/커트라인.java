import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =  new StringTokenizer(br.readLine()); //첫번째 줄 입력받기

        int N = Integer.parseInt(st.nextToken()); //응시자수
        int k = Integer.parseInt(st.nextToken()); //상받는 사람 수

        Integer[] score = new Integer[N];

        st =  new StringTokenizer(br.readLine()); // 두번째줄 입력 받기 위해

        for(int i = 0; i < N; i++) { // 점수 5개 받기
            score[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(score, Collections.reverseOrder());
        bw.write(score[k-1]+"");
        bw.flush();
        bw.close();

    }
}