import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int flag=1;
	    int i,n=7;
	    System.out.println("enter the number:");
	    Scanner p=new Scanner(System.in);
	    int pr=p.nextInt();
	    for(i=2;i<pr;i++){
	        if(n%i==0){
	            flag=0;
	            break;
	        }
	    }
	    if(flag==1)
	    {
	        System.out.println("prime");
	    }
	    else{
	        System.out.println(" not prime");
	    }
	}
}