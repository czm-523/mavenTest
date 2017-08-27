package list;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-07-06.
 */
public class HashMap {
    public static void main(String[] args) {
        // 使用参数初始化linkedHashMap，0.75f初始化linkedHashMap的负载因子，true使用的是按照时间排序，获取了对象之后，将该对象放在linkedHashMap的最后
        //
        LinkedHashMap<String, String> map = new LinkedHashMap<String,String>(16,0.75f,true);
        map.put("1","aa");
        map.put("2","bb");
        map.put("3","cc");
        map.put("4","dd");
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        System.out.println(map.get("1"));
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
