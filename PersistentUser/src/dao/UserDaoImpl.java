package dao;

import entities.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDaoImpl implements IUserDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public UserDaoImpl() {
        emf = Persistence.createEntityManagerFactory("PersistentUserPU");
        em = emf.createEntityManager();
    }

    @Override
    public User findById(int id) {

        User user = em.find(User.class, id);
        return user;
    }

    @Override
    public List<User> findAll() {

        return em.createQuery("SELECT u FROM User u ",
                User.class).getResultList();

    }

    @Override
    public boolean deleteById(int id) {
        em.getTransaction().begin();   
        User user = em.find(User.class, id);

        if (user != null) {
            em.remove(user);
            em.getTransaction().commit();
            return true;
        } else {
             em.getTransaction().commit();
            return false;
        }
        

    }

    @Override
    
   public boolean updateById (int id, User user) {
       em.getTransaction().begin();  
       User u= em.find(User.class, id);
       
       if(user !=null)
       { 
       u.setFirst_name(user.getFirst_name());
       u.setLast_name(user.getLast_name());
       u.setEmail(user.getEmail());
       u.setTel(user.getTel());
       
        em.getTransaction().commit();
           return true;
       }else
       {
            em.getTransaction().commit();
           return false;
       }
        
    }

    @Override
    public boolean save(User user) {
        
        if(user!=null){
            
      em.getTransaction().begin();  
       em.persist(user);
      em.getTransaction().commit();
      return true;
      
        }else{ 
        em.getTransaction().commit();
           return false;
        }
        
        
        
        
    }

}
