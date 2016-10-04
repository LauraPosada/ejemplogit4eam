/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.disenosoft.universidad.vista.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.universidad.modelo.enumeraciones.TipoAsignaturaEnum;
import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IAsignaturaDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOAsignaturaJPA;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.vista.controlador.ControladorAdministradorAsignatura;

/**
 *
 * @author dir_software
 */
public class VentanaAsignatura extends javax.swing.JInternalFrame implements ActionListener {

	private ControladorAdministradorAsignatura conAsignatura;

	/**
	 * Creates new form VentanaAsignatura
	 */
	public VentanaAsignatura() {
		conAsignatura = new ControladorAdministradorAsignatura();
		initComponents();
		setVisible(true);
		setMaximizable(false);
		setIconifiable(true);
		setResizable(false);
		setClosable(true);

		btnCrear.addActionListener(this);
		btnBuscar.addActionListener(this);
		btnEditar.addActionListener(this);
		jbtnEliminar.addActionListener(this);

		comboTipoAsignatura.addItem(TipoAsignaturaEnum.PRACTICA);
		comboTipoAsignatura.addItem(TipoAsignaturaEnum.TEORICO_PRACTICA);
		comboTipoAsignatura.addItem(TipoAsignaturaEnum.TEORICA);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		comboTipoAsignatura = new javax.swing.JComboBox();
		tfcodigo = new javax.swing.JTextField();
		tfnombre = new javax.swing.JTextField();
		tfcreditos = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		tfSemestre = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		btnCrear = new javax.swing.JButton();
		btnBuscar = new javax.swing.JButton();
		btnEditar = new javax.swing.JButton();
		jbtnEliminar = new javax.swing.JButton();

		setTitle("Administrar Asignaturas");
		setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/open161.png"))); // NOI18N

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Basicos"));

		jLabel1.setText("Codigo");

		jLabel2.setText("Nombre");

		jLabel3.setText("Creditos");

		jLabel4.setText("Tipo");

		jLabel5.setText("Semestre");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(
						jPanel1Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										jPanel1Layout.createSequentialGroup().addGap(23, 23, 23)
												.addGroup(
														jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel4).addComponent(jLabel1)
																.addComponent(jLabel2).addComponent(jLabel3)
																.addComponent(jLabel5))
												.addGap(59, 59, 59)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(tfcodigo)
														.addComponent(comboTipoAsignatura, 0, 268, Short.MAX_VALUE)
														.addComponent(tfnombre).addComponent(tfcreditos)
														.addComponent(tfSemestre))
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(17, 17, 17)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(tfcreditos, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(tfSemestre, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(comboTipoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4))
						.addContainerGap()));

		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculation1.png"))); // NOI18N
		btnCrear.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCrearActionPerformed(evt);
			}
		});

		btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N

		btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pen38.png"))); // NOI18N

		jbtnEliminar.setIcon(new javax.swing.ImageIcon(
				"D:\\WorkspaceDesarrollo\\universidad\\universidad-gui\\src\\main\\resources\\imagenes\\delete1600.png")); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(
						jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
										.addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(28, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(
						jPanel2Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 40,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap(17, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(20, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCrearActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnCrearActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnBuscar;
	private javax.swing.JButton btnCrear;
	private javax.swing.JButton btnEditar;
	private javax.swing.JComboBox comboTipoAsignatura;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JButton jbtnEliminar;
	private javax.swing.JTextField tfSemestre;
	private javax.swing.JTextField tfcodigo;
	private javax.swing.JTextField tfcreditos;
	private javax.swing.JTextField tfnombre;
	// End of variables declaration//GEN-END:variables

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getSource() == btnCrear) {
			try {

				Asignatura asi = new Asignatura();
				asi.setNombre(tfnombre.getText());
				asi.setCodigo(tfcodigo.getText());
				asi.setNumeroCreditos(Integer.parseInt(tfcreditos.getText()));
				asi.setSemestre(Integer.parseInt(tfSemestre.getText()));
				asi.setTipo((TipoAsignaturaEnum) comboTipoAsignatura.getSelectedItem());

				conAsignatura.crear(asi);
				JOptionPane.showMessageDialog(null, "Asignatura creada");
				limpiarAsignatura();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		if (arg0.getSource() == btnBuscar) {
			// Capturo las posible excepciones que puedan salir
			try {
				String cod = tfcodigo.getText();
				Asignatura cust = conAsignatura.buscar(cod);

				if (cust != null) {
					tfnombre.setText(cust.getNombre());
					tfcreditos.setText(cust.getNumeroCreditos() + "");
					tfSemestre.setText(cust.getSemestre() + "");
					comboTipoAsignatura.setSelectedItem(cust.getTipo());

				} else {
					JOptionPane.showMessageDialog(null, "La materia no se encuetra registrado");
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}
		if (arg0.getSource() == jbtnEliminar) {
			// Capturo las posible excepciones que puedan salir

			try {
				// captura la cedula del estudiante a eliminar
				String codigo = tfcodigo.getText();
				// llamo el metodo eliminar estudiante
				conAsignatura.eliminar(codigo);
				// mensaje de notificacion de estudiante eliminado
				JOptionPane.showMessageDialog(null, "Asignatura Eliminada con exito");

			} catch (Exception e) {

			}
		}

		if (arg0.getSource() == btnEditar) {
			// Capturo las posible excepciones que puedan salir
			try {
				Asignatura asi = new Asignatura();
				asi.setNombre(tfnombre.getText());
				asi.setCodigo(tfcodigo.getText());
				asi.setNumeroCreditos(Integer.parseInt(tfcreditos.getText()));
				asi.setSemestre(Integer.parseInt(tfSemestre.getText()));
				asi.setTipo((TipoAsignaturaEnum) comboTipoAsignatura.getSelectedItem());

				conAsignatura.editar(asi);
				// mensaje de notificacion de estudiante actualziado
				JOptionPane.showMessageDialog(null, "Asignatura modificada !!");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void limpiarAsignatura() {

		tfnombre.setText(null);
		tfcodigo.setText(null);
		tfSemestre.setText(null);
		tfcreditos.setText(null);
	}
}