
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);

	}

	void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pivot = arr[high];
			int i = low - 1;
			for (int j = low; j < high; j++) {
				if (arr[j] <= pivot) {
					i++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			int temp = arr[i + 1];
			arr[i + 1] = arr[high];
			arr[high] = temp;

			pivot = i + 1;

			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}
	}

}
