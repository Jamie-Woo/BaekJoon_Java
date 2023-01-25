package conditionalStatement;
import java.util.Scanner;

public class step7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        
        if ((a==b) && (b==c)) {      //같은 눈이 3개인 경우
            System.out.print(10000 + a*1000);
        }
        else if ((a==b) && (b!=c)) {   //같은 눈이 2개인 경우(1)
            System.out.print(1000 + a*100);
        }
        else if ((b==c) && (c!=a)) {    //같은 눈이 2개인 경우(2)
            System.out.print(1000 + b*100);
        }
        else if ((c==a) && (a!=b)) {     //같은 눈이 2개인 경우(3)
            System.out.print(1000 + c*100);
        }
        else {       //모두 다른 눈이 나오는 경우
            if (a>b) {
                if (c>a) {
                    max = c;
                }
                else {
                    max = a;
                }
            }
            else {
                if (c>b) {
                    max = c;
                }
                else {
                    max = b;
                }
            }
            System.out.print(max*100);
        }
        sc.close();
    }

}
