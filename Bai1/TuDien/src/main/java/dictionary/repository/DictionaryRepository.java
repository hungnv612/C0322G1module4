package dictionary.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository {

    private static Map<String, String> dictionary = new HashMap<>();

    static {

        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "máy tính");

    }

    @Override
    public Map<String, String> dictionary() {
        return dictionary;
    }

}
