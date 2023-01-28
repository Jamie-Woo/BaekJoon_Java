package repetition;
import java.util.Scanner;

public class step10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {     //while 소문자 주의
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if ((A==0)&&(B==0)) {
                break;
            }
            System.out.println(A + B);
        }
        sc.close();
    }

}
