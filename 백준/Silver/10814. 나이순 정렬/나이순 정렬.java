import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String args[]) throws IOException{
	   	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   	 
	   	 	int N = Integer.parseInt(br.readLine()); //readline(): 한 줄 입력
	   	 	
	   	 	String[][] arr = new String[N][2];
	   	 	
	   	 	for(int i =  0 ; i < N ; i++) {
	   	 		String[] st = br.readLine().split(" ");
	   	 		arr[i][0] = st[0];
	   	 		arr[i][1] = st[1];
	   	 	}
	   	 	
	   	 	//Arrays.sort()는 정수 배열만 가능, 문자열 배열을 하기 위해서는 compare() 오버라이드해야 함.
	   	 	Arrays.sort(arr, new Comparator<String[]>() {
	   	 		@Override
	   	 		public int compare(String[] s1, String[] s2) {
	   	 		if(s1[0] == s2[0]) { //나이 비교
	   	 			return 0;
	   	 		}else { //나이가 다르면
                    //s1[0]이 더 크다면 위치 변경(나이1 - 나이2 = 양수)
	   	 			return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
	   	 		}
	   	 	}
	   	 	});
	   
	   	 	
	   	 	for(int i = 0; i < N; i++) {
				System.out.println(arr[i][0] +" "+ arr[i][1]);
	   	 		}
	}
}