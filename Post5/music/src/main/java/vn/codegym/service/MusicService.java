package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Music;
import vn.codegym.repository.IMusicRepository;

import java.util.List;

@Service
public class MusicService implements IMusicService {

    @Autowired
    private IMusicRepository iMusicRepository;

    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        iMusicRepository.save(music);
    }

    @Override
    public Music findById(Integer id) {
        return iMusicRepository.findById(id);
    }

    @Override
    public void update(Integer id,Music music) {
        iMusicRepository.update(id,music);
    }

    @Override
    public void remove(Music music) {
        iMusicRepository.remove(music);
    }

    @Override
    public List<Music> searchByName(String name) {
        return null;
    }
}
