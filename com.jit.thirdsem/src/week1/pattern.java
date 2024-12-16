package week1;
import java.util.Scanner;
public class pattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the no of rows");
		int rows=scanner.nextInt();
		int num=1;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num+ " ");
				num++;
			}
		System.out.println();
			
		}
		
		
	}

}
