class Solution {
    public static void main(String[] args) {
        int nums[]={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));

    }
    static double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];

        }
        double maxsum=sum;
        for(int i=k;i<n;i++){
            sum=sum-nums[i-k]+nums[i];
            maxsum=Math.max(maxsum,sum);

        }
        double maxavg=(double)maxsum/k;
        return maxavg;
    }
    
}