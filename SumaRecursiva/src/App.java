public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(suma(5));
    }

    static int suma(int n) {
        if (n <= 1) {
            return n;
        }
        return n + suma(n - 1);
    }
}
