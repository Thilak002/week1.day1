package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int input = 8;
		int firstNum = 0;
		int secondNum = 1;
		int sum;
		System.out.println("Input =" +input);
		System.out.println(firstNum);
		for(int i=1; i<=input; i++)
		{
			sum = firstNum + secondNum;
			System.out.println(sum);
			firstNum = secondNum;
			secondNum = sum;
			
		}
	}

}
