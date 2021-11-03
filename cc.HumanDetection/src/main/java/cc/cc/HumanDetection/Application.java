package cc.cc.HumanDetection;



import com.sun.tools.javac.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;


@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(Application.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);
	}


	@GetMapping
	public List<String> hello() {
		return List.of("Hello", "World");
	}

	@GetMapping("/{id}")
	public List<String> test1(@PathVariable("id") int id) {

		return List.of("Hello", "World", id+"");
	}
}
