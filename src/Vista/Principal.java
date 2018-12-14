package Vista;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMatriculas = new javax.swing.JButton();
        btnPersonas = new javax.swing.JButton();
        Escritorio = new javax.swing.JDesktopPane();
        btnSalir = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        btnMatriculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnMatricula.png"))); // NOI18N
        btnMatriculas.setToolTipText("Agregar, modificar y eliminar matriculas.");
        btnMatriculas.setFocusPainted(false);
        btnMatriculas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnMatriculaA.png"))); // NOI18N
        btnMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMatriculas);
        btnMatriculas.setBounds(2, 110, 70, 49);

        btnPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImagenBotonPersonas.png"))); // NOI18N
        btnPersonas.setToolTipText("Agregar, modificar y eliminar personas.");
        btnPersonas.setFocusPainted(false);
        btnPersonas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImagenBotonPersonasA.png"))); // NOI18N
        btnPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonasActionPerformed(evt);
            }
        });
        jPanel1.add(btnPersonas);
        btnPersonas.setBounds(2, 10, 70, 49);

        Escritorio.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImagenFondoDesktop.png")))); // NOI18N

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        jPanel1.add(Escritorio);
        Escritorio.setBounds(70, 10, 930, 540);
        Escritorio.getAccessibleContext().setAccessibleName("");
        Escritorio.getAccessibleContext().setAccessibleDescription("");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImagenBotonSalirPrincipal.png"))); // NOI18N
        btnSalir.setToolTipText("Salir.");
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImagenBotonSalirPrincipalA.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(2, 210, 70, 49);

        btnCursos.setBackground(new java.awt.Color(0, 0, 0));
        btnCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnCurso.png"))); // NOI18N
        btnCursos.setToolTipText("Agregar, modificar y eliminar cursos.");
        btnCursos.setFocusPainted(false);
        btnCursos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnCursoA.png"))); // NOI18N
        btnCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCursos);
        btnCursos.setBounds(2, 60, 70, 49);

        btnInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImagenBotonInformes.png"))); // NOI18N
        btnInformes.setToolTipText("Informes.");
        btnInformes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImagenBotonInformesA.png"))); // NOI18N
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });
        jPanel1.add(btnInformes);
        btnInformes.setBounds(2, 160, 70, 49);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImagenFondoPrincipal.png"))); // NOI18N
        jPanel1.add(lblFondo);
        lblFondo.setBounds(0, 0, 1005, 558);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1010, 558));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonasActionPerformed
       Escritorio.removeAll();
       Escritorio.repaint();
       VistaPersonas vistapersonas = new VistaPersonas();
       vistapersonas.setVisible(true);
       Escritorio.add(vistapersonas);
       Escritorio.moveToFront(vistapersonas);
    }//GEN-LAST:event_btnPersonasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosActionPerformed
       Escritorio.removeAll();
       Escritorio.repaint();
       VistaCursos vistacursos2 = new VistaCursos();
       vistacursos2.setVisible(true);
       Escritorio.add(vistacursos2);
       Escritorio.moveToFront(vistacursos2);
    }//GEN-LAST:event_btnCursosActionPerformed

    private void btnMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculasActionPerformed
       Escritorio.removeAll();
       Escritorio.repaint();
       VistaMatriculas vistaMatriculas = new VistaMatriculas();
       vistaMatriculas.setVisible(true);
       Escritorio.add(vistaMatriculas);
       Escritorio.moveToFront(vistaMatriculas);
    }//GEN-LAST:event_btnMatriculasActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
       Escritorio.removeAll();
       Escritorio.repaint();
       VistaInformes vistaInformes = new VistaInformes();
       vistaInformes.setVisible(true);
       Escritorio.add(vistaInformes);
       Escritorio.moveToFront(vistaInformes);
    }//GEN-LAST:event_btnInformesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnMatriculas;
    private javax.swing.JButton btnPersonas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
