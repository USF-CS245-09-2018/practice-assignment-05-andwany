
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int index = i - 1;
			while (index >= 0 && arr[index] > temp) {
				arr[index + 1] = arr[index];
				index--;
			}
			arr[index + 1] = temp;
		}
	}
}
