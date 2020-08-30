package pl.sda.twitter.persistance.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import pl.sda.twitter.persistance.HibernateUtil;
import pl.sda.twitter.persistance.entities.TbUser;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

//DAO data access object
public class UserDao {

    public TbUser getUserByLogin(String login) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query q = session.createQuery(
                    "SELECT e FROM " + TbUser.class.getName() +" e WHERE e.login=:username");
            q.setParameter("username", login);
            session.beginTransaction();
            TbUser singleResult = (TbUser) q.getSingleResult();
            session.getTransaction().commit();
            return singleResult;
        } catch (NoResultException e) {
            return null;
        } catch (NonUniqueResultException e) {
            return null;
        }
    }
}
