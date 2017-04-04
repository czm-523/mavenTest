package designpatterns.singleton;

public class Singleton{

	/**
	 * 方法一就是传说的中的饿汉模式
	 * 优点是：写起来比较简单，而且不存在多线程同步问题，避免了synchronized所造成的性能问题；
	 * 缺点是：当类SingletonTest被加载的时候，会初始化static的instance，静态变量被创建并分配内存空间，
	 * 从这以后，这个static的instance对象便一直占着这段内存（即便你还没有用到这个实例），当类被卸载时，静态变量被摧毁，
	 * 并释放所占有的内存，因此在某些特定条件下会耗费内存。
	 */
//	private Singleton(){}
//	private static final Singleton instance = new Singleton();
//	public static Singleton getInstance(){
//		return instance;
//	}
  
	
	/**
	 * 方法二为方法二的简单优化
	 *	优点是：使用synchronized关键字避免多线程访问时，出现多个SingletonTest实例。
	 *	缺点是：同步方法频繁调用时，效率略低。
	 */
//	public Singleton(){}
//	public static Singleton instance = null;
//	public static synchronized Singleton getInstance(){
//		if(instance == null){
//			instance =  new Singleton();
//		}
//		return instance;
//	}
	
	
	/**
	 * 方法三为单例模式的最佳实现。内存占用地，效率高，线程安全，多线程操作原子性。
	 */
	    private static class LazyHolder {    
	       private static final Singleton INSTANCE = new Singleton();    
	    }    
	    private Singleton (){}    
	    public static final Singleton getInstance() {    
	       return LazyHolder.INSTANCE;    
	    }    

}
