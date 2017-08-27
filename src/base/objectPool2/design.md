## 生成对象池的方案 ##
> TO:目标
``` Java
    ObjectPool pool = ObjectPool.getPool(User.Class);//直接获取User类的对象池。
    User user = pool.getObject();                    //获取对象
    ObjectPool.Close(User.Class);                    //关闭对象池
```
####按照对象生成池，可以生成多个池，一个池可以被多个实例同时调用 
* 且不存在死锁和资源竞争。
* 按照传入的 Bean.Class通过反射，再使用单例模式生成单个对象进行返回。
* 单个对象池的维护，通过分组
