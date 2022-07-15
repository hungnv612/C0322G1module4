package mainFile.service;

import mainFile.model.Mailbox;
import mainFile.repository.IMailboxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailboxService implements IMailboxService {

    @Autowired
    IMailboxRepository iMailboxRepository;

    @Override
    public List<Mailbox> returnMailboxList() {
        return iMailboxRepository.returnMailboxList();
    }

    @Override
    public void update(int id) {

    }
}
