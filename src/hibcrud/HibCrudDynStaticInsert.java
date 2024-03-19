package hibcrud;
import hibernate.beans.AdminTable;
import java.util.Scanner;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
public class HibCrudDynStaticInsert {
    public static void main(String...ar){
        Configuration c1 = new Configuration();
        Configuration c2 = c1.configure();//use to load cfg file
        SessionFactory sf = c2.buildSessionFactory();//use to execute cfg tags
        //SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        //AdminTable at = new AdminTable("pt@12","9089");
        System.out.println("Enter login id:");
        String loginId = sc.nextLine();
        System.out.println("Enter password:");
        String pswd = sc.nextLine();
        AdminTable at = new AdminTable(loginId, pswd);
        session.save(at);//replacement of insert query
        tx.commit();//to save the record in the table
        session.close();
        System.out.println("Inserted!!!");
    }
}