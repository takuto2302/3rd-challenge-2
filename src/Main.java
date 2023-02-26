import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, String> crewMap = new HashMap<>() {{
        put("ルフィ", "船長");
        put("サンジ", "料理長");
        put("ブルック", "音楽家");

    }};

    public static void main(String[] args) {
        try {
            System.out.println(findCrewlist("ウソップ"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String findCrewlist(String name) throws Exception {
        String crewName = crewMap.get(name);

        if (crewName == null) {
            throw new Exception("該当ありません。");
        }
        return crewName;
    }

}
