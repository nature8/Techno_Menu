package hibcrud;
import hibernate.beans.Staters;
import hibernate.beans.Drinks;
import hibernate.beans.Dessert;
import hibernate.beans.MainCourse;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class DeleteRecord {
    public static void main(String...ar){
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your choice");
        System.out.println("1. Delete from desserts");
        System.out.println("2. Delete from drinks");
        System.out.println("3. Delete from main course");
        System.out.println("4. Delete from staters");
        System.out.println("5. Exit");
        /*JOptionPane.showMessageDialog(this," Enter your choice...");
        JOptionPane.showMessageDialog(this,"1. Delete from dessert");
        JOptionPane.showMessageDialog(this,"2. Delete from drinks");
        JOptionPane.showMessageDialog(this,"3. Delete form main course");
        JOptionPane.showMessageDialog(this,"4. Delete from staters");
        JOptionPane.showMessageDialog(this,"5. Exit!!");*/
        byte choice = sc.nextByte();
        switch(choice){
            case 1:
                System.out.println("Enter category:");
                String ctg = sc.next();
                sc.next();
                System.out.println("Enter Dish name:");
                String dNm = sc.nextLine();
                sc.next();
                System.out.println("Enter main Ingredients:");
                String mIng = sc.nextLine();
                sc.next();
                System.out.println("Enter rate of the dish");
                int price1 = sc.nextInt();
                Dessert ds = new Dessert(ctg, dNm, mIng, price1);
                session.delete(ds);
                tx.commit();
                session.close();
                System.out.println("The dish from dessert is deleted");
                break;
            case 2:
                System.out.println("Enter category:");
                String ctg2 = sc.next();
                sc.next();
                System.out.println("Enter Dish name:");
                String dNm2 = sc.nextLine();
                sc.next();
                System.out.println("Enter main Ingredients:");
                String mIng2 = sc.nextLine();
                sc.next();
                System.out.println("Enter rate of the dish");
                int price2 = sc.nextInt();
                sc.next();
                Drinks drin = new Drinks(ctg2, dNm2, mIng2, price2);
                session.delete(drin);
                tx.commit();
                session.close();
                System.out.println("The dish from drinks is deleted");
                break;
            case 3:
                System.out.println("Enter category:");
                String ctg3 = sc.next();
                sc.next();
                System.out.println("Enter Dish name:");
                String dNm3 = sc.nextLine();
                sc.next();
                System.out.println("Enter main Ingredients:");
                String mIng3 = sc.nextLine();
                sc.next();
                System.out.println("Enter rate of the dish");
                int price3 = sc.nextInt();
                MainCourse mCourse = new MainCourse(ctg3, dNm3, mIng3, price3);
                session.delete(mCourse);
                tx.commit();
                session.close();
                System.out.println("Record deleted from main course");
                break;
            case 4:
                System.out.println("Enter category:");
                String ctg4 = sc.next();
                sc.next();
                System.out.println("Enter Dish name:");
                String dNm4 = sc.nextLine();
                sc.next();
                System.out.println("Enter main Ingredients:");
                String mIng4 = sc.nextLine();
                sc.next();
                System.out.println("Enter rate of the dish");
                int price4 = sc.nextInt();
                Staters st = new Staters(ctg4, dNm4, mIng4, price4);
                session.delete(st);
                tx.commit();
                session.close();
                System.out.println("Record deleted from staters");
                break;
            case 5:
                System.exit(0);
            default:
                throw new AssertionError();
        }
    }
}
