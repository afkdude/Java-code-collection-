public class mergeSort {
  public static void merge(int[] arr, int low, int mid, int high) {
    // first sub array low to mid
    // second sub array mid+1 to high

    int left = low;
    int right = mid + 1;

    int[] temp = new int[high - low + 1];
    int index = 0;
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp[index] = arr[left];
        left++;
      } else {
        temp[index] = arr[right];
        right++;
      }
      index++;
    }

    while (left <= mid) {
      temp[index] = arr[left];
      left++;
      index++;
    }

    while (right <= high) {
      temp[index] = arr[right];
      right++;
      index++;
    }

    for (int i = low; i <= high; i++) {
      arr[i] = temp[i - low];
    }
  }

  public static void ms(int[] arr, int low, int high) {
    if (low >= high) {
      return;
    }

    int mid = (low + high) / 2;

    ms(arr, low, mid);
    ms(arr, mid + 1, high);

    merge(arr, low, mid, high);
  }

  public static void mergeSort(int[] arr, int n) {
    // Write your code here.

    ms(arr, 0, n - 1);
  }


  public static void main(String[] args) {
    int arr[] = { 1, 4, 3, 5, 7, 6, 8, 9, 23, 45, 80 };
    
    int n = arr.length;
    
    mergeSort(arr, n);


    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]+ " ");
    }
  }
}
