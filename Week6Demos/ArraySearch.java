
public class ArraySearch {

	public static void main(String[] args) {
		int index;
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
		}
		displayArray(numbers);

		index = linearSearch(numbers, 2);

		if (index >= 0) {
			System.out.println("\nvalue found at: " + index);
		} else {
			System.out.println("\nnot found");
		}

		selectionSort(numbers);
		displayArray(numbers);
		
		index = binarySearch(numbers, 2);

		if (index >= 0) {
			System.out.println("\nvalue found at: " + index);
		} else {
			System.out.println("\nnot found");
		}
	}

	public static int linearSearch(int[] array, int searchValue) {

		for (int i = 0; i < array.length; i++) {
			if (searchValue == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] array, int searchValue) {
		int low = 0;
		int high = array.length - 1;

		while (high >= low) {
			int mid = (high + low) / 2;

			if (array[mid] < searchValue) {
				low = mid + 1;		
			} else if (array[mid] > searchValue) {
				high = mid -1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int currentMin = array[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}
		}
	}

	public static void displayArray(int[] array) {
		System.out.println();

		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
