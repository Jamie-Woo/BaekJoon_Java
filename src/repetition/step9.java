package repetition;
import java.util.Scanner;

public class step9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=(N-i); j++) {   //띄어쓰기 반복
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {   //* 반복
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
