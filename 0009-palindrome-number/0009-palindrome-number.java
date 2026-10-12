class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while(temp > 0){
            int d = temp % 10;
            rev = rev*10+d;
            temp /= 10;
        }
        return x == rev;
        
    }
}