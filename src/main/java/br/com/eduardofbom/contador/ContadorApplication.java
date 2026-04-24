package br.com.eduardofbom.contador;

import br.com.eduardofbom.contador.infrastructure.model.ConvertData;
import br.com.eduardofbom.contador.infrastructure.model.Task;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ConvertData converter = new ConvertData();

		File file = new File("task.json");

		Task task = new Task(
				"Curating axis IV - Verification & Validation",
				true,
				"Eduardo F.");

		converter.writeData(file, task);

		Task taskRead = converter.readData(file, Task.class);
		System.out.println(taskRead);

	}
}
