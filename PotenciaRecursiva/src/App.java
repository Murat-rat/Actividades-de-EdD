public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(potencia(2, 5));
    }

    static int potencia(int a, int b) {
        if (b <= 1) {
            return a;
        }
        return a * potencia(a, b - 1);
    }
}