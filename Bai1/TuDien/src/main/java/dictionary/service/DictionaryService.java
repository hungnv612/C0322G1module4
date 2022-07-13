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
        return iDictionaryRepository.dictionary(s);
    }
}
