package info.jongwoo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController ("/")
public class WelcomeController {
	
	@GetMapping
	public String Welcome() {
		return "this is firstBootPJ";
	}
}