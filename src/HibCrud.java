package hibcrud;
import hibernate.beans.AdminTable;
import hibernate.beans.Bill;
import hibernate.beans.Dessert;
import hibernate.beans.Drinks;
import hibernate.beans.MainCourse;
import hibernate.beans.Staters;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
public class HibCrud {
    public static void main(String...ar){
        Configuration c1 = new Configuration();
        Configuration c2 = c1.configure();//use to load cfg file
        SessionFactory sf = c2.buildSessionFactory();//use to execute cfg tags
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //AdminTable at = new AdminTable("pt@121","9089");
        //Bill bl = new Bill("ab@","Nat","9320","kfgf",50,"jgtg");
        //session.save(bl);
        //session.save(at);//replacement of insert query
//        Staters st = new Staters("Indian","MangoShake","Mango",50);
//        session.save(st);
//        MainCourse cm = new MainCourse("Indian","Thal","Grain, wheat",250);
//        session.save(cm);
//        Drinks dk = new Drinks("Indian","MilkShak","Milk",50);
//        session.save(dk);
        Dessert ds = new Dessert("rasgulla","Indian","Milk",150);
        session.save(ds);
        tx.commit();//to save the record in the table
        session.close();
        System.out.println("Inserted!!!");
    }
}
