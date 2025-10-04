class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int count=0;
        int maxcount=0;
        HashSet<Character> map=new HashSet<>();
        while(r<n){
            char ch=s.charAt(r);
            
            while(map.contains(ch)){
                map.remove(s.charAt(l));
                count-=1;
                l++;
            }
            map.add(ch);
            maxcount=Math.max(maxcount,r-l+1);
            r++;
            

            
        }
        return maxcount;
        
        
    }
}