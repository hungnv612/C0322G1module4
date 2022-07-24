package mainFile.service;

import mainFile.repository.FiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiveService implements IFiveService{

    @Autowired
    FiveRepository fiveRepository;


    @Override
    public List<String> findAll() {
        return fiveRepository.findAll();
    }
}
