package dio.springbootweb.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApiController {
	@GetMapping
	public String Welcome() {
		return "Welcome to my web-api!";
	}

}
