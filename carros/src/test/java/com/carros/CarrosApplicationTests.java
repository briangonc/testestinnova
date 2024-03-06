package com.carros;

import com.carros.domain.Carro;
import com.carros.domain.CarroService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CarrosApplicationTests {

	@Autowired
	private CarroService service;
	@Test
	public void test1() {

		Carro carro = new Carro();
		carro.setVeiculo("Ferrari Xenon");
		carro.setMarca("Ferrari");
		service.insert(carro);
	}

	@Test
	public void test2() {
	}

}
