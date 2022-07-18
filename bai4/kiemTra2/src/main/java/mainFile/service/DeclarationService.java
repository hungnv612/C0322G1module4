package mainFile.service;

import mainFile.model.Declaration;
import mainFile.repository.DeclarationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeclarationService implements IDeclarationService {

    @Autowired
    DeclarationRepository declarationRepository;

    @Override
    public List<Declaration> findAll() {
        return declarationRepository.findAll();
    }

    @Override
    public void save(Declaration declaration) {
        declarationRepository.save(declaration);
    }

    @Override
    public Declaration findById(int id) {
        return declarationRepository.findById(id);
    }

    @Override
    public void update(int id, Declaration declaration) {
        declarationRepository.update(id, declaration);
    }
}
