package repetition;
import java.util.Scanner;

public class step12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();   //주어진 정수 N
        int M = N;
        int n = 0;  //사이클 길이
        
        while (true) {
            M = (M%10)*10 + ((M/10) + (M%10))%10;  //규칙
            n++;
            if (M==N) {
                break;
            }
        }
        System.out.print(n);
        sc.close();
    }

}
