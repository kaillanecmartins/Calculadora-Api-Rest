package ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MathRaizQuadrada {
	@GetMapping("/raizquadrada/{num1}/{num2}")
	
	public Double raizQuadrada(
			@PathVariable(value = "num1") String num1Str,
			@PathVariable(value = "num2") String num2Str
		) throws Exception{
			return Math.sqrt(NumeroConverter.convertToDouble(num1Str));
	}
}
