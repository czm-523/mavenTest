package overcode.stirng_demo;

public class string {
    String s = "Hello world!";
    /**
     这个语句声明的是一个指向对象的引用，名为“s”，可以指向类型为String的任何对象，目前指向"Hello world!"这个String类型的对象。
     这就是真正发生的事情。我们并没有声明一个String对象，我们只是声明了一个只能指向String对象的引用变量。
     所以，如果在刚才那句语句后面，如果再运行一句：
     String string = s;
     我们是声明了另外一个只能指向String对象的引用，名为string，并没有第二个对象产生，string还是指向原来那个对象，也就是，和s指向同一个对象。
     */

    public static void main(String[] args) {
        int a=10;
        int b=10;
        System.out.println(a == b); // false
        // 基本数据类型， == 比较的是值是否相等

        String x = "abc";
        String y = "abc";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        // 复合数据类型比较的是内存中的存放地址，此处x,y是不同的引用，指向的是同一个地址

        String c = new String("abc");
        String d = new String("abc");
        System.out.println(c == d);
        // 复合数据类型比较的是内存中的存放地址，此处c,d都创建了新的String对象，都是"abc"，两个不是同一个对象，内存地址不同，故c,d的指向的内存地址不同。

        // 使用String的equals的时候，判断的是两个对象的值内容是不是一样的，不是比较的引用地址是不是一样的
        System.out.println(x.equals(c));

        // 如果是对象的时候，没有重写equals方法，Object默认的equals方法调用的是==,判断两个对象的引用地址是不是相等
        string string1 = new string();
        string string2 = new string();
        System.out.println(string1.equals(string2));  // false

    }

}
