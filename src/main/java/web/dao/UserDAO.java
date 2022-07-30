package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<User> index() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Transactional
    public User show(long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public void save (User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Transactional
    public void update(User user) {
        entityManager.merge(user);
        entityManager.flush();
    }

    @Transactional
    public void delete(long id) {
        entityManager.remove(show(id));
    }
}
