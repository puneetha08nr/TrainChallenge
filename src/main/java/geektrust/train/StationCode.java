package geektrust.train;

import java.util.HashMap;

public class StationCode {

    public static HashMap<String, Integer> afterHyderabad() {
        HashMap<String, Integer> stations = new HashMap<>();
        stations.put("HYB", 0);
        stations.put("NGP", 400);
        stations.put("ITJ", 700);
        stations.put("BPL", 800);
        stations.put("AGA", 1300);
        stations.put("NDL", 1500);
        stations.put("PTA", 1800);
        stations.put("NJP", 2200);
        stations.put("GHY", 2700);
        return stations;
    }
}
