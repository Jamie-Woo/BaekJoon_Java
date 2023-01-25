package repetition;
import java.util.Scanner;

public class step4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();   //총 금액
        int N = sc.nextInt();   //종류의 수
        int sum = 0;
        for (int i=0; i<N; i++) {   //각 가격과 개수 곱하여 합 구하기
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }
        
        if (sum == X) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
        sc.close();
    }

}
