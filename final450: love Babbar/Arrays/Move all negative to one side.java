/*
Problem:
An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
*/

public static void rearrange(int arr[], int n)
    { 
  //using two pointers
       int s = 0;
       int e = n-1;
       while(s<e) {
           while(arr[s]<0) s++; 
           while(arr[e]>0) e--;
           
           if(s<e) {
               int tmp = arr[s];
               arr[s] = arr[e];
               arr[e] = tmp;
           }
       }
    }

// approach 2: using partition 
public static void partitioin(int[] arr, int n) {
  int i=0;
  for(int j=0;j<n;j++) {
    if(arr[j]<0) {
      int tmp = arr[j];
      arr[j] = arr[i];
      arr[i] = tmp;
      i++;
    }
  }
}
