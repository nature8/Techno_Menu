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
public class SearchDish {
    public static void main(String ar[]){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("*******Index********");
        System.out.println("1. Dish Name");
        System.out.println("2. Enter Category");
        System.out.println("3. Exit");
        byte choice = sc.nextByte();
        switch(choice){
            case 1:
                System.out.println("Enter dish name");
                String cate = sc.next();
                Staters sta = (Staters)session.get(Staters.class, cate);
                Drinks sta1 = (Drinks)session.get(Drinks.class, cate);
                Dessert sta2 = (Dessert)session.get(Dessert.class, cate);
                MainCourse sta3 = (MainCourse)session.get(MainCourse.class, cate);
                if(sta==null && sta1==null && sta2==null && sta3==null){
                    System.out.println("No record found to search");
                }
                else{
                    System.out.println(sta.getDishName()+" "+sta.getPrice());
                    System.out.println(sta1.getDishName()+" "+sta1.getPrice());
                    System.out.println(sta2.getDishName()+" "+sta2.getPrice());
                    System.out.println(sta3.getDishName()+" "+sta3.getPrice());
                }
                break;
            case 2:
                System.out.println("Enter Dish name:");
                String cat = sc.nextLine();
                Staters st = (Staters)session.get(Staters.class, cat);
                Drinks st1 = (Drinks)session.get(Drinks.class, cat);
                Dessert st2 = (Dessert)session.get(Dessert.class, cat);
                MainCourse st3 = (MainCourse)session.get(MainCourse.class, cat);
                if(st==null && st1==null && st2==null && st3==null){
                    System.out.println("No record found to search");
                }
                else{
                    System.out.println(st.getDishName()+" "+st.getPrice());
                    System.out.println(st1.getDishName()+" "+st1.getPrice());
                    System.out.println(st2.getDishName()+" "+st2.getPrice());
                    System.out.println(st3.getDishName()+" "+st3.getPrice());
                }
                break;
            case 3:
                System.exit(0);
                
            default:
                throw new AssertionError();
        }
        tx.commit();
        session.close();
    }
}
