//Problem: You are climbing a staircase. It takes n steps to reach the top.   Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
/*
Solution Approach:
this follows same recurrence relation as Fibonnacci  :: dp(n) = dp(n-1)+dp(n-2)
----as no of ways for reaching on 30th step will be sum for 29th and 28th step;

*/

//top-down approach---using recursiuon and hashmap

class Solution {    
    private HashMap<Integer, Integer> map = new HashMap<>(); // instanc map for memoization
  
    private int dp(int i) {
        if(i<=2) return i; // base case
        
        if(!map.containsKey(i)) {  
            map.put(i, dp(i-1)+dp(i-2));  //firstly store the result in map if key is not present
        }           
        return map.get(i); // return the result
    }
    
   public int climbStairs(int n) {
        return dp(n);
    }
}

//bottom-up Approach -- using loop and arrays

class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        
        for(int i=3; i<=n; i++) {          
                arr[i] = arr[i-1] + arr[i-2];            
        }
        
        return arr[n];
    }
}
