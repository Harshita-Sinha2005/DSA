class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int maxlen=0;
        for(int r=0;r<fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2){
                int fruit=fruits[left];
                map.put(fruit,map.get(fruit)-1);
                if(map.get(fruit)==0){
                    map.remove(fruit);
                }
                left++;

            }
            maxlen=Math.max(maxlen,r-left+1);


        }
        return maxlen;
        

        
    }
}