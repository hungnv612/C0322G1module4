package mainFile.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DateEndRepository implements IDateEndRepository{
    private static final List<String> dateEndList;

    static {
        dateEndList = new ArrayList<>();
        dateEndList.add("13/11/2024");
        dateEndList.add("12/12/2026");
        dateEndList.add("13/13/2027");
        dateEndList.add("14/14/2028");
    }


    @Override
    public List<String> findAll() {
        return dateEndList;
    }
}
