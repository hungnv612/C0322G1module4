package dictionary.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class DictionaryRepository implements IDictionaryRepository{
   private static Map<String, String> dictionary = new HashMap<>();

    static {

        dictionary.put("hello", "Xin chao");
        dictionary.put("how", "The nao");
        dictionary.put("book", "Quyen vo");
        dictionary.put("computer", "May tinh");

    }

    @Override
    public String Dictionary(String s) {
        String result = dictionary.get(s);
        String resultSet;
        if(result != null){
            resultSet = result;
        } else {
            resultSet = "Not found";
        }

        return resultSet;
    }
}
