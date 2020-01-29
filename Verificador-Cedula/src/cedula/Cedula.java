/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedula;

import javax.swing.JOptionPane;

/**
 *
 * @author edwin cruz
 */
public class Cedula extends javax.swing.JFrame {

    /**
     * Creates new form Cedula
     */
    public Cedula() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        txtCantidadDigitos.setVisible(false);
        txtSumaPares.setVisible(false);
        txtSumaImpares.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadDigitos = new javax.swing.JTextField();
        txtSumaPares = new javax.swing.JTextField();
        txtSumaImpares = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cedula : ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedulaKeyReleased(evt);
            }
        });

        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad Numeros :");

        jLabel4.setText("Suma Pares :");

        jLabel5.setText("Suma Impares :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSumaPares, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadDigitos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSumaImpares, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadDigitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSumaPares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSumaImpares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int num, cant = 0, sumapar = 0, sumaimpar = 0, digito = 0, sumaimpartotal = 0, sumapartotal = 0;
            num = Integer.parseInt(txtcedula.getText());

            String numero;
            numero = txtcedula.getText();
            String[] division = numero.split("");
            int dg1, dg2, dg3, dg4, dg5, dg6, dg7, dg8, dg9, numero1;
            int op1, op2, op3, op4, op5, op6, op7, op8, op9;
            int suma = 0, res = 0, deverificador;
            numero1 = Integer.parseInt(numero);

            if (numero.length() == 10) {
                dg1 = Integer.parseInt(division[division.length - 10]);
                dg2 = Integer.parseInt(division[division.length - 9]);
                dg3 = Integer.parseInt(division[division.length - 8]);
                dg4 = Integer.parseInt(division[division.length - 7]);
                dg5 = Integer.parseInt(division[division.length - 6]);
                dg6 = Integer.parseInt(division[division.length - 5]);
                dg7 = Integer.parseInt(division[division.length - 4]);
                dg8 = Integer.parseInt(division[division.length - 3]);
                dg9 = Integer.parseInt(division[division.length - 2]);
                deverificador = Integer.parseInt(division[division.length - 1]);

                jLabel2.setText(" " + dg1 + " " + dg2 + " " + dg3 + " " + dg4 + " " + dg5 + " " + dg6 + " " + dg7 + " " + dg8 + " " + dg9);

                op1 = dg1 * 2;

                if (op1 >= 10) {
                    op1 = op1 - 9;
                }
                op2 = dg2 * 1;
                op3 = dg3 * 2;
                if (op3 >= 10) {
                    op3 = op3 - 9;
                }
                op4 = dg4 * 1;
                op5 = dg5 * 2;
                if (op5 >= 10) {
                    op5 = op5 - 9;
                }
                op6 = dg6 * 1;
                op7 = dg7 * 2;
                if (op7 >= 10) {
                    op7 = op7 - 9;
                }
                op8 = dg8 * 1;
                op9 = dg9 * 2;
                if (op9 >= 10) {
                    op9 = op9 - 9;
                }

                suma = op1 + op2 + op3 + op4 + op5 + op6 + op7 + op8 + op9;
                res = suma % 10;

                if (res == 0) {
                    if (res == deverificador) {
                        jLabel2.setText("CI correcta");
                    } else {
                        jLabel2.setText("CI incorrecta");
                        jLabel3.setVisible(false);
                        jLabel4.setVisible(false);
                        jLabel5.setVisible(false);
                        txtCantidadDigitos.setVisible(false);
                        txtSumaPares.setVisible(false);
                        txtSumaImpares.setVisible(false);
                        txtcedula.setText("");
                        txtCantidadDigitos.setText("");
                        txtSumaPares.setText("");
                        txtSumaImpares.setText("");
                    }
                }
                if (res >= 1) {
                    res = 10 - res;
                    if (res == deverificador) {
                        jLabel2.setText(" Digito Correcto " + res);
                        jLabel3.setVisible(true);
                        jLabel4.setVisible(true);
                        jLabel5.setVisible(true);
                        txtCantidadDigitos.setVisible(true);
                        txtSumaPares.setVisible(true);
                        txtSumaImpares.setVisible(true);

                        while (num > 0) {
                            digito = (num % 100) / 10;
                            if (digito % 2 == 0) {
                                sumapar = sumapar + digito;
                                sumapartotal = sumapar + res;
                            } else if (digito % 2 != 0) {
                                sumaimpar = sumaimpar + digito;
                                sumaimpartotal = sumaimpar + res;
                            }

                            cant = cant + 1;
                            num = Math.round(num / 10);
                        }
                        if (res % 2 != 0) {
                            txtSumaImpares.setText(String.valueOf(sumaimpartotal));

                        } else {
                            txtSumaImpares.setText(String.valueOf(sumaimpar));

                        }
                        if (res % 2 == 0) {
                            txtSumaPares.setText(String.valueOf(sumapartotal));

                        } else {
                            txtSumaPares.setText(String.valueOf(sumapar));

                        }

                        txtCantidadDigitos.setText(String.valueOf(cant));
                    } else {
                        jLabel2.setText("CI incorrecta");
                        jLabel3.setVisible(false);
                        jLabel4.setVisible(false);
                        jLabel5.setVisible(false);
                        txtCantidadDigitos.setVisible(false);
                        txtSumaPares.setVisible(false);
                        txtSumaImpares.setVisible(false);
                        txtcedula.setText("");
                        txtCantidadDigitos.setText("");
                        txtSumaPares.setText("");
                        txtSumaImpares.setText("");

                    }

                } else {
                    jLabel2.setText("CI incorrecta");
                    jLabel3.setVisible(false);
                    jLabel4.setVisible(false);
                    jLabel5.setVisible(false);
                    txtCantidadDigitos.setVisible(false);
                    txtSumaPares.setVisible(false);
                    txtSumaImpares.setVisible(false);
                    txtcedula.setText("");
                    txtCantidadDigitos.setText("");
                    txtSumaPares.setText("");
                    txtSumaImpares.setText("");
                }

            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed


    }//GEN-LAST:event_txtcedulaActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyReleased
        String numero;
        numero = txtcedula.getText();
        if (numero.length() >= 11) {
            JOptionPane.showMessageDialog(null, "Rango Incorrecto");
            txtcedula.setText("");
            txtCantidadDigitos.setText("");
            txtSumaPares.setText("");
            txtSumaImpares.setText("");
        }

    }//GEN-LAST:event_txtcedulaKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cedula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCantidadDigitos;
    private javax.swing.JTextField txtSumaImpares;
    private javax.swing.JTextField txtSumaPares;
    private javax.swing.JTextField txtcedula;
    // End of variables declaration//GEN-END:variables
}
