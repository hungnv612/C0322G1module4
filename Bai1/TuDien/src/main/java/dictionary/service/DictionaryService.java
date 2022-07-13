package dictionary.service;

import dictionary.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    private IDictionaryRepository iDictionaryRepository;

    @Override
    public String dictionary(String s) {
        String result = iDictionaryRepository.dictionary().get(s);
        String resultSet;
        if (result != null) {
            resultSet = result;
        } else {
            resultSet = "Not found";
        }

        return resultSet;
    }
}
