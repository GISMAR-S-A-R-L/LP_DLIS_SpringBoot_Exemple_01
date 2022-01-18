package fr.iutv.springboot.exemple_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExempleController {

	@GetMapping("/test")
	public String test() {
		return " C'est un test";
	}

}