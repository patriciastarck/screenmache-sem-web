package io.github.patriciastarck.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();

//		List<DadosTemporada> temporadas = new ArrayList<>();
//
//
//		for (int i = 1; i <= dados.totalTemporadas(); i++) {
//			json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i +"&apikey=c15f4f6e");
//			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
//			temporadas.add(dadosTemporada);
//		}
//		temporadas.forEach(System.out::println);
	}
}
