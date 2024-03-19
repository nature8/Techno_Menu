import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import hibernate.beans.Dessert;
import java.util.Scanner;
//package hibcrud;

public class InsertDessert 
{
    public static void main(String ar[])
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        System.out.println("Enter category");
        Scanner sc = new Scanner(System.in);
        String cat = sc.nextLine();
        //sc.next();
        System.out.println("Enter dish name");
        String dish = sc.nextLine();
        //sc.next();
        System.out.println("Enter main ingredients");
        String ing = sc.nextLine();
        //sc.next();
        System.out.println("Enter price of the dish:");
        int rate = sc.nextInt();
        Dessert ds = new Dessert(cat, dish, ing, rate);
        session.save(ds);
        tx.commit();
        session.close();
        System.out.println("Inserted!!!");
    }    
}
