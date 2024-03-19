package hibcrud;
import hibernate.beans.Dessert;
import hibernate.beans.Drinks;
import hibernate.beans.MainCourse;
import hibernate.beans.Staters;
import java.util.Scanner;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
public class InsertNewDish {
    public static void main(String ar[]){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the category in which you want to insert the new dish");
        System.out.println("1. Insert in Desserts");
        System.out.println("2. Insert in Drinks");
        System.out.println("3. Insert in MainCourse");
        System.out.println("4. Insert Staters");
        System.out.println("5. Exit");
        byte choice = sc.nextByte();
        switch(choice){
            case 1: {
                System.out.println("Enter category:");
                String ctg = sc.next();
                System.out.println("Enter Dish name:");
                String dNm = sc.nextLine();
                System.out.println("Enter main Ingredients:");
                String mIng = sc.nextLine();
                System.out.println("Enter rate of the dish");
                int price1 = sc.nextInt();
                Dessert ds = new Dessert(ctg, dNm, mIng, price1);
                session.save(ds);
                tx.commit();
                session.close();
                System.out.println("Dish added to the menu");
                break;
            }
            case 2: {
                System.out.println("Enter category:");
                String ctg2 = sc.next();
                System.out.println("Enter Dish name:");
                String dNm2 = sc.nextLine();
                System.out.println("Enter main Ingredients:");
                String mIng2 = sc.nextLine();
                System.out.println("Enter rate of the dish");
                int price2 = sc.nextInt();
                Drinks drin = new Drinks(ctg2, dNm2, mIng2, price2);
                session.save(drin);
                tx.commit();
                session.close();
                System.out.println("Dish added to the menu");
                break;
            }
            case 3: {
                System.out.println("Enter category:");
                String ctg3 = sc.next();
                System.out.println("Enter Dish name:");
                String dNm3 = sc.nextLine();
                System.out.println("Enter main Ingredients:");
                String mIng3 = sc.nextLine();
                System.out.println("Enter rate of the dish");
                int price3 = sc.nextInt();
                MainCourse mCourse = new MainCourse(ctg3, dNm3, mIng3, price3);
                session.save(mCourse);
                tx.commit();
                session.close();
                System.out.println("Dish added to the menu");
                break;
            }
            case 4:{
                System.out.println("Enter category:");
                String cat4 = sc.nextLine();
                sc.next();
                System.out.println("Enter dish name:");
                String dNm4 = sc.nextLine();
                sc.next();
                System.out.println("Enter main ingredients:");
                String mIng4 = sc.nextLine();
                sc.next();
                System.out.println("Enter price:");
                int price = sc.nextInt();
                Staters st = new Staters(cat4, dNm4, mIng4, price);
                session.save(st);
                tx.commit();
                session.close();
                System.out.println("Dish Added to the menu!!!");
            }
            /*case 4 ->{
                System.out.println("Add table number which are available:");
                int tabNo = sc.nextInt();
                TableNumber tb = new TableNumber(tabNo);
                session.save(tb);
                tx.commit();
                session.close();
                System.out.println("Table added");
                break;
            } */              
            case 5: System.exit(0);
        }
        
        
    }    
}
