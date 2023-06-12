package HWsem2;

// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//         используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//         Если значение null, то параметр не должен попадать в запрос.
//         Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


import java.util.LinkedHashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<String, String> param = new LinkedHashMap<>();

        param.put("name", "Ivanov");
        param.put("country", "Russia");
        param.put("city", "Moscow");
        param.put("age", null);
        getQuery(param);
    }

    public static void getQuery(Map <String, String> params) {
        StringBuilder a = new StringBuilder();
        for (Map.Entry <String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                a.append(" and " + pair.getKey() + " = '" + pair.getValue() + "'");
            }
        }
        a.delete(0, 4);

        String s = a.toString();
        System.out.println(s);
    }
}