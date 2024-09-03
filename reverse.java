import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	int reverse=0,num=123,ld;
       while(num != 0){
        ld=num%10;
        reverse=reverse*10+ld;
         num =num/10;
         
}
System.out.println(reverse);
	}
}
