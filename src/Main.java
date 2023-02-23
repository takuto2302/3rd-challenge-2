import java.util.HashMap;
import java.util.Map;

public class Main {

     public static Map<String,String> crewList = new HashMap<>(){{
            put("ルフィ","船長");
            put("サンジ","料理長");
            put("ブルック","音楽家");

        }};

    public static void main(String[] args) {
        try {
            System.out.println(findcrewList("ウソップ"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String findcrewList(String name)
        throws Exception{
        String crewName = crewList.get(name);

        if(crewName == null){
            throw new Exception("該当ありません。");
        }
        return crewName;
    }

    }
