class Solution {
    public int countHillValley(int[] nums) {
        int hill=0;
        int vall=0;
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;


            }
        }
        for(int i=1;i<k-1;i++){
           
            if(nums[i]>nums[i-1]&& nums[i]>nums[i+1]){
                hill+=1;
            }
            else if(nums[i]<nums[i-1]&& nums[i]<nums[i+1]){
                vall+=1;
            }

        }
        return hill+vall;
        
    }
}
