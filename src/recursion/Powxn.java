package recursion;

public class Powxn {
    public static double myPow(double x, int n) {

        double ans = 1;

        if (n == 1) {
            return x;
        }

        if (n == 0) {
            return 1;
        }

        if(n<0)
        {
            x=1/x;
            n=-n;
        }

        while (n > 0) {
            if (n % 2 == 0) {
                x = x * x;
                n = n / 2;
            }

            if (n % 2 != 0) {
                ans = ans * x;
                n = n - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }
}
