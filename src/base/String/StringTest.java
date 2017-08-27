package base.String;

import java.util.StringTokenizer;

/**
 * Created by Administrator on 2017-07-05.
 */
public class StringTest {
    public static void main(String[] args) {
        java.lang.String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            stringBuffer.append(i);
            stringBuffer.append(";");
        }
        str= stringBuffer.toString();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str.split(";");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long start2 = System.currentTimeMillis();
        StringTokenizer st = new StringTokenizer(str,";");
        for (int i = 0; i < 10000; i++) {
            while(st.hasMoreTokens()){
                st.nextToken();
            }
            st= new StringTokenizer(str,";");
        }
        System.out.println(System.currentTimeMillis()- start2 );

        String temp = str;
//        long start3=  System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            while(true){
//                String splitStr = null;
//                int j = temp.indexOf(';');
//                if(j<0)break;
//                splitStr = temp.substring(0,j);
//                temp = temp.substring(j+1);
//            }
//            temp = str;
//        }
//        System.out.println(System.currentTimeMillis()- start3);


        int len = str.length();
        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            if (str.charAt(0)=='a'&&str.charAt(1)=='b'&&str.charAt(2)=='c');
            if (str.charAt(len-1)=='a'&&str.charAt(len-2)=='b'&&str.charAt(len-3)=='c');
        }
        System.out.println(System.currentTimeMillis() - start4);
        long start5 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            str.endsWith("abc");
            str.startsWith("abc");
        }
        System.out.println(System.currentTimeMillis()-start5);

        System.gc();
        long start6 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            String tem = "sdaf";
            String tem1 = "sadf";
            String tem2 = "sdfa";
            String tem3 = "sdaf";
            String tems = tem+ tem1+tem2+tem3;
        }
        System.out.println(System.currentTimeMillis() - start6+"String");
        StringBuilder stringBuilder= new StringBuilder();
        long start7 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            stringBuilder.append("sdaf").append("sadf").append("sdfa").append("sdaf");
        }
        System.out.println(System.currentTimeMillis()-start7+"StirngBuilder");
    }
}
