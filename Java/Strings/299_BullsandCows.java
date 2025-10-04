class Solution {
    public String getHint(String secret, String guess) {
        int count=0;
        int bulls=0;
        for(int i=0;i<guess.length();i++){
            char ch=guess.charAt(i);
            String str=String.valueOf(ch);
            int idx=secret.indexOf(str);
            if(idx!=-1){
                count++;
            }

        }
        for(int i=0;i<guess.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;

            }
        }
        int cows=count-bulls;
        return bulls+"A"+cows+"B";
        
    }
}