package mainFile.repository;

import mainFile.model.Mailbox;

import java.util.List;

public interface IMailboxRepository {

    List<Mailbox> returnMailboxList();

    void update(Mailbox mailbox);

    Mailbox findById(int id);

}
