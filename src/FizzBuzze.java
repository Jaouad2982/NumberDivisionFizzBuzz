public class FizzBuzze {
	public static void main(String[] args) {
		checkBuzz(1, 100);
	}

	public static void checkBuzz(int min, int max) {
		for (int i = min; i < max+1; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("fizz");
				}
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}