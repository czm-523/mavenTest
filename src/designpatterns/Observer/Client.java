package designpatterns.Observer;
/**
 * Created by Administrator on 2017-07-05.
 */
public class Client {
    public static void main(String[] args) {
        Subject subJectb = new ConcreteSubject();
        subJectb.addObserver(new ConcreateObserver());
        subJectb.addObserver(new ConcreateObserver2());
        subJectb.doSomething();
    }

}

