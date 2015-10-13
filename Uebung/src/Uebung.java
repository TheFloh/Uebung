
public class Uebung {


	
	static int fac(int i){ 
		return i==0?1:i*fac(i-1);
	}
		
public static void main(String[] args) {
	System.out.println("fac(2) = "+fac(2));
	System.out.println(fibonacci(8));
    collatz(244444445);
}
	
static void fibfolge(long max){
	for(long i =0; i<=max;i++){
		if(i==max){System.out.println(fibonacci(i));}
		else{System.out.print(fibonacci(i)+", ");}
	}
}	

static long fibonacci(long i){
	if(i<=0){return 0;}
	else {
		if(i==1 || i==2){return 1;}
		else {
			return(fibonacci(i-2)+fibonacci(i-1));}
		
		}
	}


static void collatz(long n){
while (n>1){
	if (n%2==0) {n=n/2;}
	else{n=3*n+1;}
System.out.println(n);
}}
}





	
	
	

