package oneDimensionalArray;
import java.util.Scanner;
import java.util.HashSet;

public class step5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>(); //메소드에서 값을 넣을 때 중복되어 저장되면 false 반환
        
        for (int i=0; i<10; i++) {
            h.add(sc.nextInt() % 42);   //입력받은 수의 나머지를 HashSet에 저장
        }
        sc.close();
        System.out.print(h.size());   //저장되어 있는 원소의 개수 반환
    }

}
