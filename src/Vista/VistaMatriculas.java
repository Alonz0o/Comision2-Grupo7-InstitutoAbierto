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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
        PlaceHolder htbBuscarPersona = new PlaceHolder(tbBuscarPersona, Color.GRAY, Color.BLACK, "Ingrese Dni", false, title, 13);
        try {
            conexion = new Conexion("jdbc:mysql://localhost/institutoabierto", "root", "");
            personasData = new PersonasData(conexion);        
            cursosData = new CursosData (conexion);
            matriculasData = new MatriculasData(conexion);
            botonesCursos();           
            } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaMatriculas.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombrePersona = new javax.swing.JLabel();
        btnBuscarPersona = new javax.swing.JButton();
        tbBuscarPersona = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlBotonesCursos = new javax.swing.JPanel();
        btnAgregarMatricula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMatriculas = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        tbSumaTotal = new javax.swing.JTextField();
        dcFecha = new com.toedter.calendar.JDateChooser();
        tbCostos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblImagenFondo = new javax.swing.JLabel();
        tbIdCursos = new javax.swing.JTextField();
        tbIdPersona = new javax.swing.JTextField();

        jPanel1.setLayout(null);

        lblNombrePersona.setBackground(new java.awt.Color(255, 0, 0));
        lblNombrePersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePersona.setText("Nombre");
        lblNombrePersona.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lblNombrePersona);
        lblNombrePersona.setBounds(270, 55, 330, 30);

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
        btnBuscarPersona.setBounds(230, 55, 30, 30);

        tbBuscarPersona.setBackground(new java.awt.Color(204, 204, 255));
        tbBuscarPersona.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbBuscarPersona.setToolTipText("DNI de la persona.");
        jPanel1.add(tbBuscarPersona);
        tbBuscarPersona.setBounds(70, 55, 150, 30);

        pnlBotonesCursos.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane3.setViewportView(pnlBotonesCursos);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(70, 90, 530, 110);

        btnAgregarMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVistaCursos/ImagenAgregar.png"))); // NOI18N
        btnAgregarMatricula.setPreferredSize(new java.awt.Dimension(101, 20));
        btnAgregarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarMatricula);
        btnAgregarMatricula.setBounds(210, 400, 30, 30);

        tMatriculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tMatriculasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tMatriculas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 250, 530, 140);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(410, 210, 71, 23);
        jPanel1.add(tbSumaTotal);
        tbSumaTotal.setBounds(70, 400, 130, 30);

        dcFecha.setToolTipText("Dia/Mes/Año");
        jPanel1.add(dcFecha);
        dcFecha.setBounds(70, 210, 190, 30);
        jPanel1.add(tbCostos);
        tbCostos.setBounds(270, 210, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alonz0\\Downloads\\Nueva carpeta\\ImagenPizarron.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 880, 470);

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
        Personas personas = personasData.buscarPersonasPorDni(Integer.parseInt(tbBuscarPersona.getText()));

        if(personas!=null){
            lblNombrePersona.setText(personas.getNombre());
            tbIdPersona.setText(personas.getIdpersonas()+"");
            cargarTablaMatriculas(Integer.parseInt(tbIdPersona.getText()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Error profesor no encontrado: ");
        }    
    }//GEN-LAST:event_btnBuscarPersonaActionPerformed

    private void btnAgregarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMatriculaActionPerformed
 
    }//GEN-LAST:event_btnAgregarMatriculaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
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
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tMatriculasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMatriculasMousePressed
        int filaSeleccionada = this.tMatriculas.getSelectedRow();                         
        try {
            int column = tMatriculas.getColumnModel().getColumnIndexAtX(evt.getX());
            int row = evt.getY()/tMatriculas.getRowHeight();
            if(row < tMatriculas.getRowCount() && row >= 0 && column < tMatriculas.getColumnCount() && column >= 0){
            Object value = tMatriculas.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;

                if(boton.getText().equals("Eliminar")){
                    int resp=JOptionPane.showConfirmDialog(null, "Desea eliminar este registro?", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                    if (JOptionPane.OK_OPTION == resp)
                    {
                        int id = Integer.parseInt(boton.getName());
                        System.out.println(id);
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
private void botonesCursos()
    {
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
        LimpiarTabla();
        double total = 0;
        tMatriculas.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel defaulttable = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column){
                System.out.println();
                return false;
            }           
        }; 
        listaMatriculas =(ArrayList) matriculasData.obtenerMatriculas(id);
        
        String[] columnName = {"Id","Nombre","Fecha","Costo","Eliminar"};
        Object[][] rows = new Object[listaMatriculas.size()][5];
        for(int i = 0; i < listaMatriculas.size(); i++)
        {            
            JButton boton2 = new JButton("Eliminar");           
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
       
    }
        DefaultTableModel temp;
        void LimpiarTabla(){
        try{
            temp = (DefaultTableModel) tMatriculas.getModel();
            int a =temp.getRowCount()-1;
            for(int i=0; i<a; i++)
                temp.removeRow(0); 
        }catch(Exception e){
            System.out.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarMatricula;
    private javax.swing.JButton btnBuscarPersona;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblImagenFondo;
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
