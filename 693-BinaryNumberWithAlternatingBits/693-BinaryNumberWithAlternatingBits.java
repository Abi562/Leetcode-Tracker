// Last updated: 7/9/2026, 3:21:13 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
       int x=(n^(n>>1));
       return(x&(x+1))==0?true:false;
    }
}