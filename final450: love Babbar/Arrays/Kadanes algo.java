
/*
at every stage we have 2 choices: Either take the current element and continue with previous sum OR restart a new range

*/
class Solution{
    long maxSubarraySum(int a[], int n){
        
        // Your code here
        long max= Integer.MIN_VALUE;
        long curr=0;
        for(int i=0;i<n;i++){
            curr = Math.max(curr+a[i],a[i]);        
            max=Math.max(max,curr);            
        }
        return max;
    }
    
}
