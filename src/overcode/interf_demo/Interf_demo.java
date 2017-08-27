package overcode.interf_demo;

// private interface Aoo // 接口不能被private，final修饰， 只能是public修饰，
interface Aoo {

    int i = 1; // 默认前面加了public static final

    void eat(); // 接口只有方法名，没有实现方法，默认是public abstract修饰，不能被static,final修饰

}

abstract class Boo {
    int a;  // 抽象类可以定义变量，也可以定义常量

    public Boo() {
    }  // 抽象类可以有构造方法

    public static void run() {      // 抽象类定义普通方法，可以写具体功能逻辑
        System.out.println("");
    }

    abstract void eat();  // 抽象类定义抽象方法，没有方法体
}


interface Coo {
}

interface Doo extends Aoo, Coo {
}   // 接口可以继承多个接口

abstract class Foo implements Aoo {
}  // 抽象类可以实现接口，接口不能继承抽象类,抽象类不用重写接口的所有方法，因为接口的方法都是抽象方法

public class Interf_demo {
}//普通的类

/**
 * 抽象类能够继承实体类。
 * 前提是，实体类有明确的构造函数，默认的也是，构造函数的修饰符子类能够继承
 **/
abstract class Eoo extends Interf_demo {
}



