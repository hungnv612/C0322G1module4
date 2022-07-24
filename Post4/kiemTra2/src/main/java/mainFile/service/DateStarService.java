package mainFile.service;

import mainFile.repository.DateStarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateStarService implements IDateStarService{

    @Autowired
    DateStarRepository dateStarRepository;

    @Override
    public List<String> findAll() {
        return dateStarRepository.findAll();
    }
}
