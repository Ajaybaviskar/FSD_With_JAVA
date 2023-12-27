public class MethodOverLoadingDemo {
    public int multiply(int x, int y) {
        return (x * y);
    }

    public int multiply(int x, int y, int z) {
        return (x * y * z);
    }

    public double multiply(double x, double y) {
        return (x * y);
    }

    public static void main(String args[]) {
        MethodOverLoadingDemo md = new MethodOverLoadingDemo();
        System.out.println(md.multiply(2, 4));
        System.out.println(md.multiply(2, 6, 8));
        System.out.println(md.multiply(14.0, 15.0));
    }
}