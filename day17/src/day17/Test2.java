package day17;

public class Test2 {
public static void main (String [] args) {
	
	System.out.println("main-start");
try {
int x =10/0;
}
 
catch (ArithmaticException e)
	{
		System.out.println("catch-block-");
		System.out.println("main-end");
}
}
