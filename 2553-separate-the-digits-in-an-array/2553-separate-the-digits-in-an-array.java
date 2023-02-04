class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for(int  i =  n-1; i>=0; i--) {
            int num = nums[i];
            while(num>0) {
                
                list.add(0, num%10);
                num/=10;
            }
        }
        
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}