
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp;
import ssp.acc;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author manjeet
 */
public class sign extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
String e,p;
int c;
    /**
     * Creates new form Main
     */
    public sign() {
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

        signup = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        paswd = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        user = new javax.swing.JLabel();
        registered = new javax.swing.JLabel();
        signin = new javax.swing.JLabel();
        signUp = new javax.swing.JButton();
        SignIn = new javax.swing.JButton();
        signbox = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1340, 840));
        setMinimumSize(new java.awt.Dimension(1080, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        signup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 0));
        signup.setText("New User?");
        getContentPane().add(signup);
        signup.setBounds(340, 350, 80, 20);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(340, 280, 190, 30);

        paswd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paswd.setForeground(new java.awt.Color(204, 204, 204));
        paswd.setText("Password:");
        getContentPane().add(paswd);
        paswd.setBounds(340, 250, 100, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(340, 210, 190, 30);

        user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(204, 204, 204));
        user.setText("Username:");
        getContentPane().add(user);
        user.setBounds(340, 170, 70, 30);

        registered.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registered.setForeground(new java.awt.Color(51, 0, 51));
        registered.setText("* For Registered Users Only");
        getContentPane().add(registered);
        registered.setBounds(530, 120, 180, 20);

        signin.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        signin.setForeground(new java.awt.Color(204, 204, 204));
        signin.setText("Sign In");
        getContentPane().add(signin);
        signin.setBounds(330, 110, 170, 40);

        signUp.setText("Sign Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        getContentPane().add(signUp);
        signUp.setBounds(340, 380, 80, 23);

        SignIn.setText("Sign In");
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });
        getContentPane().add(SignIn);
        SignIn.setBounds(340, 320, 80, 23);

        signbox.setBackground(new java.awt.Color(153, 204, 255));
        signbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssp/lc (4).jpg"))); // NOI18N
        signbox.setOpaque(true);
        getContentPane().add(signbox);
        signbox.setBounds(310, 90, 480, 330);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 840);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssp/lc (2).jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-20, 0, 1120, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        // TODO add your handling code here:
        acc m;
        m = new acc();
        m.setVisible(true);
    }//GEN-LAST:event_signUpActionPerformed

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed
        // TODO add your handling code here:
        String email = jTextField1.getText();
        String pass = new String(jPasswordField1.getPassword());
        try{Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/aryan","root","root");
        stmt= con.createStatement();
        rs = stmt.executeQuery("select * from customers where email='"+ email +"' ;");
        while(rs.next()){
        String p = rs.getString("password");
        if(p.equals(pass)){
        JOptionPane.showMessageDialog(null,"You Have Signed In Successfully"); }
        else {JOptionPane.showConfirmDialog(null,"Username Or Password Is Incorrect!");}
        }
     rs.close();
     stmt.close();
     con.close();
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());}
        
        
             Frame3_1 y;
        y = new Frame3_1();
        y.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_SignInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel paswd;
    private javax.swing.JLabel registered;
    private javax.swing.JButton signUp;
    private javax.swing.JLabel signbox;
    private javax.swing.JLabel signin;
    private javax.swing.JLabel signup;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
