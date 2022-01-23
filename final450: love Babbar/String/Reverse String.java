/*
Problem link: https://leetcode.com/problems/reverse-string/

Description:
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Solution:
*/
class Solution {
    public void reverseString(char[] arr) {
      
        int start = 0;
   int end = arr.length-1;
   while(start<end) {
    char tmp = arr[start];
    arr[start] = arr[end];
    arr[end] = tmp;
    start++;
    end--;
   }
   
    }
    
}
