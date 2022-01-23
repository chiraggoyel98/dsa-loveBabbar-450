/* Problem:
 Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 */
//naive approach : maintain threee counters for 0 1 and 2 and create a new array with that


//approach 2 : using threee pointer method

class Solution
{
    public static void sort012(int a[], int n)
    {
      //Maintain three pointers where resultant arrray would be like: 0 from [0-->start),  1 from [start-->end],  2 from (end-->n)
       int start = 0;
       int end = n-1;
       int ind = 0;
       while(ind<=end) {
           if(a[ind]==0) {  // if current element is 0 swap it with strat index and incr both start and curr ind
               int tmp = a[ind];
               a[ind] = a[start];
               a[start] = tmp;
               start++;
               ind++;
           }
           else if(a[ind]==2){ // if current eleeemnt is 2 swap it with end index decr only end pointer
               int tmp = a[ind];
               a[ind] = a[end];
               a[end] = tmp;
               end--;
               
           }
           else ind++; // if no is 1 only incr curr pointer
       }
    }
}
