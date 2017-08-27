package nio;

import java.nio.ByteBuffer;

/**
 * Created by Administrator on 2017-07-06.
 */
public class position_capacity_limit {
    public static void main(String[] args) {
        // 初始化byteBuffer，大小为10个字节
        ByteBuffer byteBuffer= ByteBuffer.allocate(15);
        for (int i = 0; i < 10; i++) {
            byteBuffer.put((byte) i);
        }
        System.out.println("position:"+byteBuffer.position()+"--->capacity:"+byteBuffer.capacity()+"--->limit:"+byteBuffer.limit());
        // position 永远指向下一个输入点的下标

        byteBuffer.flip(); // 直接重置position的位置，重置为0，capacity为10,limit位置不变；capacity位置为10防止读模式读到没有数的位置

        System.out.println("position:"+byteBuffer.position());

        for (int i = 0; i < 5; i++) {
            // 读取5个，position的位置为5，capacity，limit位置不变，
            System.out.println(byteBuffer.get());
        }
        byteBuffer.flip(); // position 位置为0，capacity位置为5，limit位置不变

        // 总结：position位置总是在下一个输入点或者都入点，capacity位置为buffer的flip()的时候，capacity变为position的位置
    }

}
