package mainFile.repository;

import mainFile.model.Declaration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class DeclarationRepository implements IDeclarationRepository {
    private static final List<Declaration> list;

    static {
        list = new ArrayList<>();
        list.add(new Declaration(1, "hung", "12/14/1512", "oto", "12/12/1212", "14/14/1414", "note"));
        list.add(new Declaration(2, "hai", "13/14/1616", "xe may", "13/13/1313", "12/12/1212", "note"));

    }


    @Override
    public List<Declaration> findAll() {
        return list;
    }

    @Override
    public void save(Declaration declaration) {
        list.add(declaration);
    }

    @Override
    public Declaration findById(int id) {
        Declaration declaration = null;
        for (Declaration item : list) {
            if (item.getId() == id) {
                declaration = new Declaration(item.getId(), item.getName(), item.getDate(), item.getVehicle(), item.getDateStar(), item.getDateEnd(), item.getNote());
            }
        }
        return declaration;
    }


    @Override
    public void update(int id, Declaration declaration) {
        for (Declaration value : list) {
            if (id == value.getId()) {
                value.setName(declaration.getName());
                value.setDate(declaration.getDate());
                value.setVehicle(declaration.getVehicle());
                value.setDateStar(declaration.getDateStar());
                value.setDateEnd(declaration.getDateEnd());
                value.setNote(declaration.getNote());
            }
        }
    }
}
