import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // 1. Read URL
        var scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        System.out.println("URL: " + url);
        // 2. Parse and build parameter Map
        String parameters = url.split("\\?")[1];
        System.out.println("Parameters: " + parameters);
        String[] paramArray = parameters.split("&");
        System.out.println(Arrays.deepToString(paramArray));
        // 3. Print Parameter Map        
    }
}
