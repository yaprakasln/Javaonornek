public class faktoriyel {

    public static void main(String[] args) {
        int faktoryel = 1;
        for (int n = 1; n <= 20; n++) {
        if (n == 8)
        break;
        faktoryel = faktoryel * n;
        System.out.printf("%d! = %d %n", n, faktoryel);
        }
        }
       }

