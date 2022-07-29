package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDAO {

    @PersistenceContext
    private EntityManager entityManager;
    public List<User> index() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public User show(long id) {
        return entityManager.find(User.class, id);
    }

    public void save (User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    public void update(User user) {
        entityManager.merge(user);
        entityManager.flush();
    }

    public void delete(long id) {
        entityManager.remove(show(id));
    }
}
