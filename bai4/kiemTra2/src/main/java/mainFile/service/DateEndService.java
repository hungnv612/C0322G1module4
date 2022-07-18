package mainFile.service;

import mainFile.repository.DateEndRepository;
import mainFile.repository.IDateEndRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateEndService implements IDateEndService{


    @Autowired
    DateEndRepository dateEndRepository;


    @Override
    public List<String> findAll() {
        return dateEndRepository.findAll();
    }
}
