/*
Problem:
 Maximum and minimum of an array using minimum number of comparisons
 */
 
// Simple Approach: using linear search
class Solution {
  int max;
  int min;
  
  public void getMaxMin(int[] arr) {
    //Initialising our min and max value to point to first eelement of array
    max = arr[0];
    min = arr[0];
    
    //starting from ind 1 
    for(int i = 1; i<arr.length; i++) {
      if(arr[i]>max) max = arr[i];
      else if(arr[i]<min) min = arr[i];
    }
  }
 //In this method, the total number of comparisons is 1 + 2(n-2) in the worst case (descending order)
                                                      // and 1 + n – 2 in the best case. (ascending order
 /*
 Approach 2:
 Compare in pairs:
 */
 
 public void getMinMaxII(int[] arr) {
  int n = arr.length;
  int i = 0;
  
  if(n%2!=0) { //if n is odd max and min both are initialize as first element
   max = arr[0];
   min = arr[0]; 
   i = 1;
  } else { 
   // when n is even compare first and second element 
     if(arr[0]>arr[1]) {
      max = arr[0];
      min = arr[1];
     } else {
      max = arr[1];
      min = arr[0];
     }
   i = 2;
  }
  
  while(i<n-1) { 
   if(arr[i]>arr[i+1]) {
    max = Math.max(max,arr[i]);
    min = Math.min(min,arr[i+1]);
   }
   else {
    max = Math.max(max,arr[i+1]);
    min = Math.min(min,arr[i]);
   }
   i += 2;
  }
 }
 // in this method 
 /*
  If n is odd:    3*(n-1)/2  
  If n is even:   1 Initial comparison for initializing min and max, 
                           and 3(n-2)/2 comparisons for rest of the elements  
                      =  1 + 3*(n-2)/2 = 3n/2 -2
                      */
   
 
  
  public static void main(String[] args) {
    Solution obj = new Solution();
    int[] arr = {1000, 11, 445, 1, 330, 3000};
    obj.getMaxMin(arr);
    System.out.println(obj.max + " " + obj.min);
  }
  
}
    
  

