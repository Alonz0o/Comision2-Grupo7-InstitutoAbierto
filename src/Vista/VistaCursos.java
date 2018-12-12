package Vista;

import Modelo.Conexion;
import Modelo.Cursos;
import Modelo.CursosData;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VistaCursos extends javax.swing.JInternalFrame {
    private PersonasData personasData;
    private ArrayList<Cursos> listaCursos;
    private Conexion conexion;
    private CursosData cursosData;
    private PlaceHolder htbNombre;   
    private PlaceHolder htbCosto;
    private PlaceHolder htbCupo;
    private PlaceHolder htbBuscarPersona;
    private PlaceHolder htbBuscar;

    public VistaCursos() {
        initComponents();
        this.setLocation(9, 8);
        try {
            conexion = new Conexion("jdbc:mysql://localhost/institutoabierto", "root", "");
            personasData = new PersonasData(conexion);        
            cursosData = new CursosData (conexion);
            
            htbNombre = new PlaceHolder(tbNombreCursos, Color.GRAY, Color.BLACK, "Ingrese nombre del curso", false, title, 13);
            htbBuscarPersona = new PlaceHolder(tbBuscarPersona, Color.GRAY, Color.BLACK, "Ingrese DNI de la persona", false, title, 13); 
            htbCosto = new PlaceHolder(tbCosto, Color.GRAY, Color.BLACK, "Ingrese costo del curso", false, title, 13); 
            htbCupo = new PlaceHolder(tbCupoMaximo, Color.GRAY, Color.BLACK, "Ingrese cupo maximo", false, title, 13); 
            htbBuscar = new PlaceHolder(tbBuscar, Color.GRAY, Color.BLACK, "Buscar curso", false, title, 13); 
            cargarTablaCursos("","");
            soloNumeros(tbBuscarPersona);
            soloNumeros(tbCosto);
            soloNumeros(tbCupoMaximo);
            limitarCaracteres(tbBuscarPersona,9);
            limitarCaracteres(tbNombreCursos,30);
            limitarCaracteresTA(taDescripcion,200);
            limitarCaracteres(tbCosto,10);      
            limitarCaracteres(tbCupoMaximo,11);
            } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaCursos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCursos = new javax.swing.JTable();
        lblImagenDescripcion = new javax.swing.JLabel();
        btnCargarCurso = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        btnBuscarPersona = new javax.swing.JButton();
        tbBuscarPersona = new javax.swing.JTextField();
        lblNombrePersona = new javax.swing.JLabel();
        tbNombreCursos = new javax.swing.JTextField();
        tbCosto = new javax.swing.JTextField();
        tbCupoMaximo = new javax.swing.JTextField();
        cbBuscar = new javax.swing.JComboBox<>();
        tbBuscar = new javax.swing.JTextField();
        lblImagenCuaderno = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        btnGitHub = new javax.swing.JButton();
        lblFondoImagen = new javax.swing.JLabel();

        setVisible(true);

        jpFondo.setEnabled(false);
        jpFondo.setMaximumSize(new java.awt.Dimension(900, 500));
        jpFondo.setMinimumSize(new java.awt.Dimension(900, 500));
        jpFondo.setVerifyInputWhenFocusTarget(false);
        jpFondo.setLayout(null);

        jScrollPane1.setInheritsPopupMenu(true);

        tCursos.setModel(new javax.swing.table.DefaultTableModel(
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
        tCursos.setDoubleBuffered(true);
        tCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tCursosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tCursos);

        jpFondo.add(jScrollPane1);
        jScrollPane1.setBounds(189, 340, 567, 110);

        lblImagenDescripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/Descripcion .png"))); // NOI18N
        jpFondo.add(lblImagenDescripcion);
        lblImagenDescripcion.setBounds(420, 192, 120, 30);

        btnCargarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnCursoAgregar1.png"))); // NOI18N
        btnCargarCurso.setPreferredSize(new java.awt.Dimension(101, 20));
        btnCargarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCursoActionPerformed(evt);
            }
        });
        jpFondo.add(btnCargarCurso);
        btnCargarCurso.setBounds(450, 286, 50, 30);

        taDescripcion.setColumns(20);
        taDescripcion.setRows(5);
        jScrollPane2.setViewportView(taDescripcion);

        jpFondo.add(jScrollPane2);
        jScrollPane2.setBounds(189, 210, 567, 90);

        btnBuscarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImagenBotonPersonasBuscar.png"))); // NOI18N
        btnBuscarPersona.setToolTipText("Buscar persona autorizada a crear cursos.");
        btnBuscarPersona.setMaximumSize(new java.awt.Dimension(65, 20));
        btnBuscarPersona.setMinimumSize(new java.awt.Dimension(65, 20));
        btnBuscarPersona.setPreferredSize(new java.awt.Dimension(65, 20));
        btnBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPersonaActionPerformed(evt);
            }
        });
        jpFondo.add(btnBuscarPersona);
        btnBuscarPersona.setBounds(465, 63, 70, 49);

        tbBuscarPersona.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbBuscarPersona.setOpaque(false);
        jpFondo.add(tbBuscarPersona);
        tbBuscarPersona.setBounds(289, 70, 180, 31);

        lblNombrePersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombrePersona.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePersona.setText("Nombre");
        lblNombrePersona.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpFondo.add(lblNombrePersona);
        lblNombrePersona.setBounds(531, 72, 223, 28);

        tbNombreCursos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbNombreCursos.setOpaque(false);
        jpFondo.add(tbNombreCursos);
        tbNombreCursos.setBounds(289, 111, 467, 30);

        tbCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbCosto.setOpaque(false);
        jpFondo.add(tbCosto);
        tbCosto.setBounds(262, 150, 210, 30);

        tbCupoMaximo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbCupoMaximo.setOpaque(false);
        jpFondo.add(tbCupoMaximo);
        tbCupoMaximo.setBounds(546, 150, 210, 30);

        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Descripcion", "Costo", "Cupo", "Activos", "Desactivado" }));
        cbBuscar.setOpaque(false);
        cbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarActionPerformed(evt);
            }
        });
        jpFondo.add(cbBuscar);
        cbBuscar.setBounds(482, 314, 274, 30);

        tbBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbBuscar.setOpaque(false);
        tbBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbBuscarKeyReleased(evt);
            }
        });
        jpFondo.add(tbBuscar);
        tbBuscar.setBounds(189, 314, 300, 30);

        lblImagenCuaderno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVistaCursos/ImagenCuadernoC.png"))); // NOI18N
        jpFondo.add(lblImagenCuaderno);
        lblImagenCuaderno.setBounds(160, 0, 610, 500);

        lblGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/Comisión 2  Grupo 7  Instituto Abierto.png"))); // NOI18N
        jpFondo.add(lblGrupo);
        lblGrupo.setBounds(10, 20, 149, 58);

        btnGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/GitHub-Logo.png"))); // NOI18N
        btnGitHub.setToolTipText("Ir a GitHub");
        btnGitHub.setOpaque(false);
        btnGitHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitHubActionPerformed(evt);
            }
        });
        jpFondo.add(btnGitHub);
        btnGitHub.setBounds(30, 80, 100, 35);

        lblFondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVistaCursos/ImagenFondo.jpg"))); // NOI18N
        lblFondoImagen.setOpaque(true);
        jpFondo.add(lblFondoImagen);
        lblFondoImagen.setBounds(0, 0, 900, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCursoActionPerformed
         
        if ("".equals(tbBuscarPersona.getText())|| "Ingrese DNI de la persona".equals(tbBuscarPersona.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese DNI");
        }
         else if ("".equals(tbNombreCursos.getText())|| "Ingrese nombre del curso".equals(tbNombreCursos.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese nombre");
        }
         else if ("".equals(taDescripcion.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese descripcion");    
        }
        else if ("".equals(tbCosto.getText())|| "Ingrese costo del curso".equals(tbCosto.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese costo");
        }
        else if ("".equals(tbCupoMaximo.getText())|| "Ingrese cupo maximo".equals(tbCupoMaximo.getText())){
            
            JOptionPane.showMessageDialog(null, "Ingrese cupo");    
        }
        else{
            Personas personas = personasData.buscarPersonasPorDni(Integer.parseInt(tbBuscarPersona.getText()));
            String nombreCurso = tbNombreCursos.getText();
            String descripcionCurso = taDescripcion.getText();
            double costo = Double.parseDouble(tbCosto.getText());
            int cupomaximo = Integer.parseInt(tbCupoMaximo.getText());
            boolean habilitado= true;
            boolean activo= true;
            Cursos  cursos = new Cursos(personas, nombreCurso, descripcionCurso, costo, cupomaximo, habilitado, activo);

            cursosData.guardarCurso(cursos);
            cargarTablaCursos("","");
            Limpiar();
            htbNombre = new PlaceHolder(tbNombreCursos, Color.GRAY, Color.BLACK, "Ingrese nombre del curso", false, title, 13);
            htbBuscarPersona = new PlaceHolder(tbBuscarPersona, Color.GRAY, Color.BLACK, "Ingrese DNI de la persona", false, title, 13); 
            htbCosto = new PlaceHolder(tbCosto, Color.GRAY, Color.BLACK, "Ingrese costo del curso", false, title, 13); 
            htbCupo = new PlaceHolder(tbCupoMaximo, Color.GRAY, Color.BLACK, "Ingrese cupo maximo", false, title, 13);
        }
    }//GEN-LAST:event_btnCargarCursoActionPerformed

    private void tCursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCursosMousePressed
            try {
            int column = tCursos.getColumnModel().getColumnIndexAtX(evt.getX());
            int row = evt.getY()/tCursos.getRowHeight();
            if(row < tCursos.getRowCount() && row >= 0 && column < tCursos.getColumnCount() && column >= 0){
            Object value = tCursos.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                
                if(boton.getToolTipText().equals("Modificar"))
                {     
                    System.out.println(boton.getToolTipText());
                    ModificarCursos modificarCurso = new ModificarCursos(boton.getName());    
                    Principal.Escritorio.add(modificarCurso);
                    modificarCurso.toFront();
                    modificarCurso.setVisible(true);
                    
                }
                if(boton.getToolTipText().equals("Eliminar")){
                    System.out.println(boton.getToolTipText());
                    Limpiar();
                    int resp=JOptionPane.showConfirmDialog(null, "Desea eliminar este registro?", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                    if (JOptionPane.OK_OPTION == resp)
                    {
                        int id = Integer.parseInt(boton.getName());
                        Cursos cursos = cursosData.buscarCursosPorID(id);
            
                        cursos.setActivo(false);
                        cursosData.modificarCurso(cursos);
                        Limpiar();                       
                        cargarTablaCursos("","");                       
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

    }//GEN-LAST:event_tCursosMousePressed

    private void btnBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPersonaActionPerformed
        
        if(tbBuscarPersona.getText().equals("Ingrese DNI de la persona")){
            JOptionPane.showMessageDialog(null, "Ingrese DNI: ");        
        }                   
        else{            
            Personas personas = personasData.buscarPersonasPorDni(Integer.parseInt(tbBuscarPersona.getText()));
            if(personas!=null)
            {
               lblNombrePersona.setText(personas.getNombre());  
            }
            else{JOptionPane.showMessageDialog(null, "DNI NO ENCONTRADO");}
        }
    }//GEN-LAST:event_btnBuscarPersonaActionPerformed

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

    private void cbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarActionPerformed

        if(cbBuscar.getSelectedItem()=="Activos")
        {
            tbBuscar.setEnabled(false);
            LimpiarTabla();
            cargarTablaCursos("Activos","");
        }
        else if(cbBuscar.getSelectedItem()=="Desactivado")
        {
            tbBuscar.setEnabled(false);
            LimpiarTabla();
            cargarTablaCursos("Desactivado","");
        }
        else
        {
            tbBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_cbBuscarActionPerformed

    private void tbBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbBuscarKeyReleased
        String seleccionado = (String)cbBuscar.getSelectedItem();
        LimpiarTabla();
        cargarTablaCursos(seleccionado,tbBuscar.getText());
    }//GEN-LAST:event_tbBuscarKeyReleased
    
    public void cargarTablaCursos(String seleccionado,String buscar){
        tCursos.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel defaulttable = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column){
                System.out.println();
                return false;
            }
        }; 
        listaCursos =(ArrayList) cursosData.obtenerCursos(seleccionado,buscar);
        
        String[] columnName = {"Id","Nombre","Descripción","Costo","Cupo Máximo","",""};
        Object[][] rows = new Object[listaCursos.size()][7];
        for(int i = 0; i < listaCursos.size(); i++)
        {
            JButton boton1 = new JButton("");
            JButton boton2 = new JButton("");
            boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/ImagenModificar.png")));    
            boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/ImagenBorrar.png")));
            boton1.setToolTipText("Modificar");
            boton2.setToolTipText("Eliminar");
            boton1.setName(listaCursos.get(i).getIdcursos()+"");
            boton2.setName(listaCursos.get(i).getIdcursos()+"");
            rows[i][0] = listaCursos.get(i).getIdcursos();
            rows[i][1] = listaCursos.get(i).getNombre();
            rows[i][2] = listaCursos.get(i).getDescripcion();
            rows[i][3] = listaCursos.get(i).getCosto();
            rows[i][4] = listaCursos.get(i).getCupomaximo();
            rows[i][5] = boton1;
            rows[i][6] = boton2;
        }
        
        TheModel model = new TheModel(rows, columnName);
        tCursos.setModel(model);
        tCursos.setRowHeight(30);
        tCursos.getColumnModel().getColumn(0).setMaxWidth(0);
        tCursos.getColumnModel().getColumn(0).setMinWidth(0);
        tCursos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tCursos.getColumnModel().getColumn(5).setMaxWidth(30);
        tCursos.getColumnModel().getColumn(6).setMaxWidth(30);  
       
    }
    
    public void Limpiar(){
        
        tbNombreCursos.setText("");
        tbCosto.setText("");
        tbCupoMaximo.setText("");
        taDescripcion.setText("");

    }
    public void soloLetras(JTextField a){
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
    public void soloNumeros(JTextField a){
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(!Character.isDigit(c))
                {
                    e.consume();
                }
            }
        });
        
    }
    public void limitarCaracteres(JTextField campo,int cantidad){
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
    public void limitarCaracteresTA(JTextArea campo,int cantidad){
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
    DefaultTableModel temp;
        void LimpiarTabla(){
        try{
            temp = (DefaultTableModel) tCursos.getModel();
            int a =temp.getRowCount()-1;
            for(int i=0; i<a; i++)
                temp.removeRow(0); 
        }catch(Exception e){
            System.out.println(e);
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPersona;
    private javax.swing.JButton btnCargarCurso;
    private javax.swing.JButton btnGitHub;
    private javax.swing.JComboBox<String> cbBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JLabel lblFondoImagen;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblImagenCuaderno;
    private javax.swing.JLabel lblImagenDescripcion;
    private javax.swing.JLabel lblNombrePersona;
    private javax.swing.JTable tCursos;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextField tbBuscar;
    private javax.swing.JTextField tbBuscarPersona;
    private javax.swing.JTextField tbCosto;
    private javax.swing.JTextField tbCupoMaximo;
    private javax.swing.JTextField tbNombreCursos;
    // End of variables declaration//GEN-END:variables
}
