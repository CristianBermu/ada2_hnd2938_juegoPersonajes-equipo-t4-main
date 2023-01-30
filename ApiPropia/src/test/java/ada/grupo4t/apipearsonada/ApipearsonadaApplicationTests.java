package ada.grupo4t.apipearsonada;

import ada.grupo4t.apipearsonada.model.Partida;
import ada.grupo4t.apipearsonada.service.PartidaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApipearsonadaApplicationTests {
	@Autowired
	PartidaService partidaService;

	@Test
	void test1_partida() {
		Partida partida1 =new Partida(1,"Cristian",78,1923);

		final int resultado = partida1.getId();

		assertEquals(1,resultado);
	}

	@Test
	void test2_partida() {
		Partida partida1 =new Partida(1,"Cristian",78,1923);

		final String resultado = partida1.getNombre();
		assertEquals("Cristian",resultado);
	}


	@Test
	void test3_partida() {
		Partida partida1 =new Partida(1,"Cristian",78,1923);

		final int resultado = partida1.getPuntuacion();
		assertEquals(1923,resultado);
	}


	@Test
	void test4_partida() {
		Partida partida1 =new Partida(1,"Cristian",78,1923);

		final int resultado = partida1.getTiempo();
		assertEquals(78,resultado);
	}

	@Test
	void test5_partida() {
		Partida partida1 =new Partida(1,"Cristian",78,1923);

		partida1.setId(2);

		final int resultado = partida1.getId();

		assertEquals(2,resultado);
	}

	@Test
	void test6_partida() {
		Partida partida1 =new Partida(1,"Cristian",78,1923);

		partida1.setNombre("Pepe");

		final String resultado = partida1.getNombre();

		assertEquals("Pepe",resultado);
	}

	@Test
	void test7_partida() {
		Partida partida1 =new Partida(1,"Cristian",78,1923);

		partida1.setPuntuacion(1402);

		final int resultado = partida1.getPuntuacion();

		assertEquals(1402,resultado);
	}

	@Test
	void test8_partida() {
		Partida partida1 =new Partida(1,"Cristian",78,1923);

		partida1.setTiempo(90);

		final int resultado = partida1.getTiempo();

		assertEquals(90,resultado);
	}


//-------------

	@Test
	void test1_partidaService() {
		Partida partida1 = new Partida(1,"Cristian",78,1923);

		partidaService.savePartida(partida1);


		final int resultado = partidaService.listAllPartida().size();
		assertEquals(1,resultado);

	}



}
