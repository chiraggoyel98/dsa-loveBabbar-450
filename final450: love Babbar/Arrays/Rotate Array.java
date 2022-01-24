/*
Problem:
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements. 

Solution:
Approach I: Rotate by one d times;   TC: O(n*d)
Approach II: Reversal method:        TC: O(n)
              - reverse arr(1,d)
              - reverse arr(d+1,n)
              -reverse arr(1,n);
Approach 3: Juggling Method        TC: O(n)
*/

class Solution {
  public static void (int[]arr,int n,int d) {
    //elements of array are replaced in group of sets in cyclic manner
    d = d % n;  //to ensure d<n
    int hcf = gcd(n,d); 
    
    for(int i=0; i<hcf; i++) {
      int tmp = arr[i];
      int j = i;
      while() {
        int k = (j+d)%n; // cyclicllic arrray traversal
        if(k==i) break;  // we reach at start
        a[j] = a[k];
        j = k;
      }
      a[j] = tmp;
         
  }
  
  public static int gcd(int a,int b){
    if(b==0) return a;
    else return gcd(b,a%b);
  }
}
