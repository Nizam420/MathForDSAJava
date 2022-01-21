package MathforDSA;

public class Gcd_Lcm {
    public static void main(String[] args) {
        // System.out.println(gcd(4, 8));
        System.out.println(gcd(9, 18));
    }
    static int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}
