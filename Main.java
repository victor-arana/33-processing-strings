import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.LinkedHashMap;

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
        Map<String, String> paramMap = new LinkedHashMap<>();
        for(int i = 0; i < paramArray.length; i++) {
            paramMap.put(paramArray[i].split("=")[0], 
                paramArray[i].split("=").length > 1 ? 
                    paramArray[i].split("=")[1]: "not found");
        }

        System.out.println("Parameter Map: " + paramMap);


        // 3. Print Parameter Map        
    }
}
