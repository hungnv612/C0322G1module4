package mainFile.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DateStarRepository implements IDateStarRepository{

    private static final List<String> dateStarList;

    static {
        dateStarList = new ArrayList<>();
        dateStarList.add("11/11/2020");
        dateStarList.add("12/12/2021");
        dateStarList.add("13/13/2022");
        dateStarList.add("14/14/2023");
    }

    @Override
    public List<String> findAll() {
        return dateStarList;
    }
}
