class Solution {
    static int search(int nums[],int target ){
        return search(nums,target,0,nums.length-1);
    }
    private static int search(int[] nums, int target,int low, int high) {
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            return search(nums,target,mid+1,high);
        }
        else{
            return search(nums,target,low,mid-1);
        }
        
    }
    public static void main(String[] args){
        int arr[]={-1,0,3,5,9,12};
        int result=search(arr,9,0,arr.length);
        System.out.println(result);
    }

}