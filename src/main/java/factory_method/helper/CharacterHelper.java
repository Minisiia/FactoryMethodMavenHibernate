package factory_method.helper;

import factory_method.character.impl.Archer;
import factory_method.character.impl.Warrior;
import factory_method.character.impl.Wizard;
import factory_method.character.interfaces.GameCharacter;
import factory_method.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CharacterHelper {
    private SessionFactory sf;

    public CharacterHelper() {
        sf = HibernateUtil.getSessionFactory();
    }

    public GameCharacter getById(long id) {
        Session session = sf.openSession();
        GameCharacter gameCharacter = session.get(GameCharacter.class, id);
        session.close();
        return gameCharacter;
    }

    public List<Archer> getAllArchers() {
        Session session = sf.openSession();
        Criteria criteria = session.createCriteria(Archer.class);
        List<Archer> list = criteria.list();
        session.close();
        return list;
    }

    public List<Warrior> getAllWarriors() {
        Session session = sf.openSession();
        Criteria criteria = session.createCriteria(Warrior.class);
        List<Warrior> list = criteria.list();
        session.close();
        return list;
    }

    public List<Wizard> getAllWizards() {
        Session session = sf.openSession();
        Criteria criteria = session.createCriteria(Wizard.class);
        List<Wizard> list = criteria.list();
        session.close();
        return list;
    }


    public void addCharacter(GameCharacter character) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(character);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteWizard(int id) {
        Session session = sf.openSession();
        session.beginTransaction();
        Wizard character = session.get(Wizard.class, id);
        session.delete(character);
        session.getTransaction().commit();
        session.close();
    }
}
