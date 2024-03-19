package hibcrud;
import hibernate.beans.AdminTable;
import java.util.Scanner;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session; 
public class AdminSelfInfoUpdate {
    public static void main(String ar[]){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        //To change admin password
        System.out.println("Enter Email Id to change the password");
        String emailId = sc.next();
        AdminTable at = (AdminTable)session.get(AdminTable.class, emailId);
        if(emailId==null){
            System.out.println("You enter wrong id!!!");
        }
        else{
            System.out.println(at.getLoginId()+"  "+at.getPassword());
            System.out.println("Enter new password");
            String newpass = sc.next();
            at.setPassword(newpass);
        }
        tx.commit();
        session.close();
    }
}
