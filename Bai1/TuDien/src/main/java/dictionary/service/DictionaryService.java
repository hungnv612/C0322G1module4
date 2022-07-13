package dictionary.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService {
    private static Map<String, String> dictionary = new HashMap<>();

    static {

        dictionary.put("hello", "Xin chao");
        dictionary.put("how", "The nao");
        dictionary.put("book", "Quyen vo");
        dictionary.put("computer", "May tinh");

    }

    @Override
    public String dictionary(String s) {
        String result = dictionary.get(s);
        String resultSet;
        if (result != null) {
            resultSet = result;
        } else {
            resultSet = "Not found";
        }

        return resultSet;
    }
}
