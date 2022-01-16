import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	public static int carParkingRoof(int[] cars, int k) {

		// if array is empty or k is less than 0 i will give an error
		if (cars.length == 0 || k < 0) {
			return 0;
		}

		// then i will sort my array with ascending order
		Arrays.sort(cars);

		int result = Integer.MAX_VALUE;

		for (int i = 0; i <= cars.length - k; i++) {
			result = Math.min(result, cars[i + k - 1] - cars[i]);
		}

		return result + 1;
	}

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int counter = 1;

			// Enter n (number of parked places);
			int n = scanner.nextInt();

			int cars[] = new int[n];

			// Enter position of cars
			while (counter <= n) {
				int element = scanner.nextInt();
				cars[counter - 1] = element;
				counter++;
			}

			// Enter k (number of cars that must be covered);
			int k = scanner.nextInt();

			// minimum length of a roof that can cover k cars
			int result = carParkingRoof(cars, k);

			//Printing Final asnwer
			System.out.println(result);
		}
	}
}
