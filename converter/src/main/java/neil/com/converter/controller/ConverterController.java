package neil.com.converter.controller;

import java.util.HashMap;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import neil.com.converter.dto.ConverterDTO;
import neil.com.converter.service.ConverterService;
 
@RestController
@RequestMapping(value = "/converter")
public class ConverterController {
 
	@Autowired
	ConverterService converterService;
 
	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Double> convert(@RequestBody ConverterDTO converter) {
		Map<String, Double> map = new HashMap<>();
		Double result = converterService.convert(converter.getType(), converter.getValue());
		map.put("result", result);
		return map;
	}
}