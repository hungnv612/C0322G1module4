package mainFile.repository;

import mainFile.model.Declaration;

import java.util.List;

public interface IDeclarationRepository {

    List<Declaration> findAll();

    void save(Declaration declaration);

    Declaration findById(int id);

    void update(int id, Declaration declaration);
}
