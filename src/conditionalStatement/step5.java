package conditionalStatement;
import java.util.Scanner;

public class step5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        int h = 0;
        int m = 0;
        
        if (M >= 45) {
            m = M - 45;
            h = H;
        }
        else {
            if (H != 0) {
                m = 60 - (45 - M);
                h = H - 1;
            }
            else {
                m = 60 - (45 - M);
                h = 23;
            }
        }
        System.out.print(h + " " + m);
        sc.close();
    }

}
