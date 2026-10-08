public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        
        long newton = x / 2;
        while (newton * newton > x) {
            newton = (newton + x / newton) / 2;
        }
        
        return (int) newton;
    }
}