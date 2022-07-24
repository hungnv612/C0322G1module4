package mainFile.service;

import mainFile.model.Declaration;

import java.util.List;

public interface IDeclarationService {
    List<Declaration> findAll();

    void save(Declaration declaration);

    Declaration findById(int id);

    void update(int id, Declaration declaration);
}
