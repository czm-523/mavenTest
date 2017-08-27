package overcode.round;

public class switch_case {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {

            switch (i){
                case 1: a++;
                case 2: a++;break;
            }
            System.out.println(a);


        }
    }
}
