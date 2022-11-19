package notas;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nota1 = new javax.swing.JLabel();
        campoNota1 = new javax.swing.JTextField();
        nota2 = new javax.swing.JLabel();
        campoNota2 = new javax.swing.JTextField();
        nota3 = new javax.swing.JLabel();
        campoNota3 = new javax.swing.JTextField();
        nota4 = new javax.swing.JLabel();
        campoNota4 = new javax.swing.JTextField();
        nota5 = new javax.swing.JLabel();
        campoNota5 = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        promedio = new javax.swing.JLabel();
        desviacion = new javax.swing.JLabel();
        mayor = new javax.swing.JLabel();
        menor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nota1.setText("Nota 1:");

        nota2.setText("Nota 2:");

        nota3.setText("Nota 3:");

        nota4.setText("Nota 4:");

        nota5.setText("Nota 5:");

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        promedio.setText("Promedio");

        desviacion.setText("Desviación estándar");

        mayor.setText("Valor mayor");

        menor.setText("Valor menor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menor, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desviacion, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(calcular)
                            .addGap(53, 53, 53)
                            .addComponent(limpiar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nota5)
                                    .addGap(37, 37, 37)
                                    .addComponent(campoNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nota4)
                                        .addGap(37, 37, 37)
                                        .addComponent(campoNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nota3)
                                        .addGap(37, 37, 37)
                                        .addComponent(campoNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nota2)
                                        .addGap(37, 37, 37)
                                        .addComponent(campoNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nota1)
                                        .addGap(37, 37, 37)
                                        .addComponent(campoNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota1)
                    .addComponent(campoNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota2)
                    .addComponent(campoNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota3)
                    .addComponent(campoNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota4)
                    .addComponent(campoNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota5)
                    .addComponent(campoNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular)
                    .addComponent(limpiar))
                .addGap(26, 26, 26)
                .addComponent(promedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(desviacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mayor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menor)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        
        Notas notas = new Notas(); // Se crea un objeto Notas
        // Se obtiene y convierte el valor numérico de la nota 1
        notas.listaNotas[0] = Double.parseDouble(campoNota1.getText());
        // Se obtiene y convierte el valor numérico de la nota 2
        notas.listaNotas[1] = Double.parseDouble(campoNota2.getText());
        // Se obtiene y convierte el valor numérico de la nota 3
        notas.listaNotas[2] = Double.parseDouble(campoNota3.getText());
        // Se obtiene y convierte el valor numérico de la nota 4
        notas.listaNotas[3] = Double.parseDouble(campoNota4.getText());
        // Se obtiene y convierte el valor numérico de la nota 5
        notas.listaNotas[4] = Double.parseDouble(campoNota5.getText());
        notas.calcularPromedio(); // Se calcula el promedio
        notas.calcularDesviación(); // Se calcula la desviación
        // Se muestra el promedio formateado
        promedio.setText("Promedio = " + String.valueOf(String.format("%.2f",notas.calcularPromedio())));
        double desv = notas.calcularDesviación();
        desviacion.setText("Desviación estándar = " + String.format("%.2f", desv));
        mayor.setText("Valor mayor = " + String.valueOf(notas.calcularMayor()));
        menor.setText("Valor menor = " + String.valueOf(notas.calcularMenor()));
    }//GEN-LAST:event_calcularActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        campoNota1.setText("");
        campoNota2.setText("");
        campoNota3.setText("");
        campoNota4.setText("");
        campoNota5.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JTextField campoNota1;
    private javax.swing.JTextField campoNota2;
    private javax.swing.JTextField campoNota3;
    private javax.swing.JTextField campoNota4;
    private javax.swing.JTextField campoNota5;
    private javax.swing.JLabel desviacion;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel mayor;
    private javax.swing.JLabel menor;
    private javax.swing.JLabel nota1;
    private javax.swing.JLabel nota2;
    private javax.swing.JLabel nota3;
    private javax.swing.JLabel nota4;
    private javax.swing.JLabel nota5;
    private javax.swing.JLabel promedio;
    // End of variables declaration//GEN-END:variables
}
