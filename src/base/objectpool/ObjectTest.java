package base.objectpool;

/**
 * Created by Administrator on 2017-07-05.
 */
public class ObjectTest {
    public static void main(String[] args) throws Exception {
        ObjectPool objPool = new ObjectPool();

        objPool.createPool();
        Object obj = objPool.getObject();
      //  returnObject(obj);
        objPool.closeObjectPool();
    }
}
