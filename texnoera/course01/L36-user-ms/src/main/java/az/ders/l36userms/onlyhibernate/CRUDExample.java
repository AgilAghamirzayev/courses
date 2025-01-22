package az.ders.l36userms.onlyhibernate;


import az.ders.l36userms.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CRUDExample {

  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    try {
      tx.begin();

      // Create a new record
      User user = new User("John Doe", "johndoe@example.com");
      em.persist(user);

      // Retrieve a record
      user = em.find(User.class, 1L);
      System.out.println(user);

      // Update a record
//      user.setEmail("newemail@example.com");
      tx.commit();
      System.out.println(user);

      // Delete a record
      em.remove(user);
      tx.commit();
    } catch (Exception e) {
      if (tx.isActive()) {
        tx.rollback();
      }
      e.printStackTrace();
    } finally {
      em.close();
      emf.close();
    }
  }
}