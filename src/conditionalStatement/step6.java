package conditionalStatement;
import java.util.Scanner;

public class step6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = sc.nextInt();
        int h = 0;
        int m = 0;
        
        if(time >= (60-M)) {
            h = H + (time - (60-M))/60 + 1;
            m = (time - (60-M))%60;
            if (h >= 24) {
                h = h-24;
            }
        }
        else {
            h = H;
            m = M + time;
        }
        System.out.print(h + " " + m);
        sc.close();
    }

}
