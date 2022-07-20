package vn.codegym.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Music;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class MusicRepository implements IMusicRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Music> findAll() {
        TypedQuery<Music> musicList = entityManager.createQuery("select m from Music as m", Music.class);
        return musicList.getResultList();
    }

    @Override
    public void save(Music music) {
        entityManager.persist(music);
    }

    @Override
    public Music findById(Integer id) {
        return entityManager.find(Music.class, id);
    }

    @Override
    public void update(Integer id,Music music) {
        entityManager.merge(music);

    }

    @Override
    public void remove(Music music) {
        entityManager.remove(findById(music.getId()));
    }

    @Override
    public List<Music> searchByName(String name) {
        return null;
    }
}
