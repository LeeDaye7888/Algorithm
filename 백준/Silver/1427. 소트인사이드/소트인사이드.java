import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.next(); // 한줄이나 한칸씩 띄어진게 아닌, 공백없이 입력하기 때문에 문자열로
		String[] str = N.split(""); //입력에서 공백없는 수라면, split으로 쪼개기
		int arr[] = new int[str.length];

        // arr 배열에 값 삽입
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

        //숫자를 작은수부터 정렬(작은 수부터 정렬/큰 수부터 정렬은 Arrays.sort() 사용)
		Arrays.sort(arr);

         //작은 수부터 정렬된 문자열을 거꾸로 뒤집기
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}