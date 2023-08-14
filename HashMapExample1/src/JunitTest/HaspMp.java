package JunitTest;

import java.util.HashMap;

public class HaspMp {
    public static HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        hm.put(1,10);
        hm.put(2,20);
        hm.put(3,30);
        System.out.print(add(1,2));
    }
    public static boolean add(int a,int b)
    {
        return true;
    }
}
