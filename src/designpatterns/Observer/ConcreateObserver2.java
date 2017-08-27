package designpatterns.Observer;

/**
 * Created by Administrator on 2017-07-05.
 */
public class ConcreateObserver2 implements Observer1 {

    @Override
    public void update() {
        System.out.println("观察者2收到信息");
    }
}
