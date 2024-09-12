import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner a= new Scanner(System.in); 
	   DecimaltoBinary(79);
	}
	static void DecimaltoBinary(int a){
		    String s="";
		    while(a>0){
		        s=s+a%2;
		        a=a/2;
		    }
		    for(int i=s.length()-1;i>=0;i--){
		        System.out.println(s.charAt(i));
		    }
}
}