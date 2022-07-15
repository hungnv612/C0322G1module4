package mainFile.repository;

import mainFile.model.Mailbox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailboxRepository implements IMailboxRepository {

    static List<Mailbox> mailboxList = new ArrayList<>();

    static {
        mailboxList.add(new Mailbox(1,"VietNam", 15, true, "viet"));
        mailboxList.add(new Mailbox(2,"VietNam", 25, false, "nam"));
        mailboxList.add(new Mailbox(3,"English", 25, true, "thien"));
        mailboxList.add(new Mailbox(4,"VietNam", 15, false, "hai"));
    }

    @Override
    public List<Mailbox> returnMailboxList() {
        return mailboxList;
    }

    @Override
    public void update(Mailbox mailbox) {

    }

    @Override
    public Mailbox findById(int id) {
        return null;
    }


}
