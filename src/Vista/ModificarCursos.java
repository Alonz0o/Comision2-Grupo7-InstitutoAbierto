
package Vista;

import Modelo.Conexion;
import Modelo.Cursos;
import Modelo.CursosData;
import Modelo.Personas;
import Modelo.PersonasData;
import static Vista.Principal.Escritorio;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ModificarCursos extends javax.swing.JInternalFrame {
    private CursosData cursosData;
    private PersonasData personasData;
    private Conexion conexion;
    public ModificarCursos(String idCurso) {
        initComponents();
        this.setLocation(450, 25);
        try {
            conexion = new Conexion("jdbc:mysql://localhost/institutoabierto", "root", "");
            personasData = new PersonasData(conexion);
            cursosData = new CursosData(conexion);
            PlaceHolder htbNombre = new PlaceHolder(tbNombreCursoModificar, Color.GRAY, Color.BLACK, "Ingrese nuevo nombre", false, title, 13);
            PlaceHolder htbCosto = new PlaceHolder(tbCostoCursoModificar, Color.GRAY, Color.BLACK, "Ingrese nuevo costo", false, title, 13);
            PlaceHolder htbCupoMaximo = new PlaceHolder(tbCupoMaximoCursoModificar, Color.GRAY, Color.BLACK, "Ingrese nuevo cupo", false, title, 13); 
            PlaceHolder htbDNI = new PlaceHolder(tbBuscarPersona, Color.GRAY, Color.BLACK, "Ingrese DNI", false, title, 13); 
   
            
            Cursos cursos = cursosData.buscarCursosPorID(Integer.parseInt(idCurso));                   
            Personas personas = personasData.buscarPersonasPorId(cursos.getPersonas().getIdpersonas());    
            tbBuscarPersona.setText(personas.getDni()); 
            lblNombrePersona.setText(personas.getNombre()); 
            lblID.setText(cursos.getIdcursos()+"");           
            cursos.getPersonas().getIdpersonas();
            tbNombreCursoModificar.setText(cursos.getNombre());
            tbCostoCursoModificar.setText(cursos.getCosto()+"");
            tbCupoMaximoCursoModificar.setText(cursos.getCupomaximo()+"");
            taDescripcionCursoModificar.setText(cursos.getDescripcion());
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        tbNombreCursoModificar = new javax.swing.JTextField();
        tbCostoCursoModificar = new javax.swing.JTextField();
        tbCupoMaximoCursoModificar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescripcionCursoModificar = new javax.swing.JTextArea();
        lblDescripcion = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnBuscarPersona = new javax.swing.JButton();
        tbBuscarPersona = new javax.swing.JTextField();
        lblNombrePersona = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblTabla = new javax.swing.JLabel();
        lblImagenFondo = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(null);

        pnlDatos.setOpaque(false);
        pnlDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbNombreCursoModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlDatos.add(tbNombreCursoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 260, 30));

        tbCostoCursoModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlDatos.add(tbCostoCursoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 260, 30));

        tbCupoMaximoCursoModificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlDatos.add(tbCupoMaximoCursoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, 30));

        taDescripcionCursoModificar.setColumns(20);
        taDescripcionCursoModificar.setRows(5);
        jScrollPane1.setViewportView(taDescripcionCursoModificar);

        pnlDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, -1));

        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcion.setText("Descripcion:");
        pnlDatos.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/ImagenModificar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        pnlDatos.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 30, 30));

        btnBuscarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVistaCursos/ImagenBuscar.png"))); // NOI18N
        btnBuscarPersona.setMaximumSize(new java.awt.Dimension(65, 20));
        btnBuscarPersona.setMinimumSize(new java.awt.Dimension(65, 20));
        btnBuscarPersona.setPreferredSize(new java.awt.Dimension(65, 20));
        btnBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPersonaActionPerformed(evt);
            }
        });
        pnlDatos.add(btnBuscarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 30, 30));

        tbBuscarPersona.setBackground(new java.awt.Color(204, 204, 255));
        tbBuscarPersona.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlDatos.add(tbBuscarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 30));

        lblNombrePersona.setBackground(new java.awt.Color(255, 0, 0));
        lblNombrePersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePersona.setText("Nombre");
        lblNombrePersona.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlDatos.add(lblNombrePersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/ImagenApagado.png"))); // NOI18N
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
        lblTabla.getAccessibleContext().setAccessibleDescription("");

        lblImagenFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alonz0\\ImagenFondo.png")); // NOI18N
        jPanel3.add(lblImagenFondo);
        lblImagenFondo.setBounds(0, 0, 330, 490);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
                                              
        if ("".equals(tbBuscarPersona.getText())|| "Ingrese DNI".equals(tbBuscarPersona.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese DNI");
        }
        else if ("".equals(tbNombreCursoModificar.getText())|| "Ingrese nuevo nombre".equals(tbNombreCursoModificar.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese nombre");
        }
        else if ("".equals(tbCostoCursoModificar.getText())|| "Ingrese nuevo costo".equals(tbCostoCursoModificar.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese costo");
        }
        else if ("".equals(tbCupoMaximoCursoModificar.getText())|| "Ingrese nuevo cupo".equals(tbCupoMaximoCursoModificar.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese cupo maximo");
        }
        else if ("".equals(taDescripcionCursoModificar.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese descripcion");
        }
        else{
                String nombre = tbNombreCursoModificar.getText();
                String descripcion = taDescripcionCursoModificar.getText();
                double costo = Double.parseDouble(tbCostoCursoModificar.getText());
                int cupomaximo = Integer.parseInt(tbCupoMaximoCursoModificar.getText());
                boolean activo = true;
                boolean habilitado = true;
                int id = Integer.parseInt(lblID.getText());                              
                Personas personas = personasData.buscarPersonasPorDni(Integer.parseInt(tbBuscarPersona.getText()));  
                
                Cursos curso = new Cursos(id,personas,nombre,descripcion,costo,cupomaximo,activo,habilitado);
                cursosData.modificarCurso(curso);
                Escritorio.removeAll();
                Escritorio.repaint();
                VistaCursos vistacursos2 = new VistaCursos();
                vistacursos2.setVisible(true);
                Escritorio.add(vistacursos2);
                Escritorio.moveToFront(vistacursos2);              
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPersonaActionPerformed
        Personas personas = personasData.buscarPersonasPorDni(Integer.parseInt(tbBuscarPersona.getText()));

        if(personas!=null){
            lblNombrePersona.setText(personas.getNombre());
        }
        else{
            JOptionPane.showMessageDialog(null, "Error profesor no encontrado: ");
        }
    }//GEN-LAST:event_btnBuscarPersonaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPersona;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblImagenFondo;
    private javax.swing.JLabel lblNombrePersona;
    private javax.swing.JLabel lblTabla;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextArea taDescripcionCursoModificar;
    private javax.swing.JTextField tbBuscarPersona;
    private javax.swing.JTextField tbCostoCursoModificar;
    private javax.swing.JTextField tbCupoMaximoCursoModificar;
    private javax.swing.JTextField tbNombreCursoModificar;
    // End of variables declaration//GEN-END:variables
}
