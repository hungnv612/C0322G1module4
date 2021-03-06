package mainFile.service;

import mainFile.model.Email;

import java.util.List;

public interface EmailService {
    List<Email> findAll();

    Email findOne(Integer id);

    void save(Integer id, Email email);
}
