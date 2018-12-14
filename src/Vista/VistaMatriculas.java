package Vista;

import Modelo.Conexion;
import Modelo.Cursos;
import Modelo.CursosData;
import Modelo.Matriculas;
import Modelo.MatriculasData;
import Modelo.Personas;
import Modelo.PersonasData;
import Modelo.Render;
import Modelo.TheModel;
import com.placeholder.PlaceHolder;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class VistaMatriculas extends javax.swing.JInternalFrame {

    private PersonasData personasData;
    private ArrayList<Cursos> listaCursos;
    private Conexion conexion;
    private CursosData cursosData;
    private MatriculasData matriculasData;
    private List<JButton> botonesCursos;
    private ArrayList<Matriculas> listaMatriculas;
    private PlaceHolder htbBuscarPersona;
    public VistaMatriculas() {
        initComponents();
        botonesCursos = new ArrayList<>();
        this.setLocation(9, 8);
        PlaceHolder htbBuscarPersona = new PlaceHolder(tbBuscarPersona, Color.GRAY, Color.BLACK, "Ingrese DNI de la persona", false, title, 13);
        PlaceHolder htbBuscarCosto = new PlaceHolder(tbBuscarPersona, Color.GRAY, Color.BLACK, "Ingrese DNI de la persona", false, title, 13);
        PlaceHolder htbBuscarSumaTotal = new PlaceHolder(tbBuscarPersona, Color.GRAY, Color.BLACK, "Ingrese DNI de la persona", false, title, 13);
        try {
            conexion = new Conexion("jdbc:mysql://localhost/institutoabierto", "root", "");
            personasData = new PersonasData(conexion);        
            cursosData = new CursosData (conexion);
            matriculasData = new MatriculasData(conexion);
            botonesCursos(); 
            cargarTablaMatriculas(0);
            soloNumeros(tbBuscarPersona);
            limitarCaracteres(tbBuscarPersona, 8);
            JTextFieldDateEditor editor = (JTextFieldDateEditor) dcFecha.getDateEditor();
            editor.setEditable(false);
            
            } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaMatriculas.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscarPersona = new javax.swing.JButton();
        lblNombrePersona = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        tbBuscarPersona = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlBotonesCursos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMatriculas = new javax.swing.JTable();
        btnAgregarMatricula = new javax.swing.JButton();
        tbSumaTotal = new javax.swing.JTextField();
        dcFecha = new com.toedter.calendar.JDateChooser();
        tbCostos = new javax.swing.JTextField();
        lblImagenTotal = new javax.swing.JLabel();
        lblImagenFecha = new javax.swing.JLabel();
        lblImagenPizarra = new javax.swing.JLabel();
        lblImagenFondo = new javax.swing.JLabel();
        tbIdCursos = new javax.swing.JTextField();
        tbIdPersona = new javax.swing.JTextField();

        jPanel1.setLayout(null);

        btnBuscarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVistaCursos/ImagenBuscar.png"))); // NOI18N
        btnBuscarPersona.setToolTipText("Buscar persona autorizada a crear cursos.");
        btnBuscarPersona.setMaximumSize(new java.awt.Dimension(65, 20));
        btnBuscarPersona.setMinimumSize(new java.awt.Dimension(65, 20));
        btnBuscarPersona.setPreferredSize(new java.awt.Dimension(65, 20));
        btnBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPersonaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarPersona);
        btnBuscarPersona.setBounds(450, 88, 30, 31);

        lblNombrePersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePersona.setText("Nombre");
        lblNombrePersona.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lblNombrePersona);
        lblNombrePersona.setBounds(470, 91, 373, 26);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnLimpiar.png"))); // NOI18N
        btnLimpiar.setEnabled(false);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnLimpiarA.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar);
        btnLimpiar.setBounds(589, 250, 52, 30);

        tbBuscarPersona.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbBuscarPersona.setToolTipText("DNI de la persona.");
        jPanel1.add(tbBuscarPersona);
        tbBuscarPersona.setBounds(165, 88, 290, 30);

        pnlBotonesCursos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlBotonesCursos.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane3.setViewportView(pnlBotonesCursos);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(60, 120, 785, 128);

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tMatriculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tMatriculasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tMatriculas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 282, 785, 139);

        btnAgregarMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnMatriculaGuardar.png"))); // NOI18N
        btnAgregarMatricula.setEnabled(false);
        btnAgregarMatricula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPrincipal/ImgBtnMatriculaGuardarA.png"))); // NOI18N
        btnAgregarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarMatricula);
        btnAgregarMatricula.setBounds(533, 250, 52, 30);

        tbSumaTotal.setEditable(false);
        tbSumaTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbSumaTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbSumaTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbSumaTotal.setEnabled(false);
        tbSumaTotal.setOpaque(false);
        jPanel1.add(tbSumaTotal);
        tbSumaTotal.setBounds(750, 425, 90, 30);

        dcFecha.setEnabled(false);
        jPanel1.add(dcFecha);
        dcFecha.setBounds(140, 250, 220, 30);

        tbCostos.setEditable(false);
        tbCostos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbCostos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbCostos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbCostos.setEnabled(false);
        jPanel1.add(tbCostos);
        tbCostos.setBounds(370, 250, 160, 30);

        lblImagenTotal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alonz0\\Downloads\\Nueva carpeta\\Total.png")); // NOI18N
        lblImagenTotal.setEnabled(false);
        jPanel1.add(lblImagenTotal);
        lblImagenTotal.setBounds(680, 428, 70, 24);

        lblImagenFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenFecha.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alonz0\\Downloads\\Nueva carpeta\\Fecha _.png")); // NOI18N
        lblImagenFecha.setEnabled(false);
        jPanel1.add(lblImagenFecha);
        lblImagenFecha.setBounds(60, 253, 80, 24);

        lblImagenPizarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVistaCursos/ImagenPizarron.png"))); // NOI18N
        jPanel1.add(lblImagenPizarra);
        lblImagenPizarra.setBounds(23, 0, 880, 500);

        lblImagenFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVistaCursos/ImagenFondo.jpg"))); // NOI18N
        lblImagenFondo.setFocusable(false);
        jPanel1.add(lblImagenFondo);
        lblImagenFondo.setBounds(0, 0, 900, 500);

        tbIdCursos.setEnabled(false);
        tbIdCursos.setOpaque(false);
        jPanel1.add(tbIdCursos);
        tbIdCursos.setBounds(640, 20, 20, 20);

        tbIdPersona.setEnabled(false);
        tbIdPersona.setOpaque(false);
        jPanel1.add(tbIdPersona);
        tbIdPersona.setBounds(620, 20, 20, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPersonaActionPerformed
        if(tbBuscarPersona.getText().equals("Ingrese DNI de la persona")){
            JOptionPane.showMessageDialog(null, "Ingrese DNI");        
        }                   
        else{            
            Personas personas = personasData.buscarPersonasPorDni(Integer.parseInt(tbBuscarPersona.getText()));
            if(personas!=null)
            {
               lblNombrePersona.setText(personas.getNombre());
               tbIdPersona.setText(personas.getIdpersonas()+"");
               cargarTablaMatriculas(Integer.parseInt(tbIdPersona.getText()));
               activa_boton(true,true,true,true,true,true,true);
            }
            else{
            
            JOptionPane.showMessageDialog(null, "DNI NO ENCONTRADO");
            activa_boton(false,false,false,false,false,false,false);
            
            cargarTablaMatriculas(0);          
        }      
        }        
    }//GEN-LAST:event_btnBuscarPersonaActionPerformed
    public void activa_boton(boolean a1, boolean a2, boolean a3, boolean a4, boolean a5, boolean a6, boolean a7){
        btnAgregarMatricula.setEnabled(a1);
        dcFecha.setEnabled(a2);
        lblImagenFecha.setEnabled(a3);
        lblImagenTotal.setEnabled(a4);
        btnLimpiar.setEnabled(a5);
        tbSumaTotal.setEnabled(a6);
        tbCostos.setEnabled(a7);
    } 
  
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMatriculaActionPerformed
        if(tbIdCursos.getText().equals("")){JOptionPane.showMessageDialog(null, "Seleccione curso");}
        else{
        Personas personas = personasData.buscarPersonasPorId(Integer.parseInt(tbIdPersona.getText()));      
        Cursos cursos = cursosData.buscarCursosPorID(Integer.parseInt(tbIdCursos.getText()));
        try {
            if(personas == null)
            {             
                JOptionPane.showMessageDialog(null, "Ingrese alumno");
            }
            else if(cursos == null)
            {
                JOptionPane.showMessageDialog(null, "Seleccione curso");
            }            
            else if(dcFecha.getDate() == null)
            {
                JOptionPane.showMessageDialog(null, "Seleccione una Fecha", "Error", JOptionPane.WARNING_MESSAGE);
            }         
            else
            {                
                 java.util.Date date = dcFecha.getDate();
                 long d = date.getTime();
                 java.sql.Date fecha =new java.sql.Date(d); 
        
                 double costo = cursos.getCosto();                    
                 Matriculas matricula = new Matriculas(personas,cursos,fecha,costo);   
                 matriculasData.guardarMatricula(matricula);
                 cargarTablaMatriculas(Integer.parseInt(tbIdPersona.getText()));                
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer datos de la tabla: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnAgregarMatriculaActionPerformed

    private void tMatriculasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMatriculasMousePressed
            try {
            int column = tMatriculas.getColumnModel().getColumnIndexAtX(evt.getX());
            int row = evt.getY()/tMatriculas.getRowHeight();
            if(row < tMatriculas.getRowCount() && row >= 0 && column < tMatriculas.getColumnCount() && column >= 0){
            Object value = tMatriculas.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;

                if(boton.getToolTipText().equals("Eliminar")){
                    int resp=JOptionPane.showConfirmDialog(null, "Desea eliminar este registro?", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                    if (JOptionPane.OK_OPTION == resp)
                    {
                        int id = Integer.parseInt(boton.getName());
                        Matriculas matriculas = matriculasData.buscarMatriculaPorID(id);
            
                        matriculas.setActivo(false);
                        matriculasData.actualizarMatricula(matriculas);
                        cargarTablaMatriculas(Integer.parseInt(tbIdPersona.getText()));

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
    }//GEN-LAST:event_tMatriculasMousePressed
    
    private void botonesCursos(){
        pnlBotonesCursos.removeAll();
        listaCursos =(ArrayList)cursosData.obtenerCursos("","");
        
        for(Cursos item:listaCursos)
        {
            JButton boton = new JButton();
            boton.setText(item.getNombre());
            boton.setName(item.getIdcursos()+"");
            boton.setBorder(BorderFactory.createEmptyBorder());
            boton.setFont(new Font("", Font.BOLD, 12));
            boton.setPreferredSize(new Dimension(100, 100));
           
            boton.setHorizontalTextPosition(SwingConstants.CENTER);
            boton.setVerticalTextPosition(SwingConstants.CENTER);
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tbIdCursos.setText(boton.getName());
                    tbCostos.setText(item.getCosto()+"");
                }
                                                         }  
            );
            pnlBotonesCursos.add(boton);
            botonesCursos.add(boton);
            
            pnlBotonesCursos.updateUI();
           
        }
    }
   
    public void cargarTablaMatriculas(int id){
        
        double total = 0;
        tMatriculas.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel defaulttable = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column){
                System.out.println();
                return false;
            }           
        }; 
        listaMatriculas =(ArrayList) matriculasData.obtenerMatriculas(id);
        
        String[] columnName = {"Id","Nombre","Fecha","Costo",""};
        Object[][] rows = new Object[listaMatriculas.size()][5];
        for(int i = 0; i < listaMatriculas.size(); i++)
        {            
            JButton boton2 = new JButton("");
            boton2.setToolTipText("Eliminar");
            boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesModificarCursos/ImagenBorrar.png")));
            boton2.setName(listaMatriculas.get(i).getIdmatriculas()+"");
            rows[i][0] = listaMatriculas.get(i).getIdmatriculas();
            rows[i][1] = listaMatriculas.get(i).getCursos().getNombre();
            rows[i][2] = listaMatriculas.get(i).getFechaalta();
            rows[i][3] = listaMatriculas.get(i).getCosto();
            rows[i][4] = boton2;
            total = total + listaMatriculas.get(i).getCosto();
        }
        tbSumaTotal.setText(total+"");
        TheModel model = new TheModel(rows, columnName);
        tMatriculas.setModel(model);
        tMatriculas.setRowHeight(30);
        tMatriculas.getColumnModel().getColumn(0).setMaxWidth(0);
        tMatriculas.getColumnModel().getColumn(0).setMinWidth(0);
        tMatriculas.getColumnModel().getColumn(0).setPreferredWidth(0);
        tMatriculas.getColumnModel().getColumn(4).setMaxWidth(30);  
       
    }
    public void Limpiar(){
        
        tbBuscarPersona.setText("");
        htbBuscarPersona = new PlaceHolder(tbBuscarPersona, Color.GRAY, Color.BLACK, "Ingrese DNI de la persona", false, title, 13);
        tbCostos.setText("");
        tbSumaTotal.setText("");
        lblNombrePersona.setText("");
        cargarTablaMatriculas(0);
        activa_boton(false,false,false,false,false,false,false);
        dcFecha.setDateFormatString("");    
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
    public void soloFecha(JDateChooser a){
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMatricula;
    private javax.swing.JButton btnBuscarPersona;
    private javax.swing.JButton btnLimpiar;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblImagenFecha;
    private javax.swing.JLabel lblImagenFondo;
    private javax.swing.JLabel lblImagenPizarra;
    private javax.swing.JLabel lblImagenTotal;
    private javax.swing.JLabel lblNombrePersona;
    private javax.swing.JPanel pnlBotonesCursos;
    private javax.swing.JTable tMatriculas;
    private javax.swing.JTextField tbBuscarPersona;
    private javax.swing.JTextField tbCostos;
    private javax.swing.JTextField tbIdCursos;
    private javax.swing.JTextField tbIdPersona;
    private javax.swing.JTextField tbSumaTotal;
    // End of variables declaration//GEN-END:variables
}
