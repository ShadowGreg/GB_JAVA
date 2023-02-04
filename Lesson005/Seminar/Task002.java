import java.util.HashMap;
import java.util.Map;

public class Task002 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Москва","Самара");
        map.put("Курск","Пенза");
        map.put("Самара","Курск");
        Task002 task002 = new Task002();
        System.out.println(task002.getFinalCity(map));

    }

    public String getFinalCity(final Map<String, String> map){
        for (String value: map.values()) {
            if (!map.containsKey(value))
                return value;
        }
        return null;
    }
}
