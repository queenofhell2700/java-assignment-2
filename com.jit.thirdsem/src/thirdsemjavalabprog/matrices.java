package thirdsemjavalabprog;
import java.util.Scanner;
public class matrices {
	public static void main(String[] args) {
		int i=0, j=0, m1, n1, m2, n2;
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int c[][]=new int[5][5]; 
		Scanner r= new Scanner(System.in);
		//first matrix
		System.out.println("enter size of matrix\n");
		m1=r.nextInt();
		n1=r.nextInt();
		System.out.println("enter size of second matrix\n");
		m2=r.nextInt();
		n2=r.nextInt();
		if(m1!=m2||n1!=n2) {
			System.out.println("matrix size wrong, addition not possible");
		}
		else
		{
			System.out.println("enter first matrix data");
			for(i=0; i<m1; i++)
			{
				for(j=0; j<n1; j++) {
					a[i][j]=r.nextInt();
				}
			}
			System.out.println("enter second matrix data");
			for(i=0;i<m2;i++) {
				for(j=0; j<n2; j++) {
					b[i][j]=r.nextInt();
				}
			}
		}
		System.out.println("sum of two matrix");
		for(i=0; i<m1; i++) {
			for(j=0; j<n1; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
