class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }

        while(low<high){
            int mid=low+(high-low)/2;

            if(canShip(weights,mid,days)){
                high=mid;
            }
            else{
                low=mid+1;
            }
            
        }
        return low;
        
    }
    private boolean canShip(int []weights,int mid,int days){
        int currload=0;
        int dayss=1;

        for(int load:weights){
            if(currload+load<=mid){
                currload+=load;
            }
            else{
                dayss++;
                currload=load;

            }
        }
        return dayss<=days;
    }
}