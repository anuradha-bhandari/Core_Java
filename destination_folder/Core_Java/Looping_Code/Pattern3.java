import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N Value");
		int n=s.nextInt();
		int temp=n;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=(n+1)-i;j++) 
				{
					System.out.print(temp);
				}
			temp--;
			System.out.println();
		}

	}

}
