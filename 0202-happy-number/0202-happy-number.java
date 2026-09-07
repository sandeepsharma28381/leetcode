class Solution {
    public int sod(int n){
        int s = 0;
        while(n != 0){
            int d = n % 10;
            s += d * d;
            n /= 10;
        }
        return s;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sod(slow);          
            fast = sod(sod(fast)); 
        } while (slow != fast);

        return slow == 1;
    }
}
