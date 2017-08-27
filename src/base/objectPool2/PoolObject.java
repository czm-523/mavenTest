package base.objectPool2;

/**
 * Created by Administrator on 2017-07-05.
 * 单个对象的对象池
 *
 */
public class PoolObject {

    // 当前对象是否正在使用
    boolean isBusy = false;

    // 当前对象
    Object object = null;

    //
    public PoolObject(boolean isBusy, Object object) {
        this.isBusy = isBusy;
        this.object = object;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
