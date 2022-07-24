package mainFile.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class WentToRepository implements IWentToRepository{

    private static final List<String> wentToList;

    static {
        wentToList = new ArrayList<>();
        wentToList.add("đà nẵng");
        wentToList.add("hội an");
        wentToList.add("hà nội");
        wentToList.add("huế");
    }

    @Override
    public List<String> findAll() {
        return wentToList;
    }
}
