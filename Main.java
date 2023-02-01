import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.LinkedHashMap;

class Main {
    public static void main(String[] args) {
        // 1. Read URL
        var scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        // 2. Parse and build parameter Map
        String parameters = url.split("\\?")[1];
        String[] paramArray = parameters.split("&");
        Map<String, String> paramMap = new LinkedHashMap<String, String>();
        for(int i = 0; i < paramArray.length; i++) {
            paramMap.put(paramArray[i].split("=")[0], 
                paramArray[i].split("=").length > 1 ? 
                    paramArray[i].split("=")[1]: "not found");
        }

        // 3. Print Parameter Map        
        for(Map.Entry<String, String> entry: paramMap.entrySet()){
            System.out.printf("%s : %s%n", entry.getKey(), entry.getValue()); 
        } 
        if (paramMap.containsKey("pass")) {
            System.out.printf("password : " + paramMap.get("pass")); 
        }
    }

}
