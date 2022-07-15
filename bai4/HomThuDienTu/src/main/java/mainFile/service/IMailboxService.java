package mainFile.service;

import mainFile.model.Mailbox;

import java.util.List;

public interface IMailboxService {
    List<Mailbox> returnMailboxList();

    void update(int id);
}
