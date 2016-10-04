/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.disenosoft.universidad.vista.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IEstudianteDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOEstudianteJPA;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.vista.controlador.ControladorAdministradorEstudiante;
import co.edu.eam.ingesoft.desarrollo.logica.excepciones.ExcepcionNegocio;

/**
 * 
 * @author dir_software
 */
public class VentanaAdminEstudiante extends javax.swing.JInternalFrame implements ActionListener {

	
		private ControladorAdministradorEstudiante conEstudiante;
		
		/**
	 * Creates new form VentanaAdminEstudiante
	 */
	public VentanaAdminEstudiante() {
		
		conEstudiante = new ControladorAdministradorEstudiante();
		initComponents();
		setVisible(true);
		setMaximizable(false);
		setIconifiable(true);
		setClosable(true);
		setResizable(false);
		btnCrear.addActionListener(this);
		btnBuscar.addActionListener(this);
		brtnEditar.addActionListener(this);
		brtnEliminar.addActionListener(this);
	
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfCEdula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        brtnEditar = new javax.swing.JButton();
        brtnEliminar = new javax.swing.JButton();

        setMaximizable(true);
        setResizable(true);
        setTitle("Administrar Estudiantes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/student6.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));

        jLabel6.setText("Telefono");

        jLabel2.setText("Nombre");

        jLabel1.setText("Cedula");

        jLabel5.setText("Direccion");

        jLabel4.setText("Correo Electronico");

        jLabel3.setText("Apellido");

        jLabel7.setText("Fecha de nacimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCEdula)
                            .addComponent(tfNombre)
                            .addComponent(tfApellido)
                            .addComponent(tfCorreo)
                            .addComponent(tfDireccion)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCEdula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculation1.png"))); // NOI18N

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N

        brtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pen38.png"))); // NOI18N

        brtnEliminar.setIcon(new javax.swing.ImageIcon("D:\\WorkspaceDesarrollo\\universidad\\universidad-gui\\src\\main\\resources\\imagenes\\delete1600.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(brtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(brtnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brtnEditar;
    private javax.swing.JButton brtnEliminar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private com.toedter.calendar.JDateChooser jCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCEdula;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables

	public void actionPerformed(ActionEvent arg0) {
		//Captura el evento al precionar el boton crear Estudiante
		if (arg0.getSource() == btnCrear) {
			//Declacion de variables 
			try {
				
				Estudiante est = new Estudiante();
				est.setNombre(tfNombre.getText());
				est.setApellido(tfApellido.getText());
				est.setCedula(tfCEdula.getText());
				est.setCorreo(tfCorreo.getText());
				est.setDireccion(tfDireccion.getText());
				est.setTelefono(tfTelefono.getText());
				est.setFechaNacimiento(jCalendar.getDate());
				
				conEstudiante.crearEstudiante(est);
				
				JOptionPane.showMessageDialog(null, "ESTUDIANTE CREADO");

				 limpiarCamposEs();
//
			}catch(ExcepcionNegocio exN){
				JOptionPane.showMessageDialog(null, exN.getMessage());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

		//Captura el evento al precionar el boton buscar Estudiante
		if (arg0.getSource() == btnBuscar) {
			//Capturo las posible excepciones que puedan salir
			try {
				String ce = tfCEdula.getText();
				Estudiante cust = conEstudiante.buscarEstudiante(ce);
				//Valida si la consulta esta nula o llena para poder llenar los campos correspondientes
				if( cust != null){
					//Llamo los campos en los que se va amostrar el resultado de la busqueda
					tfDireccion.setText(cust.getDireccion());
					tfApellido.setText(cust.getApellido());
					tfCorreo.setText(cust.getCorreo());
					tfNombre.setText(cust.getNombre());
					tfTelefono.setText(cust.getTelefono());
					jCalendar.setDate(cust.getFechaNacimiento());
				}else{
					JOptionPane.showMessageDialog(null, "El usuario no se encuetra registrado");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Captura el evento al precionar el boton editar Estudiante
		if (arg0.getSource() == brtnEditar) {
			//Capturo las posible excepciones que puedan salir
			try{
				
				Estudiante est = new Estudiante();
				est.setNombre(tfNombre.getText());
				est.setApellido(tfApellido.getText());
				est.setCedula(tfCEdula.getText());
				est.setCorreo(tfCorreo.getText());
				est.setDireccion(tfDireccion.getText());
				est.setTelefono(tfTelefono.getText());
				est.setFechaNacimiento(jCalendar.getDate());
				
				conEstudiante.editarEstudiante(est);
				
					 JOptionPane.showMessageDialog(null, "Estudiante modificado !!");
					

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		//Captura el evento al precionar el boton eliminar Estudiante
		if(arg0.getSource() == brtnEliminar){
			//Capturo las posible excepciones que puedan salir
			try{
				
				//captura la cedula del estudiante a eliminar
				String ced = tfCEdula.getText();
				//llamo el metodo eliminar estudiante
				conEstudiante.eliminar(ced);
				//mensaje de notificacion de estudiante eliminado
				JOptionPane.showMessageDialog(null, "Estudiante Eliminado con exito");
				
				
			}catch(Exception e){
				
			}
		}
	}
	
	public void limpiarCamposEs(){
		tfCEdula.setText(null);
		tfApellido.setText(null);
		tfCorreo.setText(null);
		tfDireccion.setText(null);
		tfNombre.setText(null);
		tfTelefono.setText(null);
		jCalendar.setToolTipText(null);
	}
	
}
