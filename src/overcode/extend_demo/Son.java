package overcode.extend_demo;

public class Son extends Fatcher {
    // 构造方法不能被子类继承，可以被子类调用 super()调用父类构造方法
    public Son() {
        super();
    }


    @Override
    public String eat(String foodName, String method) {
        return super.eat(foodName, method);
    }



}
