package base.objectPool2;


import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Administrator on 2017-07-05.
 * 该类在系统启动时加载，生成全局线程池
 */
public class ObjectPool {
    // 当前对象池该对象的最大个数
    private static int MAX_OBJECT_NUM = 100;
    // 当前对象池的对象个数
    private static int CURR_OBJECT_NUM = 0;
    // 线程池对象的新增或者删除步长(当线程池对象不够用，新增对象的个数)
    private static int STEP = 5;

    // 存放对象池的Map
    private static Map<Integer,Queue<PoolObject>> PoolMap = null;
    //　存放对象的池
    private static Queue<PoolObject> ObjectPool = null;


    public ObjectPool(){
        // 初始化所有对象池的对象
        PoolMap = new HashMap<Integer,Queue<PoolObject>>();
        // 初始化对象池
        ObjectPool = new LinkedBlockingQueue<PoolObject>();
    }

    // 创建对象池
    public void createPool(Class T) throws IllegalAccessException, InstantiationException {
        // 使用传进来的对象的hashCode作为对象池的组id
        int gropId = T.hashCode();
        PoolMap.put(gropId,ObjectPool);

        // 初始化对象池
        for (int i = 0; i < STEP; i++) {
            // 创建池对象,和初始化对象的状态
            PoolObject polObject = new PoolObject(false,T.newInstance());
            /**
             boolean add(E e); // 添加元素到队列中，相当于进入队尾排队。
             boolean offer(E e);  //添加元素到队列中，相当于进入队尾排队.
             E remove(); //移除队头元素
             E poll();  //移除队头元素
             E element(); //获取但不移除队列头的元素
             E peek();  //获取但不移除队列头的元素
             */
            ObjectPool.offer(polObject);
        }
    }

    // 获取对象
    public Object getObject(int groupId) throws IllegalAccessException, InstantiationException {
        // 获取该对象的对象池
        Queue<PoolObject> queue = PoolMap.get(groupId);

        // 使用队列的方式，总是从队首区，
        // 获取第一个元素
        PoolObject object = queue.poll();


        // 直接生成

        return null;
    }


    // 获取队列中能用的对象
    private Object getFreeObject(String hashCode) {
        Queue queue = PoolMap.get(hashCode);

        return null;
    }
    //


}
