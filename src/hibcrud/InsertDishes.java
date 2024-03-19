package hibcrud;
import hibernate.beans.Staters;
import hibernate.beans.Drinks;
import hibernate.beans.Dessert;
import hibernate.beans.MainCourse;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import java.util.Scanner;
public class InsertDishes {
    public static void main(String...ar){
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your choice");
        System.out.println("1. Insert into desserts");
        System.out.println("2. Insert into drinks");
        System.out.println("3. Insert into main course");
        System.out.println("4. Insert into staters");
        System.out.println("5. Exit");
        byte choice = sc.nextByte();
        switch(choice){
            case 1:
                System.out.println("Enter category:");
                String ctg = sc.next();
                System.out.println("Enter Dish name:");
                String dNm = sc.next();
                System.out.println("Enter main Ingredients:");
                String mIng = sc.next();
                System.out.println("Enter rate of the dish");
                int price1 = sc.nextInt();
                Dessert ds = new Dessert(ctg, dNm, mIng, price1);
                session.save(ds);
                tx.commit();
                session.close();
                System.out.println("The dish into dessert is inserted");
                break;
            case 2:
                System.out.println("Enter category:");
                String ctg2 = sc.next();
                System.out.println("Enter Dish name:");
                String dNm2 = sc.next();
                System.out.println("Enter main Ingredients:");
                String mIng2 = sc.next();
                System.out.println("Enter rate of the dish");
                int price2 = sc.nextInt();
                Drinks ref1= new Drinks(ctg2, dNm2, mIng2, price2);
                session.save(ref1);
                tx.commit();
                session.close();
                System.out.println("The dish into drinks is inserted");
                break;
            case 3:
                System.out.println("Enter category:");
                String ctg3 = sc.next();
                System.out.println("Enter Dish name:");
                String dNm3 = sc.next();
                System.out.println("Enter main Ingredients:");
                String mIng3 = sc.next();
                System.out.println("Enter rate of the dish");
                int price3 = sc.nextInt();
                MainCourse ref3 = new MainCourse(ctg3, dNm3, mIng3, price3);
                session.save(ref3);
                tx.commit();
                session.close();
                System.out.println("The dish into main course is inserted");
                break;
            case 4:
                System.out.println("Enter category:");
                String ctg4 = sc.next();
                System.out.println("Enter Dish name:");
                String dNm4 = sc.next();
                System.out.println("Enter main Ingredients:");
                String mIng4 = sc.next();
                sc.next();
                System.out.println("Enter rate of the dish");
                int price4 = sc.nextInt();
                Staters ref4 = new Staters(ctg4, dNm4, mIng4, price4);
                session.save(ref4);
                tx.commit();
                System.out.println("The dish into stater4 is inserted");
                session.close();
                break;
            default:
                //throw new AssertionError();
                System.exit(0);
        }
    }
}
