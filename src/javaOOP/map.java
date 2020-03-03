package javaOOP;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("morning", "buổi sáng");
        map.put("afternoon", "buổi trưa");
        map.put("evening", "buổi chiều");
        map.put("evening", "buổi tối");
        map.put(new Integer("64"), "sáu mươi tư");
        map.put("g9", "ngủ ngon");
        System.out.println("CÁC BUỔI TRONG NGÀY: " + map);
        System.out.println(map.get("morning"));
        System.out.println(map.get("afternoon"));
        System.out.println(map.get("evening"));
        System.out.println(map.get("g9"));
        System.out.println("TỔNG : " + map.size() + " BUỔI.");
        map.remove("morning"); // remove LOẠI BỎ 1 MỤC
        System.out.println(map.get("morning")); // bị remove --> NULL
        System.out.println(map.get("afternoon"));
        System.out.println(map);
        map.clear(); // LOẠI BỎ TẤT CẢ
        System.out.println(map.get("g9"));
        System.out.println(map);
    }
}
