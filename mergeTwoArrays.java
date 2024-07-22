public class mergeTwoArrays {


  public static void mergeArrays(int[] arr1, int[] arr2) {
    int n1 = arr1.length;
    int n2 = arr2.length; 
    // System.out.println(n1);

    int []temp=new int[n1+n2]; 

    int left = 0;
    int index = 0; 
    int right = 0;
    
    while (left < n1 && right < n2) {
      if (arr1[left] <= arr2[right]) {
        temp[index] = arr1[left];
        left++;
      } else {
        temp[index] = arr2[right];
        right++;

      }
      index++;
    }
    

    while (left < n1) {
      temp[index] = arr1[left];
      left++;
      index++;
    }
    
    while (right < n1) {
      temp[index] = arr1[right];
      right++;
      index++;
    }


    for(int i = 0 ; i<temp.length;i++){
      System.out.println(temp[i]);
    }
  }
  
  public static void main(String[] args) {
    int[] arr1 = { 4, 6, 9, 20 };
    int[] arr2 = { 1, 2, 3, 5, 7, 8, 10 };
    
    mergeArrays(arr1, arr2);
   
  }
}
