import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner a= new Scanner(System.in); 
	   int c=Binary(1010);
	   System.out.println(c);
	}
	
	static int Binary(int a){
		    int sum=0;
		    int p=1;
		    while(a>0){
		        int d=a%10;
		        a=a/10;
		        sum=sum+(d*p);
		        p=p*2;
		    }
		    return sum;
		}
}