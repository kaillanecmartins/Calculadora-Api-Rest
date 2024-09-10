package ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MathSubtracao {
	@GetMapping("/subtracao/{num1}/{num2}")
	
	public Double subtracao(
			@PathVariable(value = "num1") String num1Str,
			@PathVariable(value = "num2") String num2Str
		) throws Exception{
			return NumeroConverter.convertToDouble(num1Str) 
					- NumeroConverter.convertToDouble(num2Str);
	}
}
