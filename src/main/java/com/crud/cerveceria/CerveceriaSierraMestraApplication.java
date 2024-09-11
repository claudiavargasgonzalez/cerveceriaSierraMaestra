package com.crud.cerveceria;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CerveceriaSierraMestraApplication /*implements CommandLineRunner*/ {

	public static void main(String[] args) {
		SpringApplication.run(CerveceriaSierraMestraApplication.class, args);
	}
	
	/*@Autowired
	private CervezaRepository repository;
	

	@Override
	public void run(String... args) throws Exception {
		/*
		Cerveza cerveza1 = new Cerveza("Sierra Maestra Ipa", "Ipa", 7.0, 1500.0);
		repository.save(cerveza1);
		
		Cerveza cerveza2 = new Cerveza("ElChe Lag", "Lager", 5.0, 1360.0);
		repository.save(cerveza2);
		

	}*/

}
