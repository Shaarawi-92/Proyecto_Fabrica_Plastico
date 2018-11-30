package Ventanas;

import Clases.Funciones_Texto_Objeto;
import static Ventanas.Registro.ObjetosEmpleados;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Bajas extends javax.swing.JFrame {

    public Bajas()
    {
        this.setTitle("Proyecto Final");
        initComponents();
        this.setLocationRelativeTo(null);
        agregarItemsCombobox();
    }
    
    public void cerrar()
    {
        Object [] opciones ={"SI","NO"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,"¿DESEAS SALIR COMPLETAMENTE DEL PROGRAMA?","Mensaje de Confirmacion",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION)
        {
            mensaje("HAS CERRADO SESION");
            dispose();
            Inicio_Sesion inicio = new Inicio_Sesion();
            inicio.setVisible(true);
        }   
        else
        {
            ;
        }
    }
    
    public static void mensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    public String combobox;
    public int index;
    public ArrayList ordenados = new ArrayList();
    
    public void agregarItemsCombobox()
    {
        jComboBox1.removeAll();
        Funciones_Texto_Objeto.Leer_Archivo_Objeto(ObjetosEmpleados, "Objeto.bin");
        for(int i = 0; i < ObjetosEmpleados.size(); i++)
        {
            ordenados.add(i, ObjetosEmpleados.get(i).getID());
        }
        Collections.sort(ordenados);
        for(int i = 0; i < ObjetosEmpleados.size(); i++)
        {
            jComboBox1.addItem((String.valueOf(ordenados.get(i))));
        }
    }
    
    public void Cambiar_text()
    {
        for(int i = 0; i < ObjetosEmpleados.size(); i++)
        {
            if(jComboBox1.getSelectedItem().equals(String.valueOf(ObjetosEmpleados.get(i).getID())))
            {
                jTextField2.setText(ObjetosEmpleados.get(i).getNombre());
                jTextField3.setText(ObjetosEmpleados.get(i).getApellidoP());
                jTextField4.setText(ObjetosEmpleados.get(i).getApellidoM());
                jTextField5.setText(ObjetosEmpleados.get(i).getTelefono());
                jTextField6.setText(ObjetosEmpleados.get(i).getSeguro());
                jTextField7.setText(ObjetosEmpleados.get(i).getDireccion());
                jTextField8.setText(String.valueOf(ObjetosEmpleados.get(i).getSalario()));
                jTextField9.setText(String.valueOf(ObjetosEmpleados.get(i).getTurno()));
                index = i;
                System.out.println(index);
                break;
            }
        }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        jLabel1.setText("ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 66, 31, 14);

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 109, 80, 14);

        jTextField2.setName("Direccion"); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(158, 101, 130, 30);

        jLabel3.setText("Apellido Paterno:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 157, 100, 14);

        jTextField3.setName("Telefono"); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(158, 149, 130, 30);

        jLabel4.setText("Apellido Materno:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 205, 108, 14);

        jTextField4.setName("Password"); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(158, 197, 130, 30);

        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 255, 60, 14);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(158, 247, 130, 30);

        jLabel6.setText("Seguro Social:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 303, 80, 14);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(158, 295, 130, 30);

        jLabel7.setText("Direccion:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 354, 100, 14);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(158, 346, 130, 30);

        jLabel8.setText("Salario:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 405, 80, 14);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(158, 397, 130, 30);

        jLabel9.setText("Turno:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 453, 100, 14);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(158, 445, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Bajas");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(175, 11, 42, 22);

        jButton2.setText("Atrás");
        getContentPane().add(jButton2);
        jButton2.setBounds(81, 512, 59, 23);

        jButton1.setText("Dar De Baja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(221, 512, 120, 23);

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(353, 0, 20, 20);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(158, 63, 80, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ObjetosEmpleados.remove(index);
        Funciones_Texto_Objeto.Update_Archivo(ObjetosEmpleados, "Objeto.bin");
        jComboBox1.removeAll();
        ordenados.removeAll(ordenados);
        mensaje("Empleado Dado De Baja Correctamente");
        dispose();
        Administrador Ventana_Administrador =  new Administrador();
        Ventana_Administrador.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        Cambiar_text();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        Administrador Ventana_Administrador =  new Administrador();
        Ventana_Administrador.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cerrar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setExtendedState(Inicio_Sesion.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bajas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
