/*package hibcrud;
import hibernate.beans.Staters;
import hibernate.beans.Drinks;
import hibernate.beans.Dessert;
import hibernate.beans.MainCourse;

import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import java.util.Scanner;
public class UpdateRecord 
{
    public static void main(String...ar)
    {
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your choice");
        System.out.println("1. Update to desserts");
        System.out.println("2. Update to drinks");
        System.out.println("3. Update to main course");
        System.out.println("4. Update to staters");
        System.out.println("5. Exit");
        int choice = sc.nextInt();
        switch(choice)
        {
            case (1):
                System.out.println("Enter Dish name:");
                String cat = sc.nextLine();
                Staters st = (Staters)session.get(Staters.class, cat);
                Drinks st1 = (Drinks)session.get(Drinks.class, cat);
                Dessert st2 = (Dessert)session.get(Dessert.class, cat);
                MainCourse st3 = (MainCourse)session.get(MainCourse.class, cat);
                //Dessert ds = new Dessert(ctg, dNm, mIng, price1);
                if(st==null && st1==null && st2==null && st3==null){
                    System.out.println("No record found");
                }
                else{
                session.update(st2);
                tx.commit();
                session.close();
                System.out.println("The dish from dessert is updated");
                break;
            case (2):{
                System.out.println("Enter Dish name:");
                String cat1 = sc.nextLine();
                Staters sta = (Staters)session.get(Staters.class, cat);
                Drinks drink1 = (Drinks)session.get(Drinks.class, cat);
                Dessert dess1 = (Dessert)session.get(Dessert.class, cat);
                MainCourse mnC1 = (MainCourse)session.get(MainCourse.class, cat);
                if(sta==null && drink1==null && dess1==null && mnC==null){
                    System.out.println("No record found to update!!!");
                }
                else{
                
                    System.out.println("----------INDEX-----------");
                    System.out.println("");
                System.out.println("Enter category:");
                String catt=sc.nextLine();
                sc.next();
                System.out.println("Enter dish name:");
                String dNm1= sc.nextLine();
                sc.next();
                System.out.println("Enter Main ingredient:");
                String mIng1 = sc.nextLine();
                sc.next();
                System.out.println("Enter price:");
                int price1 = sc.nextInt();
                
                session.update(drink1);
                tx.commit();
                session.close();
                System.out.println("The dish from drinks is updated");
                }
                break;
                }
            case (3):
                System.out.println("Enter Dish name:");
                String cat2 = sc.nextLine();
                Staters sta2 = (Staters)session.get(Staters.class, cat);
                Drinks drink2 = (Drinks)session.get(Drinks.class, cat);
                Dessert dess2 = (Dessert)session.get(Dessert.class, cat);
                MainCourse mnC2 = (MainCourse)session.get(MainCourse.class, cat);
                //Dessert ds = new Dessert(ctg, dNm, mIng, price1);
                if(sta2==null && drink2==null && dess2==null && mnC3==null){
                    System.out.println("No record found");
                }
                else{
                session.update(mnC2);
                tx.commit();
                session.close();
                System.out.println("The dish from main course is updated");
                break;
            case (4):
                System.out.println("Enter Dish name:");
                String cat3 = sc.nextLine();
                Staters sta3 = (Staters)session.get(Staters.class, cat);
                Drinks drinks3 = (Drinks)session.get(Drinks.class, cat);
                Dessert dess3 = (Dessert)session.get(Dessert.class, cat);
                MainCourse mnC3 = (MainCourse)session.get(MainCourse.class, cat);
                //Dessert ds = new Dessert(ctg, dNm, mIng, price1);
                if(sta3==null && drink3==null && dess3==null && mnC3==null){
                    System.out.println("No record found");
                }
                else{
                session.update(sta3);
                tx.commit();
                session.close();
                System.out.println("The dish from stater is updated");
                break;
            default:
                System.exit(0);
        }
    }
}
*/