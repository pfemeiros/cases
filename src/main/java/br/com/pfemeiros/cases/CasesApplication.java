package br.com.pfemeiros.cases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CasesApplication {

	public static void main(String[] args) {



		SpringApplication.run(CasesApplication.class, args);

		GenericsTypeParameter<String, Integer> stringGenericsTypeParameter = new GenericsTypeParameter<>();

		stringGenericsTypeParameter.sort(List.of("1", "2"));


	}

}
