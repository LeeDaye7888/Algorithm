import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];		// 입력한 값을 담을 배열 생성 
		int sum = 0;
        
        for(int i=0; i<5; i++) {
            int num = sc.nextInt();
            arr[i] += num; //배열에 숫자 삽입
            sum += num;
        }
        //평균값 구하기
        int avg = 0;
        avg = sum/5;
        System.out.println(avg);
        
        //중앙값 구하기
        int center = 0;
        Arrays.sort(arr); // 10 30 30 40 60
        center = arr[2];
        System.out.println(center);
        
        sc.close();
	}
}