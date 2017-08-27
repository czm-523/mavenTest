package base.Thread;

import static javafx.scene.input.KeyCode.T;

public class Thread extends java.lang.Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
class demo{
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2  = new Thread();
        t2.start();
        t1.start();
    }
}
