import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	 while(true){
	     System.out.println("enter the number:");
	    Scanner scn=new Scanner(System.in);
	    int m =scn.nextInt();
	        if(m%4==0){
	        System.out.println("leap year");
	        break;}
	       else{
	            System.out.println("not leap year");
	            break;
	       }
	}
}
}