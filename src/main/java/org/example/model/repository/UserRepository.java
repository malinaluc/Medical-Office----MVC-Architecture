package org.example.model.repository;

import org.example.model.entity.User;
import org.hibernate.query.Query;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.util.List;

import static org.example.utils.ExtensionFunctions.logDebug;

public class UserRepository extends AbstractRepository<User> {

    public User getUserByEmailAndPassword(String username, String password) {

        try (var session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cq = cb.createQuery(User.class);
            Root<User> root = cq.from(User.class);


            Predicate usernamePredicate = cb.equal(root.get("username"), username);
            Predicate passwordPredicate = cb.equal(root.get("password"), password);
            cq.select(root).where(cb.and(usernamePredicate, passwordPredicate));

            TypedQuery<User> query = session.createQuery(cq);
            return query.getSingleResult();
        } catch (NoResultException e) {
            // Handle case where no user found
            logDebug("No user found with the provided username and password");
        } catch (Exception e) {
            // Handle other exceptions
            logDebug("---getUserByEmailAndPassword--- " + e);
        }
        return null;
    }

    public User findByID(Integer userID) {
        return findById(userID);
    }

    public List<User> allUsersByUserTypeID(Integer userTypeID) {
        try (var session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cq = cb.createQuery(User.class);
            Root<User> root = cq.from(User.class);

            // Specify the selection criteria
            cq.select(root).where(cb.equal(root.get("role"), userTypeID));

            Query<User> query = session.createQuery(cq);
            return query.getResultList();
        } catch (Exception e) {
            logDebug("---allUsersByUserTypeID--- " + e);
            return null;
        }
    }


}
