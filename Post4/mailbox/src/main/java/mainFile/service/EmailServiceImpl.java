package mainFile.service;


import mainFile.model.Email;
import mainFile.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    EmailRepository emailRepository;

    @Override
    public List<Email> findAll() {
        return emailRepository.findAll();
    }

    @Override
    public Email findOne(Integer id) {
        return emailRepository.findOne(id);
    }

    @Override
    public void save(Integer id, Email email) {
        emailRepository.save(id, email);
    }
}
