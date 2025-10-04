class Solution {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int maxl=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            maxl=Math.max(maxl,curr);
        }
        return maxl;
        
    }
   
}