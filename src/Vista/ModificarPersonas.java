package Vista;

import Modelo.Conexion;
import Modelo.Personas;
import Modelo.PersonasData;
import static Vista.Principal.Escritorio;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ModificarPersonas extends javax.swing.JInternalFrame {
    
    private PersonasData personasData;
    private Conexion conexion;

    public ModificarPersonas(String idPersona) {
        initComponents();
        this.setLocation(450, 25);
        try {
            conexion = new Conexion("jdbc:mysql://localhost/institutoabierto", "root", "");
            personasData = new PersonasData(conexion);
            PlaceHolder htbNombre = new PlaceHolder(tbNombrePersonaModificar, Color.GRAY, Color.BLACK, "Ingrese nuevo nombre", false, title, 13);
            PlaceHolder htbDni = new PlaceHolder(tbDniPersonaModificar, Color.GRAY, Color.BLACK, "Ingrese nuevo DNI", false, title, 13);
            PlaceHolder htbCelular = new PlaceHolder(tbCelularPersonaModificar, Color.GRAY, Color.BLACK, "Ingrese nuevo celular", false, title, 13);
                      
            Personas personas = personasData.buscarPersonasPorId(Integer.parseInt(idPersona));
            lblID.setText(personas.getIdpersonas()+"");        ;    
            tbNombrePersonaModificar.setText(personas.getNombre());                       
            tbDniPersonaModificar.setText(personas.getDni());
            tbCelularPersonaModificar.setText(personas.getCelular()+"");
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        tbNombrePersonaModificar = new javax.swing.JTextField();
        tbDniPersonaModificar = new javax.swing.JTextField();
        tbCelularPersonaModificar = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblTabla = new javax.swing.JLabel();
        lblImagenFondo = new javax.swing.JLabel();

        setBorder(null);

        jPanel3.setLayout(null);

        pnlDatos.setOpaque(false);
        pnlDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbNombrePersonaModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlDatos.add(tbNombrePersonaModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 30));

        tbDniPersonaModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlDatos.add(tbDniPersonaModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 30));

        tbCelularPersonaModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlDatos.add(tbCelularPersonaModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 30));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/ImagenModificar.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar persona.");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        pnlDatos.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 30, 30));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/ImagenApagado.png"))); // NOI18N
        btnSalir.setToolTipText("Salir.");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlDatos.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 30, 30));

        jPanel3.add(pnlDatos);
        pnlDatos.setBounds(30, 90, 270, 370);

        lblID.setEnabled(false);
        jPanel3.add(lblID);
        lblID.setBounds(0, 0, 0, 0);

        lblTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVistaCursos/ImagenTabla.png"))); // NOI18N
        jPanel3.add(lblTabla);
        lblTabla.setBounds(15, 20, 290, 448);

        lblImagenFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alonz0\\ImagenFondo.png")); // NOI18N
        jPanel3.add(lblImagenFondo);
        lblImagenFondo.setBounds(0, 0, 330, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if ("".equals(tbNombrePersonaModificar.getText())|| "Ingrese nuevo nombre".equals(tbNombrePersonaModificar.getText())){

            JOptionPane.showMessageDialog(null, "Ingrese nombre");
        }
        else if ("".equals(tbDniPersonaModificar.getText())|| "Ingrese nuevo DNI".equals(tbDniPersonaModificar.getText())){

            JOptionPane.showMessageDialog(null, "Ingrese DNI");
        }
        else if ("".equals(tbCelularPersonaModificar.getText())|| "Ingrese nuevo celular".equals(tbCelularPersonaModificar.getText())){

            JOptionPane.showMessageDialog(null, "Ingrese celular");
        }
        else{
            String nombre = tbNombrePersonaModificar.getText();
            String dni = tbDniPersonaModificar.getText();
            String celular = tbCelularPersonaModificar.getText();
            boolean activo = true;
            boolean habilitado = true;
            int id = Integer.parseInt(lblID.getText());     

            Personas personas = new Personas(id,nombre,dni,celular,activo,habilitado);           
            personasData.actualizarPersonas(personas);
            JOptionPane.showMessageDialog(null, "Persona modificada");
            Escritorio.removeAll();
            Escritorio.repaint();
            VistaPersonas vistaPersonas = new VistaPersonas();
            vistaPersonas.setVisible(true);
            Escritorio.add(vistaPersonas);
            Escritorio.moveToFront(vistaPersonas);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblImagenFondo;
    private javax.swing.JLabel lblTabla;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField tbCelularPersonaModificar;
    private javax.swing.JTextField tbDniPersonaModificar;
    private javax.swing.JTextField tbNombrePersonaModificar;
    // End of variables declaration//GEN-END:variables
}
