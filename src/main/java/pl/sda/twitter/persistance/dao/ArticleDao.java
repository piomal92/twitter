package pl.sda.twitter.persistance.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import pl.sda.twitter.persistance.HibernateUtil;
import pl.sda.twitter.persistance.entities.TbArticle;
import pl.sda.twitter.persistance.entities.TbUser;

import java.util.List;

public class ArticleDao {

    public List<TbArticle> getArticles(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            final Query q = session.createQuery("SELECT o FROM "
                    + TbArticle.class.getName() + " o");
            session.getTransaction().commit();
            return q.getResultList();
        }
    }
    public void addNewArticle(TbUser tbuser, String content){
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();

            final TbArticle tbArticle = new TbArticle();
            tbArticle.setContent(content);
            tbArticle.setUser(tbuser);
            session.save(tbArticle);
            session.getTransaction().commit();
        }

    }
}
