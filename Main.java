import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // 1. Read URL
        var scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        System.out.println("URL: " + url);
        // 2. Parse and build parameter Map
        String parameters = url.split("\\?")[1];
        System.out.println("Parameters: " + parameters);
        // 3. Print Parameter Map        
    }
}
