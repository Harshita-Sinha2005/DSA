class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);

        }
        int n=nums.length/2;
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        return 0;


        
    }
}