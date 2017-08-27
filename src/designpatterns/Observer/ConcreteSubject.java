package designpatterns.Observer;

/**
 * Created by Administrator on 2017-07-05.
 */
public class ConcreteSubject extends Subject{
    @Override
    public void doSomething() {
        System.out.println("被观察者事件发生！");
        this.notifyObserver();
    }

}
