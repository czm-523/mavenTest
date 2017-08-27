package overcode.stirng_demo;

public class variable {
    final int b;   // final修饰成员变量，如果构造函数没有初始化，此处必须赋初始值

    public variable(int b) {
        this.b = b;
    }

    public String add(){
        String a = "1";
        //public String b = "1";  // 局部变量不能被public,protected,private修饰

        //static String b = "1"; // 局部变量不能被static修饰

        final String b; // final可以用来修饰局部变量，局部变量可以不用赋值

        return "";
    }

    public static void main(String[] args) {
        final String a = "abc";
        final String b = "abc";
        //  a = b;  编译出错，因为final修饰的变量引用的值不能改变。

        final StringBuilder c = new StringBuilder("abc");
        c.append("d");
        System.out.println(c.toString());

        //结论：final修饰的变量，保证变量的引用地址永远指向同一个内存地址，至于内存地址里面的值怎么改变
        //     final不管。故不可以修改变量的内存地址值。
    }
}
