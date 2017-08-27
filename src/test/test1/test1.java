package test.test1;

/**
 * Created by Administrator on 2017-07-16.
 */
public class test1 {
    public test1() {
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int[] arr = new int[99999999];
        for (int i = 0; i < 99999999; i++) {
            arr[i] = i;
        }
        System.out.println(System.currentTimeMillis() - time);
        long end = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i+=4) {
            arr[i]=i;
            arr[i+1] = i + 1;
            arr[i+2] = i+ 2;
            arr[i+3] = i+3;
        }
        System.out.println(System.currentTimeMillis()- end);
    }
}
