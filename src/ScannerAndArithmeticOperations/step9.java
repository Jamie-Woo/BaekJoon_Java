package ScannerAndArithmeticOperations;
import java.util.Scanner;

public class step9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int King = sc.nextInt();
        int Queen = sc.nextInt();
        int Rook= sc.nextInt();
        int Bishop = sc.nextInt();
        int Knight = sc.nextInt();
        int Pawn = sc.nextInt();
        
        System.out.print(1 - King + " ");
        System.out.print(1 - Queen + " ");
        System.out.print(2 - Rook + " ");
        System.out.print(2 - Bishop + " ");
        System.out.print(2 - Knight + " ");
        System.out.print(8 - Pawn);
        sc.close();
    }
}
