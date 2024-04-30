class Solution {
    public boolean isIsomorphic(String s, String t) {
        int tCharMp[]  = new int[256];
        int sCharMp[]  = new int[256];
        Arrays.fill(sCharMp, -1);
        Arrays.fill(tCharMp, -1);
        int freqMp[] = new int[256];
        for(var chr : s.toCharArray()){
            freqMp[chr]++;
        }
        int size = s.length();
        for(int indx = 0; indx < size; indx++){
            char sChar = s.charAt(indx), tChar = t.charAt(indx);
            int tIndx = tChar;
            int sIndx = sChar;
            if(tCharMp[tIndx] == -1){
                tCharMp[tIndx] = sChar;
            }else{
                if(tCharMp[tIndx] != sChar)return false;
            }
            if(sCharMp[sIndx] == -1){
                sCharMp[sIndx] = tChar;
            }else{
                if(sCharMp[sIndx] != tChar)return false;
            }
        }  
        for(var chr : t.toCharArray()){
            int indx = tCharMp[chr];
            if(--freqMp[indx] < 0)return false;
        }
        return true;
    }
}