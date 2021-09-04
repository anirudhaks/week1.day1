package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int fact = 1;
		for (int num = 1; num <= i; num++) {
			fact = fact*num;		
		}
		System.out.println(fact);
	}

}
