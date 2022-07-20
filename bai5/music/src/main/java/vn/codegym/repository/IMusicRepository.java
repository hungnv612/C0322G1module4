package vn.codegym.repository;

import vn.codegym.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();

    void save(Music music);

    Music findById(Integer id);

    void update(Integer id,Music music);

    void remove(Music music);

    List<Music> searchByName(String name);
}
