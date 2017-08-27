package designpatterns.Observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * Created by Administrator on 2017-07-05.
 */
public abstract class Subject {
    private Vector<Observer1> obs = new Vector<Observer1>();

    public void addObserver(Observer1 obs) {
        this.obs.add(obs);
    }

    public void delObserver(Observer1 obs) {
        this.obs.remove(obs);
    }

    protected void notifyObserver() {
        for (Observer1 o : obs) {
            o.update();
        }
    }

    public abstract void doSomething();
}
