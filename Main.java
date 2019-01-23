package se;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static double distance(int x1, int x2, int y1, int y2)
	{
		int x=x1-x2;
		int y=y1-y2;
		double d=Math.sqrt(x*x+y*y);
		return d;
	}

	public static void main(String[] args)throws IOException {
		
		int a[]={100, 0, 90, 21};
		int b[]={0, 100, 17, 80};
		String c[]={"Action", "Comedy", "Action", "Comedy"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of action and comedy sequences");
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		double m=distance(a[0], x, b[0], y);
		int min=0;
		for(int i=1;i<a.length;i++)
		{
			double k=distance(a[i], x, b[i], y);
			if(k<m)
			{
				m=k;
				min=i;
			}
			
		}
		
		System.out.println("Genre for x="+x+" y="+y+" is "+c[min]);

	}

}
/*Output:
Enter no. of action and comedy sequences
90
10
Genre for x=90 y=10 is Action 
*/
