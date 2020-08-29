package pl.sda.twitter.persistance.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import pl.sda.twitter.persistance.HibernateUtil;
import pl.sda.twitter.persistance.entities.TbUser;

//DAO data access object
public class UserDao {

    public TbUser getUserByLogin(String login){
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Query q = session.createQuery(
                    "SELECT e FROM TbUser e WHERE e.login=:username");
            q.setParameter("username", login);
            session.beginTransaction();
            q.getSingleResult();
            session.close();
        }
    }
}
