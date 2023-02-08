package oneDimensionalArray;
import java.util.Scanner;

public class step6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  //과목의 개수 N
        double max = 0;
        double sum = 0;
        
        double arr[] = new double[N];  //배열 선언생성
        for (int i=0; i<N; i++) {   //배열에 입력된 수 넣기
            arr[i] = sc.nextDouble();
        }
        sc.close();
        for (int j=0; j<N; j++) {   //최댓값 구하기
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        for (int k=0; k<N; k++) {   //배열에 새로운 점수 넣기
            arr[k] = arr[k]/max*100;
            sum += arr[k];
        }
        System.out.print(sum/N);   //새로운 점수들의 평균 구하기
        sc.close();
    }

}
