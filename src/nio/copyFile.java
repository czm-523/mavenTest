package nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Administrator on 2017-07-06.
 */
public class copyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Program Files\\腾讯游戏\\英雄联盟\\Game\\ParticleTextrues3.zip"));
        FileOutputStream fos = new FileOutputStream(new File("D:\\迅雷下载\\a.zip"));
        FileChannel fileChannel = fis.getChannel();
        FileChannel fileChannel1 = fos.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(102400);
        long time = System.currentTimeMillis();
        while (true){
            bb.clear();
            int len = fileChannel.read(bb);
            if (len == -1) {
                break;
            }
            bb.flip();
            fileChannel1.write(bb);
        }
        fileChannel.close();
        fileChannel1.close();
        System.out.println(System.currentTimeMillis()- time);
    }
}
