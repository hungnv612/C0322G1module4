package mainFile.repository;

import mainFile.model.Declaration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class FiveRepository implements IFiveRepository {

    private static final List<String> fiveList;

    static {
        fiveList = new ArrayList<>();
        fiveList.add("1999");
        fiveList.add("2000");
        fiveList.add("2001");
        fiveList.add("2002");
    }

    @Override
    public List<String> findAll() {
        return fiveList;
    }
}
