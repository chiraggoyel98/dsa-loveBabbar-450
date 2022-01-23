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
  
  public static void main(String[] args) {
    Solution obj = new Solution();
    int[] arr = {1000, 11, 445, 1, 330, 3000};
    obj.getMaxMin(arr);
    System.out.println(obj.max + " " + obj.min);
  }
  
  
}
    
  

