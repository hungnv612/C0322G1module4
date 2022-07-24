package mainFile.repository;

import mainFile.model.Email;

import java.util.List;

public interface EmailRepository {
    List<Email> findAll();

    Email findOne(Integer id);

    void save(Integer id, Email email);
}
