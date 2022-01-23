/* Problem:    Given an array and a number k where k is smaller than the size of the array,
              we need to find the k’th smallest element in the given array. 
              It is given that all array elements are distinct.
              
  This problem is considered to be complex as it has 8 ways of solving 
  Methods:                                                              time complexity:                         code form:
  
  1) sort the array then return kth element                              n * Log(n)                               very easy
  2) use modified bubble/Selection sort run it k times                   n * k                                    easy
  3) build max/min heap for large/small  extrt k times                   n + k*log(n)                             medium
  4) use min heap for largest and vice versa                             k + (n-k)*log(k)                         hard
  5) using ordered_map or tree map with freq                             -----------                             - -----
  6) using quick select                                                  O(n) --> O(n^2)                           easy
  7) using randomized partition technique in quickselect                 O(n) --> O(n^2)                           medium
  8) using balanced partition technoique in quick select                 O(n)                                      hard
  
  */
class Solution {
  
  //Method-I
  public static int kthSmallestElement_I (int[] arr, int k) {
    Arrays.sort(arr); // to sort the array in ascending order 
    Arrays.sort(arr, Collections.reverseorder()); // to sort the array in descending order
    
    return arr[k-1]; // provided k is smaller than the size of array
  }
  
  //Method-II
   public static int kthSmallestElement_II (int[] arr, int k) {
        boolean sorted = true;
     //using bubble sort
        for(int i = 0; i<k; i++) {
            sorted = true;
            for(int j = 0; j<r-i; j++) {
                if(arr[j]<arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    sorted = false;
                }
            }
            if(sorted) break;
            
        }
        return arr[r-k+1];
   }
  
}
  
