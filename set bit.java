public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int c=0;
	    while(n>0){
	        if((n & 1 )==1){
	            c++;
	        }
	        n=n>>1;
	        
	    }
		System.out.println(c);
	}
}