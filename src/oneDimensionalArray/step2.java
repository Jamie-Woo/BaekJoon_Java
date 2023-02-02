package oneDimensionalArray;
import java.util.Scanner;

public class step2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  //정수 N개
        int arr[] = new int[N];   //배열 선언과 생성
        int X = sc.nextInt();
        
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();   //배열에 원소 입력
        }
        for (int j=0; j<N; j++) {
            if (arr[j] < X) {    //X보다 작은 수 출력
                System.out.print(arr[j] + " ");
            }
        }
        sc.close();
    }

}
