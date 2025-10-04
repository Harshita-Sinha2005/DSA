public int[] searchRange(int[] nums, int target) {
        int []result=new int[2];
        result[0]=lowerbound(nums,target);
        result[1]=upperbound(nums,target);
        return  result;

    }
    private int lowerbound(int []nums,int target){
        int s=0;
        int e=nums.length-1;
        int potential=-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                potential=mid;
                e=mid-1;
            }
            else if(nums[mid]<target){
                
                s=mid+1;
                
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
        }
        return potential;
    }
    private int upperbound(int []nums,int target){
        int s=0;
        int e=nums.length-1;
        int potential=-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                potential=mid;
                s=mid+1;

            }

            else if(nums[mid]<target){
                
                s=mid+1;
                
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
        }
        return potential;
    }
}