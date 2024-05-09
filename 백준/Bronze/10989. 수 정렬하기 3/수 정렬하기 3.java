import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //br은 줄 넘어가며 입력받는 것이고, st는 같은 한 줄에 입력받음 

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        
        Arrays.sort(arr);
        
        //출력
        for(int i=0; i<N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}