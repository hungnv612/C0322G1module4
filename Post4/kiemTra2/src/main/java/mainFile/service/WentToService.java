package mainFile.service;

import mainFile.repository.WentToRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WentToService implements IWentToService{


    @Autowired
    WentToRepository wentToRepository;


    @Override
    public List<String> findAll() {
        return wentToRepository.findAll();
    }
}
