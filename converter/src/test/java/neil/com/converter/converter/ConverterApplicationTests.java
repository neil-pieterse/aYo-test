package neil.com.converter.converter;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import neil.com.converter.controller.ConverterController;
import neil.com.converter.dto.ConverterDTO;
import neil.com.converter.service.ConverterService;
import neil.com.converter.service.impl.ConverterServiceImpl;
import neil.com.converter.util.ConversionFormula;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
class ConverterApplicationTests {
	
	/**
	 * Possible values for test
	 * value1: f2c, c2f, k2m, m2k, sk2a, a2sk, l2g, g2l, k2p, p2k
	 * value2: any valid double.
	 */
	
	@Autowired
	private ConverterServiceImpl converterService;
	
	@Test
	public void testConverter() {
		System.out.println(converterService.convert("f2c", 32.0));
		Mockito.when(converterService.convert("f2c", 32.0)).thenReturn(converterService.convert("f2c", 32.0));
		Double convert1 = converterService.convert("f2c", 32.0);
		Assert.assertEquals("Mock Product Name", convert1);
	}
	
	@Test
    public void testHomeController() {
		ConverterDTO dto = new ConverterDTO();
		dto.setType("f2c");
		dto.setValue(32.0);
		
        ConverterController convertController = new ConverterController();
        Map<String, Double> result = convertController.convert(dto);
        System.out.println(result.get("result"));
    }
}