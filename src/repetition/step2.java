package repetition;
import java.util.Scanner;

public class step2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
        sc.close();
    }

}
