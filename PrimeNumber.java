package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("Prime");
		else
			System.out.println("Not a Prime");
	}

}
