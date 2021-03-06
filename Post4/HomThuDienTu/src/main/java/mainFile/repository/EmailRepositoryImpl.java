package mainFile.repository;

import mainFile.model.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepositoryImpl implements EmailRepository {
    private static final List<Email> emailList;

    static {
        emailList = new ArrayList<>();
        emailList.add(new Email(1, "English", 5, true, "Hai"));
        emailList.add(new Email(2, "Chinese", 100, false, "Hung"));
        emailList.add(new Email(3, "Japanese", 25, false, "Duc"));
        emailList.add(new Email(4, "Vietnamese", 15, true, "Thang"));
    }

    @Override
    public List<Email> findAll() {
        return emailList;
    }

    @Override
    public Email findOne(Integer id) {
        Email email = null;
        for (Email item : emailList) {
            if (item.getId().equals(id)) {
                email = new Email(item.getId(), item.getLanguage(), item.getPageSize(), item.isSpamFilter(), item.getSignature());
            }
        }
        return email;
    }

    @Override
    public void save(Integer id, Email email) {
        for (Email value : emailList) {
            if (id.equals(value.getId())) {
                value.setLanguage(email.getLanguage());
                value.setPageSize(email.getPageSize());
                value.setSpamFilter(email.isSpamFilter());
                value.setSignature(email.getSignature());
            }
        }
    }
}
