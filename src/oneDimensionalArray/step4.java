package oneDimensionalArray;
import java.util.Scanner;

public class step4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int index = 0;
        int arr[]  = new int[9];  //배열 선언과 생성
        for (int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
            if ( arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        sc.close();
        System.out.println(max);
        System.out.print(index);
    }

}
