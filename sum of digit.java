import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	int sum=0,num=123,ld;
       while(num != 0){
        ld=num%10;
        sum=sum+ld;
         num =num/10;
         
}
System.out.println(sum);
	}
}
