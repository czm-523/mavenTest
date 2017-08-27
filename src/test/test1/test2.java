package test.test1;

import java.awt.datatransfer.StringSelection;

public class test2 {
    public static void main(String[] args) {
        String str = "sdafsadfsdafsadfsdafsdaf";
        int index = 3;
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if(i != 0 && i % index == 0){
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }
}
