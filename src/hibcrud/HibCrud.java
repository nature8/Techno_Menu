package hibcrud;
import hibernate.beans.AdminTable;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
public class HibCrud {
    public static void main(String...ar) 
    {
        Configuration c1 = new Configuration();
        Configuration c2 = c1.configure();//use to load cfg file
        SessionFactory sf = c2.buildSessionFactory();//use t execute cfg tags
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        AdminTable at = new AdminTable("pt@12","9089");
        session.save(at);//replacement of insert query
        tx.commit();//to save the record in the table
        session.close();
        System.out.println("Inserted!!!");
    }
}
