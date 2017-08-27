package base.String;

/**
 * Created by Administrator on 2017-07-05.
 */
public class StringTest2 {
    public static void main(String[] args) {
        String string = null;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            string = string + i;
        }
        long e1= System.currentTimeMillis();
        System.out.println(e1-t1);
        String temp = "";
        long t2= System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            temp = temp.concat(String.valueOf(i));
        }
        long e2= System.currentTimeMillis();
        System.out.println(e2 - t2);
        StringBuilder stringBuilder= new StringBuilder();
        long e3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(i);
        }
        System.out.println(System.currentTimeMillis() - e3);
    }
}
