//Q. Write a program to reverse an array or string
/*

1) Using two pointers , one as start=0 and other end=n-1
 
    Time complexity: O(n)
    no additional space required
    */
class Solution {
public static void reverseArray(int[] arr) {
   int start = 0;
   int end = arr.length-1;
   while(start<end) {
    int tmp = arr[start];
    arr[start] = arr[end];
    arr[end] = tmp;
    
    start++;
    end--;
   }
}


/*
2). Recursive way:
 Change the definition of func in recursive form:
 
 
 public static void reverseArray(int[] arr, int start, int end) {
  if(start>=end) return;
  swap(arr[start],arr[end]);
  reverseArray(int[] arr, start+1, end-1);
  }
  */
}
  
  
