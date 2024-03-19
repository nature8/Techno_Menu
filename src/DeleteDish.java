
import hibernate.beans.Dessert;
import hibernate.beans.Drinks;
import hibernate.beans.MainCourse;
import hibernate.beans.Staters;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class DeleteDish extends javax.swing.JFrame {

    /**
     * Creates new form DeleteDish
     */
    public DeleteDish() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DELETE FORM");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 170, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER DISH NAME TO DELETE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 280, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELECT TYPE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 120, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STATERS", "MAIN COURSE", "DESSERTS", "DRINKS" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 110, -1));

        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        jButton2.setText("BACK");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close1_1.jpg"))); // NOI18N
        jLabel21.setText("jLabel13");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 50, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        String type = (String)(jComboBox1.getSelectedItem());
        String dishName = jTextField1.getText();
        if(type.equalsIgnoreCase("Staters")){
            Staters ref1=(Staters)session.get(Staters.class,dishName );
            if(ref1==null){
                JOptionPane.showMessageDialog(null,"No record found to delete");
            }
            else{
                session.delete(ref1);
                JOptionPane.showMessageDialog(null,"Record deleted successfully!!");
            }
            tx.commit();
            session.close();
        }
        if(type.equalsIgnoreCase("MainCourse")){
            MainCourse ref2=(MainCourse)session.get(MainCourse.class,dishName );
            if(ref2==null){
                JOptionPane.showMessageDialog(null,"No record found to delete");
            }
            else{
                session.delete(ref2);
                JOptionPane.showMessageDialog(null,"Record deleted successfully!!");
            }
            tx.commit();
            session.close();
        }
        if(type.equalsIgnoreCase("Drinks")){
            Drinks ref3=(Drinks)session.get(Drinks.class,dishName );
            if(ref3==null){
                JOptionPane.showMessageDialog(null,"No record found to delete");
            }
            else{
                session.delete(ref3);
                JOptionPane.showMessageDialog(null,"Record deleted successfully!!");
            }
            tx.commit();
            session.close();
        }
        if(type.equalsIgnoreCase("Dessert")){
            Dessert ref4=(Dessert)session.get(Dessert.class,dishName );
            if(ref4==null){
                JOptionPane.showMessageDialog(null,"No record found to delete");
            }
            else{
                session.delete(ref4);
                JOptionPane.showMessageDialog(null,"Record deleted successfully!!");
            }
            tx.commit();
            session.close();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteDish().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}