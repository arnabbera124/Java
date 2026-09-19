import java.util.*;;

public class selectionSort {
  public static void printArray(int arr[]){
    for(int i =0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.err.println();
  }

  public static void main(String[] args) {
    int arr[] = {7,8,3,2,5,1};
    for(int i = 0;i < arr.length-1; i++){
      int small = i;
      for(int j = i+1; j<arr.length; j++){
        if(arr[j] < arr[small]){
          small = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[small];
      arr[small] = temp;
    }

    printArray(arr);
  }
  
}