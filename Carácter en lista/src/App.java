public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("En la palabra estrellas hay 'l': " + ContarChar.contar("estrellas", 'l', 0) + " veces");
        System.out.println("En la palabra estrellas hay 't': " + ContarChar.contar("estrellas", 't', 0) + " veces");
        System.out.println("En la palabra estrellas hay 'm': " + ContarChar.contar("estrellas", 'm', 0) + " veces");
        System.out.println("En la palabra estrellas hay 'e': " + ContarChar.contar("estrellas", 'e', 0) + " veces");
    }
}
