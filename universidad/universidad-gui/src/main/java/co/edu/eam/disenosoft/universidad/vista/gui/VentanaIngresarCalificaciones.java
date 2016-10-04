/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.disenosoft.universidad.vista.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.disenosoft.universidad.vista.controlador.ControladorAdministradorEvaluacion;
import co.edu.eam.disenosoft.universidad.vista.controlador.ControladorAdministradorRegistrarCurso;
import co.edu.eam.disenosoft.universidad.vista.controlador.ControladorAdministrarDocente;
import co.edu.eam.disenosoft.universidad.vista.controlador.ControladorIngresarCalificacion;

/**
 *
 * @author dir_software
 */
public class VentanaIngresarCalificaciones extends javax.swing.JInternalFrame implements ActionListener {

	private ControladorAdministrarDocente conDocente;
	private ControladorAdministradorEvaluacion conEvaluacion;
	private ControladorAdministradorRegistrarCurso conRegistrarCurso;

	/**
	 * Creates new form VentanaIngresarCalificaciones
	 */
	private ControladorIngresarCalificacion controlador;

	public VentanaIngresarCalificaciones() {
		initComponents();
		conDocente = new ControladorAdministrarDocente();
		conEvaluacion = new ControladorAdministradorEvaluacion();
		conRegistrarCurso = new ControladorAdministradorRegistrarCurso();
		controlador = new ControladorIngresarCalificacion();
		setVisible(true);
		setMaximizable(false);
		setIconifiable(true);
		setResizable(false);
		setClosable(true);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		tfceduladocente = new javax.swing.JTextField();
		btnBuscarAsignatura1 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		tfnombredocente = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		comboCurso = new javax.swing.JComboBox();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		combocalificacion = new javax.swing.JComboBox();
		jLabel1 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tablaCalificaicon = new javax.swing.JTable();
		btnCalificar = new javax.swing.JButton();

		setTitle("Ingresar Calificaiones");
		setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check44.png"))); // NOI18N

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Docente"));

		jLabel3.setText("Cedula");

		btnBuscarAsignatura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N
		btnBuscarAsignatura1.setToolTipText("Buscar Docente");
		btnBuscarAsignatura1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBuscarAsignatura1ActionPerformed(evt);
			}
		});

		jLabel4.setText("Nombre");

		tfnombredocente.setEditable(false);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel3).addComponent(jLabel4))
						.addGap(25, 25, 25)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(tfceduladocente, javax.swing.GroupLayout.DEFAULT_SIZE, 230,
										Short.MAX_VALUE)
								.addComponent(tfnombredocente))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnBuscarAsignatura1, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
								javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout
						.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(btnBuscarAsignatura1, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(tfceduladocente, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(tfnombredocente, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4))))
						.addGap(5, 5, 5)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calificaciones"));

		comboCurso.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				comboCursoItemStateChanged(evt);
			}
		});

		jLabel5.setText("Curso");

		jLabel6.setText("Calificacion");

		combocalificacion.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				combocalificacionItemStateChanged(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(31, 31, 31)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
								.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(comboCurso, 0, 240, Short.MAX_VALUE).addComponent(combocalificacion, 0,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(74, 74, 74)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(combocalificacion,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check44.png"))); // NOI18N
		jLabel1.setText("jLabel1");

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado Estudiantes"));

		tablaCalificaicon
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Cedula", "Nombre", "Apellido", "Calificacion" }));
		jScrollPane1.setViewportView(tablaCalificaicon);

		btnCalificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pen41.png"))); // NOI18N
		btnCalificar.setToolTipText("Calificar Estudiante Seleccionado de la Tabla");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCalificar))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(btnCalificar)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void comboCursoItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_comboCursoItemStateChanged
		// if(evt.getStateChange()== v)
		Curso cursoEval = (Curso) comboCurso.getSelectedItem();
		listarCalificacion(cursoEval);
	}// GEN-LAST:event_comboCursoItemStateChanged

	private void combocalificacionItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_combocalificacionItemStateChanged
		try {
			DefaultTableModel df = (DefaultTableModel) tablaCalificaicon.getModel();
			df.setRowCount(0);

			Curso codCurso = (Curso) comboCurso.getSelectedItem();
			List<RegistroCurso> listCur = conRegistrarCurso.listaEstudiantes(codCurso.getCodigo());

			for (int i = 0; i < listCur.size(); i++) {

				df.addRow(new Object[] { listCur.get(i).getEstudiante().getCedula(),
						listCur.get(i).getEstudiante().getNombre(), listCur.get(i).getEstudiante().getApellido(),
						"NC" });
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// GEN-LAST:event_combocalificacionItemStateChanged

	private void btnBuscarAsignatura1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBuscarAsignatura1ActionPerformed
		try {
			// DefaultTableModel df = (DefaultTableModel)
			// tablaCalificaicon.getModel();
			// df.setRowCount(0);
			String ce = tfceduladocente.getText();
			if (ce.isEmpty()) {
				System.out.println("vacio");
			} else {
				Docente docente = conDocente.buscarDocente(ce);
				if (docente != null) {
					tfnombredocente.setText(docente.getNombre() + " " + docente.getApellido());
					listarCursosDocente(docente);
				} else {
					System.out.println("no se encontro");
				}
			}

		} catch (Exception d1) {
			d1.printStackTrace();
		}
	}// GEN-LAST:event_btnBuscarAsignatura1ActionPerformed

	/**
	 * listamos los cursos de un docente determinado
	 */
	public void listarCursosDocente(Docente docente) {
		comboCurso.removeAllItems();
		try {
			List<Curso> cursos = controlador.listarCursosDocente(docente);
			for (Curso curso : cursos) {
				comboCurso.addItem(curso);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void listarCalificacion(Curso cursoEval) {

		combocalificacion.removeAllItems();

		try { 
			List<Evaluacion> cursos = controlador.listarCalificaciones(cursoEval);
			for (int i = 0; i<cursos.size();i++) {
				combocalificacion.addItem(cursos.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void llenarTabla(Curso curso, Evaluacion notaEval) {

		try {
			DefaultTableModel df = (DefaultTableModel) tablaCalificaicon.getModel();
			df.setRowCount(0);

			List<RegistroCurso> listaReg = conRegistrarCurso.listaTablaEstudiantes(curso);

			if (listaReg.size() > 0) {
				for (RegistroCurso regCurso : listaReg) {
					String calificacion = "NC";
					if (!regCurso.getNotas().isEmpty()) {
						List<Nota> listaNotas = regCurso.getNotas();

						for (Nota no : listaNotas) {
							if (no.getEvaluacion().getIdEvaluacion() == notaEval.getIdEvaluacion()) {
								calificacion = String.valueOf(no.getValor());
							}
						}
					}

					df.addRow(new Object[] { regCurso.getEstudiante().getCedula(),
							regCurso.getEstudiante().getApellido(), regCurso.getEstudiante().getNombre(), calificacion

					});
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// String codigo = (String) CBCursoDatosAsignatura.getSelectedItem();

		//
		// DefaultTableModel df = (DefaultTableModel)
		// TablaEstudiante.getModel();
		// df.setRowCount(0);
		//
		// for (int i = 0; i < listaReg.size(); i++) {
		//
		// df.addRow(new Object[] {
		// listaReg.get(i).getEstudiante().getCedula(),
		// listaReg.get(i).getEstudiante().getNombre(),
		// listaReg.get(i).getEstudiante().getApellido(),
		// listaReg.get(i).getEstudiante().getFechaNacimiento()
		// });
		// }
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnBuscarAsignatura1;
	private javax.swing.JButton btnCalificar;
	private javax.swing.JComboBox comboCurso;
	private javax.swing.JComboBox combocalificacion;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tablaCalificaicon;
	private javax.swing.JTextField tfceduladocente;
	private javax.swing.JTextField tfnombredocente;
	// End of variables declaration//GEN-END:variables

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
