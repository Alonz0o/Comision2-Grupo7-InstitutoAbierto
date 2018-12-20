package Vista;

import Modelo.Conexion;
import Modelo.Mayuscula;
import Modelo.Personas;
import Modelo.PersonasData;
import Modelo.Render;
import Modelo.TheModel;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VistaPersonas extends javax.swing.JInternalFrame {
    
    private PersonasData personasData;
    private ArrayList<Personas> listaPersonas;
    private Conexion conexion;
    private PlaceHolder htbNombre;
    private PlaceHolder htbDni;
    private PlaceHolder htbCelular;
    private PlaceHolder htbBuscar;
    private Mayuscula mayus;
    public VistaPersonas() {
        initComponents();       
        this.setLocation(9, 8);
         try {        
            mayus=new Mayuscula();
            conexion = new Conexion("jdbc:mysql://localhost/institutoabierto", "root", "");
            personasData = new PersonasData(conexion);  
            PlaceHolder htbNombre = new PlaceHolder(tbNombre, Color.GRAY, Color.BLACK, "Ingrese nombre", false, title, 13);
            htbDni = new PlaceHolder(tbDni, Color.GRAY, Color.BLACK, "Ingrese DNI", false, title, 13);
            htbCelular = new PlaceHolder(tbCelular, Color.GRAY, Color.BLACK, "Ingrese celular", false, title, 13); 
            htbBuscar = new PlaceHolder(tbBuscar, Color.GRAY, Color.BLACK, "Buscar persona", false, title, 13); 
            cargarTablaPersonas("","");
            limitarCaracteres(tbDni,8);
            limitarCaracteres(tbCelular,15);
            soloLetras(tbNombre);
            soloNumeros(tbCelular);
            soloNumeros(tbDni);
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPersonas = new javax.swing.JTable();
        tbNombre = new javax.swing.JTextField();
        tbDni = new javax.swing.JTextField();
        tbCelular = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        cbBuscar = new javax.swing.JComboBox<>();
        tbBuscar = new javax.swing.JTextField();
        lblImagenCuaderno = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        btnGitHub = new javax.swing.JButton();
        lblFondoImagen = new javax.swing.JLabel();

        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tPersonasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tPersonas);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 567, 170));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 270, 567, 170));

        tbNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbNombre.setOpaque(false);
        tbNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbNombreFocusLost(evt);
            }
        });
        getContentPane().add(tbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 92, 446, 30));

        tbDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbDni.setOpaque(false);
        getContentPane().add(tbDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 126, 446, 30));

        tbCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbCelular.setOpaque(false);
        getContentPane().add(tbCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 446, 30));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnPersonaAgregar.png"))); // NOI18N
        btnAgregar.setFocusPainted(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnPersonaAgregarA.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 52, 30));

        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "DNI", "Celular", "Activos", "Desactivado" }));
        cbBuscar.setOpaque(false);
        cbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(cbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 245, 274, 30));

        tbBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbBuscar.setOpaque(false);
        tbBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(tbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 245, 300, 30));

        lblImagenCuaderno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/ImagenCuaderno.png"))); // NOI18N
        getContentPane().add(lblImagenCuaderno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 610, 500));

        lblGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/Comisión 2  Grupo 7  Instituto Abierto.png"))); // NOI18N
        getContentPane().add(lblGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/GitHub-Logo.png"))); // NOI18N
        btnGitHub.setToolTipText("Ir a GitHub");
        btnGitHub.setOpaque(false);
        btnGitHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitHubActionPerformed(evt);
            }
        });
        getContentPane().add(btnGitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 35));

        lblFondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVistaCursos/ImagenFondo.jpg"))); // NOI18N
        lblFondoImagen.setOpaque(true);
        getContentPane().add(lblFondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if ("".equals(tbNombre.getText())|| "Ingrese nombre".equals(tbNombre.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese nombre");
        }
        else if ("".equals(tbDni.getText())|| "Ingrese DNI".equals(tbDni.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese DNI");
        }
        else if ("".equals(tbCelular.getText())|| "Ingrese celular".equals(tbCelular.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese celular");    
        }
        else{
            String nombre = tbNombre.getText();
            String dni = tbDni.getText();
            String celular = tbCelular.getText();         
            boolean habilitado= true;
            boolean activo= true;
            Personas  personas = new Personas(nombre,dni,celular,habilitado,activo);

            personasData.guardarPersona(personas);
            
            Limpiar();
            cargarTablaPersonas("","");    
            htbNombre = new PlaceHolder(tbNombre, Color.GRAY, Color.BLACK, "Ingrese nombre", false, title, 13);
            htbDni = new PlaceHolder(tbDni, Color.GRAY, Color.BLACK, "Ingrese DNI", false, title, 13);
            htbCelular = new PlaceHolder(tbCelular, Color.GRAY, Color.BLACK, "Ingrese celular", false, title, 13); 
        }      
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGitHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitHubActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/Alonz0o/Comision2-Grupo7-InstitutoAbierto").toURI());
        } catch (URISyntaxException ex) {
            Logger.getLogger(VistaPersonas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(VistaPersonas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VistaPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGitHubActionPerformed

    private void tPersonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPersonasMousePressed
        try {
            int column = tPersonas.getColumnModel().getColumnIndexAtX(evt.getX());
            int row = evt.getY()/tPersonas.getRowHeight();
            if(row < tPersonas.getRowCount() && row >= 0 && column < tPersonas.getColumnCount() && column >= 0){
            Object value = tPersonas.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;

                if(boton.getToolTipText().equals("Modificar"))          
                {       
                    System.out.println(boton.getName());
                    ModificarPersonas modificarPersonas = new ModificarPersonas(boton.getName());        
                    Principal.Escritorio.add(modificarPersonas);
                    modificarPersonas.toFront();
                    modificarPersonas.setVisible(true);                   
                }
                if(boton.getToolTipText().equals("Eliminar"))
                {
                    Limpiar();
                    int resp=JOptionPane.showConfirmDialog(null, "Desea eliminar este registro?", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                    if (JOptionPane.OK_OPTION == resp)
                    {
                        int id = Integer.parseInt(boton.getName());
                        Personas personas = personasData.buscarPersonasPorId(id);
            
                        personas.setActivo(false);
                        personasData.actualizarPersonas(personas);
                        Limpiar();
                        cargarTablaPersonas("","");
                    }
                    else
                    {
                        System.out.println("No selecciona una opción afirmativa");
                    }                 
                }
            }
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer datos de la tabla: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tPersonasMousePressed

    private void cbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarActionPerformed

        if(cbBuscar.getSelectedItem()=="Activos")
        {
            tbBuscar.setEnabled(false);
            
            cargarTablaPersonas("Activos","");
        }
        else if(cbBuscar.getSelectedItem()=="Desactivado")
        {
            tbBuscar.setEnabled(false);
            
            cargarTablaPersonas("Desactivado","");
        }
        else
        {
            tbBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_cbBuscarActionPerformed

    private void tbBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbBuscarKeyReleased
        String seleccionado = (String)cbBuscar.getSelectedItem();
       
        cargarTablaPersonas(seleccionado,tbBuscar.getText());
    }//GEN-LAST:event_tbBuscarKeyReleased
    
    private void tbNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbNombreFocusLost
        tbNombre.setText(mayus.convertir(tbNombre.getText()));
    }//GEN-LAST:event_tbNombreFocusLost
    
    public void cargarTablaPersonas(String seleccionado,String buscar){
        tPersonas.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel defaulttable = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column){
                System.out.println();
                return false;
            }
        }; 
        listaPersonas =(ArrayList) personasData.obtenerPersonas(seleccionado,buscar);
        
        String[] columnName = {"Id","Nombre","DNI","Celular","",""};
        Object[][] rows = new Object[listaPersonas.size()][6];
        for(int i = 0; i < listaPersonas.size(); i++)
        {
            JButton boton1 = new JButton(""); 
            JButton boton2 = new JButton("");
            boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/ImagenModificar.png")));             
            boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/ImagenBorrar.png")));
            boton1.setToolTipText("Modificar");
            boton2.setToolTipText("Eliminar");
            
            boton1.setName(listaPersonas.get(i).getIdpersonas()+"");
            boton2.setName(listaPersonas.get(i).getIdpersonas()+"");
            rows[i][0] = listaPersonas.get(i).getIdpersonas();
            rows[i][1] = listaPersonas.get(i).getNombre();
            rows[i][2] = listaPersonas.get(i).getDni();
            rows[i][3] = listaPersonas.get(i).getCelular();
            rows[i][4] = boton1;
            rows[i][5] = boton2;
        }
        
        TheModel model = new TheModel(rows, columnName);
        tPersonas.setModel(model);
        tPersonas.setRowHeight(30);
        tPersonas.getColumnModel().getColumn(1).setPreferredWidth(100);
        tPersonas.getColumnModel().getColumn(0).setMaxWidth(0);
        tPersonas.getColumnModel().getColumn(0).setMinWidth(0);
        tPersonas.getColumnModel().getColumn(0).setPreferredWidth(0);
        tPersonas.getColumnModel().getColumn(4).setMaxWidth(30);
        tPersonas.getColumnModel().getColumn(5).setMaxWidth(30);      
    }
    
    public void Limpiar(){    
        tbNombre.setText("");
        tbDni.setText("");
        tbCelular.setText("");        
    }
    
        public void soloLetras(JTextField a)
    {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if(Character.isDigit(c))
                {
                    e.consume();
                }
            }
        });
    }
        public void soloNumeros(JTextField a)
    {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if(!Character.isDigit(c))
                {
                    e.consume();
                }
            }
        });
        
    }
        public void limitarCaracteres(JTextField campo,int cantidad)
    {
        campo.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e)
           { 
               char c= e.getKeyChar();
               int tamaño=campo.getText().length();
               if(tamaño>=cantidad)
               {
                   e.consume();
               }
           }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGitHub;
    private javax.swing.JComboBox<String> cbBuscar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondoImagen;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblImagenCuaderno;
    private javax.swing.JTable tPersonas;
    private javax.swing.JTextField tbBuscar;
    private javax.swing.JTextField tbCelular;
    private javax.swing.JTextField tbDni;
    private javax.swing.JTextField tbNombre;
    // End of variables declaration//GEN-END:variables
}
