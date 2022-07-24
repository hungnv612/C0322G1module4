package vn.codegym.service;

import vn.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    Music findById(Integer id);

    void update(Integer id,Music music);

    void remove(Music music);

    List<Music> searchByName(String name);
}
