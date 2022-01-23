/*
Problem: Given two unsorted arrays that represent two sets (elements in every array are distinct), find the union and intersection of two arrays.

solution:
Approach 1: using hashmap to map the distinct element with their frequency 
Approach 2: without using collections
  -sort the smaller array
  -for every element in other array use binary search to know whether it is present or not then calculate the union and intersection
  */

// time complexity: n*log(n) + m*log(n) == (m+n)log(n)

class Solution {

  public static findUnion(int[] a, int n , int[] b, int m){
    
     //Make sure a[] is smaller
    if(m<n) {
      int[] temp = a;
      a = b;
      b = temp;
      
      int tmp = m;
      m = n;
      n = tmp;
    }
    
    //create a resultant array which holds the union of two arrays max size: n+m
    int[] union = new int[n+m];
    int[] intersection = new int[n];
     int ind = 0;
    int k = 0;
   
    //copy the smaller array to union array
   
    for(int i = 0; i<n; i++)
      union[ind++]=a[i];
    
    //sort the smaller array
     Arrays.sort(a);
    
    //for every element in array b search in a
     for(int j = 0; j<m;j++ ){
       int pos = binarySearch(a,n,b[j]);
       if(pos==-1) {  // if element is not pesent in a[] then add it to union
         union[ind++] = b[j];
       }else intersection[k++] = b[j];  // else it is common element so add it to intersection
     }
    
  }
  
  public static int binarySearch(int[] arr, int n, int key) {
    int start = 0;
    int end = n-1;
    while(start<=end) {
      int mid = start + (end-start)/2;
      if(arr[mid] == key) return mid;
      else if (arr[mid]>key) end = mid-1;
      else start = mid+1;
    }
    return -1;
  }
  
}
