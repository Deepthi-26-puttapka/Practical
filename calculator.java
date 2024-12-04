public class Calculator {
       public void add(int x, int y) {
        int z = x + y;
        System.out.println("sum of x and y = " + z);
    }

       public void add(int a, int b, int c) {
        int w = a + b + c;
        System.out.println("sum of a,b and c = " + w);
    }

        public void add(double p, double q) {
        double k = p + q;
        System.out.println("sum of p and q = " + k);
    }

    public static void main(String args[]) {
        Calculator ob = new Calculator();
        ob.add(12, 10);
        ob.add(20, 40, 10);
        ob.add(20.86, 40.09);
    }
}
   
