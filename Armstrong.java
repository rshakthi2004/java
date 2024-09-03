import java .util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner a =new Scanner(System.in);
	    int n=a.nextInt();
	int nn=n;
		int lastdigit,result=0;
		while(n!=0) 
		{
		    int h=String.valueOf(nn).length();
		    lastdigit=n%10;
		    result+= (int)Math.pow(lastdigit,h);
		    n=n/10;
		}
			System.out.println(result);
			if(nn==result)
			System.out.println("Amstrong");
			else 
			System.out.println("not a amstrong");
			
	}
}