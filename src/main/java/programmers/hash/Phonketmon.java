package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Phonketmon {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        String name = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                name = entry.getKey();
                break;
            }
        }
        return name;
    }
}
