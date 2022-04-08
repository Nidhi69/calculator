package string_calculator;

public class Calculator {

	public static void main(String args[]) {
		try {
			System.out.println("Sum="+Add("9.'-3,2,1,4"));
		} catch (Exception e) {
			System.out.println("Contains negative number");
		}
	}

	public static int Add(String numbers) throws Exception {
		if(numbers.contains("-"))
		{
			throw new Exception("age is not valid to vote");    
		}
		if (!numbers.equals("") && !numbers.contains("-")) {
			int sum = 0;
			String str = numbers;
			int value = Integer.parseInt(str.replaceAll("[^0-9]", ""));
			while (value > 0) {
				// finds the last digit of the given number
				int digit = value % 10;
				// adds last digit to the variable sum
				sum = sum + digit;
				// removes the last digit from the number
				value = value / 10;

			}
			return sum;
		}
		return 0;

	}

}
