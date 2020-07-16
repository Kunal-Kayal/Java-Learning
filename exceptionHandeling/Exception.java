package exceptionHandeling;

public class Exception {

	public static void main(String[] args) {
	fun1();
	
	}
	static void fun1() {
		int a=5;int b=3;
		int c =a/b;
		System.out.println(c);
		try {
		fun2();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+"u got it");
		}
	}
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger is comming");
		}
	}
//		try{int a =9;int b=0;
//		
//		int c = a/b;
//		System.out.println(c);
//		}
////		catch(ArithmeticException e){
////			System.out.println(e.getMessage());
////		}
//		finally {
//			System.out.println("b=0");
//		}
//		System.out.println("Ur code is true");



}
