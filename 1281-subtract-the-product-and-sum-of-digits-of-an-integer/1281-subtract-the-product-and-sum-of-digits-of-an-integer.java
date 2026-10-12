class Solution {
    public int subtractProductAndSum(int n) {
        int add = 0;
        int mul = 1;
        while (n > 0){
            int d = n % 10;
            add += d;
            mul *= d;

            n /= 10;
        }
        return mul-add;
    }
}