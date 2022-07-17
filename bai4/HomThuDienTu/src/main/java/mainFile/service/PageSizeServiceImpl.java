package mainFile.service;

import mainFile.repository.PageSizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageSizeServiceImpl implements PageSizeService {
    @Autowired
    PageSizeRepository pageSizeRepository;

    @Override
    public List<Integer> showAll() {
        return pageSizeRepository.showAll();
    }
}
