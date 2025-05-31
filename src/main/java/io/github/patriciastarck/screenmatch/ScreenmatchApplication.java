package io.github.patriciastarck.screenmatch;

import io.github.patriciastarck.screenmatch.service.ConsumoApi;
import io.github.patriciastarck.screenmatch.service.ConverteDados;
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
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=c15f4f6e");
//        System.out.println(json);
//        json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
        System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		Dadosserie dados = conversor.obterDados(json, Dadosserie.class);
		System.out.println(dados);
	}
}
