package co.edu.ema.disenosoft.universidad.RegistroCurso;


import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.disenosoft.universidad.logica.bos.BOCrearCurso;
import co.edu.eam.disenosoft.universidad.logica.bos.BODocente;
import co.edu.eam.disenosoft.universidad.logica.bos.BOSesionCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import junit.framework.Assert;

public class BOregistroSesion {

	private BODocente boDocente;
	private BOAsignatura boAsignatura;
	private BOCrearCurso boCurso;

	@BeforeClass
	public static void beforeClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-add.sql");
	}

	@Before
	public void setUp() {
		boDocente = new BODocente();
		boAsignatura = new BOAsignatura();
		boCurso = new BOCrearCurso();
	}

	@Test
	public void testCrearCurso() throws Exception {

		Curso curso = new Curso();

		Asignatura asi = boAsignatura.buscar("12");
		Docente docente = boDocente.buscarDocente("100");

		curso.setCodigo("12345");
		curso.setAsignatura(asi);
		curso.setDocente(docente);

		try {
			// boCurso.crear(curso);

			Curso accCurso = boCurso.buscar("12345");

			Assert.assertNotNull(accCurso);
			Assert.assertEquals("100", accCurso.getDocente().getCedula());

		} catch (Exception e) {
			Assert.fail();
		}
	}

	// @Test
	// public void CrearSesion(){
	//
	// }

	@AfterClass
	public static void afterClass() {
		TestDataUtil.ejecutarSQL("sqltest/Prueba-del.sql");
	}
}
