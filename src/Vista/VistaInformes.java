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
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class VistaInformes extends javax.swing.JInternalFrame {
    private PersonasData personasData;
    private ArrayList<Personas> listaPersonas;
    private ArrayList<Cursos> listaCursos;
    private Conexion conexion;
    private CursosData cursosData;
    private MatriculasData matriculasData;
    private List<JButton> botonesCursos;
    private ArrayList<Matriculas> listaMatriculas;
    private PlaceHolder htbBuscarPersona;
   
    public VistaInformes() {
        initComponents();
        botonesCursos = new ArrayList<>();
        this.setLocation(9, 8);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCursos = new javax.swing.JTable();
        tbCapacidad = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tAlumnos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlBotonesCursos = new javax.swing.JPanel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tCursos);

        btnBuscar.setText("Busca");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista Cupo", jPanel1);

        jScrollPane2.setInheritsPopupMenu(true);

        tAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        tAlumnos.setDoubleBuffered(true);
        tAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tAlumnosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tAlumnos);

        pnlBotonesCursos.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane3.setViewportView(pnlBotonesCursos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar Alumnos", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tAlumnosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAlumnosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAlumnosMousePressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(tbCapacidad.getText().equals("")){JOptionPane.showMessageDialog(null, "Ingrese capacidad: ");}
        else {cargarTablaCupoMaximo(Integer.parseInt(tbCapacidad.getText()));}     
    }//GEN-LAST:event_btnBuscarActionPerformed
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
                     cargarTablaPersonas(Integer.parseInt(boton.getName()));
                }
                                                         }  
            );
            pnlBotonesCursos.add(boton);
            botonesCursos.add(boton);
            
            pnlBotonesCursos.updateUI();
           
        }
    }
    public void cargarTablaPersonas(int buscar){   
        
        listaMatriculas =(ArrayList) matriculasData.obtenerPersonasPorCurso(buscar);
        
        String[] columnName = {"Id","Nombre","DNI","Celular"};
        Object[][] rows = new Object[listaMatriculas.size()][4];
        for(int i = 0; i < listaMatriculas.size(); i++)
        {           
            rows[i][0] = listaMatriculas.get(i).getPersonas().getIdpersonas();
            rows[i][1] = listaMatriculas.get(i).getPersonas().getNombre();
            rows[i][2] = listaMatriculas.get(i).getPersonas().getDni();
            rows[i][3] = listaMatriculas.get(i).getPersonas().getCelular();
        }
        
        TheModel model = new TheModel(rows, columnName);
        tAlumnos.setModel(model);
        tAlumnos.setRowHeight(30);
        tAlumnos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tAlumnos.getColumnModel().getColumn(0).setMaxWidth(0);
        tAlumnos.getColumnModel().getColumn(0).setMinWidth(0);
        tAlumnos.getColumnModel().getColumn(0).setPreferredWidth(0);   
    }
    public void cargarTablaCupoMaximo(int buscar){   
        
        listaCursos =(ArrayList) cursosData.obtenerCursosPorCupoMaximo(buscar);
        
        String[] columnName = {"Id","Nombre","Descripcion","Costo","Cupo Maximo"};
        Object[][] rows = new Object[listaCursos.size()][5];
        for(int i = 0; i < listaCursos.size(); i++)
        {           
            rows[i][0] = listaCursos.get(i).getIdcursos();
            rows[i][1] = listaCursos.get(i).getNombre();
            rows[i][2] = listaCursos.get(i).getDescripcion();
            rows[i][3] = listaCursos.get(i).getCosto();
            rows[i][4] = listaCursos.get(i).getCupomaximo();
        }
        
        TheModel model = new TheModel(rows, columnName);
        tCursos.setModel(model);
        tCursos.setRowHeight(30);
        tCursos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tCursos.getColumnModel().getColumn(0).setMaxWidth(0);
        tCursos.getColumnModel().getColumn(0).setMinWidth(0);
        tCursos.getColumnModel().getColumn(0).setPreferredWidth(0);   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlBotonesCursos;
    private javax.swing.JTable tAlumnos;
    private javax.swing.JTable tCursos;
    private javax.swing.JTextField tbCapacidad;
    // End of variables declaration//GEN-END:variables
     
            

}

