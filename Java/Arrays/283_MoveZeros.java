class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
            
        }
        int count_zeros=nums.length-list.size();
        for(int i=0;i<count_zeros;i++){
            list.add(0);
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        
        
        
    }
}