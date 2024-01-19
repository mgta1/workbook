package Test;

import java.util.HashMap;
import java.util.Map;

public class Test814 {
    public static void main(String[] args) {
        HashMap<String, String> season = new HashMap<String, String>();
        season.put("野菜", "季節");
        season.put("キャベツ", "春");
        season.put("スイカ", "夏");
        season.put("ナス", "秋");
        season.put("ハクサイ", "冬");

        for(Map.Entry<String, String> entry : season.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
