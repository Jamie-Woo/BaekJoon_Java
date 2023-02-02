package oneDimensionalArray;
import java.util.Scanner;

public class step1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //정수의 개수 N
        int n = 0;  //n은 v의 개수
        int arr[] = new int[N];  //배열 선언과 생성
        
        for (int i=0; i<N; i++) {  // 정수들을 배열의 원소로 넣음
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();  //찾으려는 정수 v 입력
        for (int j=0; j<N; j++) {
            if (arr[j] == v) {
                n++;
            }
        }
        System.out.print(n);
        sc.close();
    }

}
