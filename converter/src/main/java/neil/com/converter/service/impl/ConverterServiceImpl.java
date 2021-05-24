package neil.com.converter.service.impl;

import org.springframework.stereotype.Service;

import neil.com.converter.service.ConverterService;
import neil.com.converter.util.ConversionFormula;
 
@Service
public class ConverterServiceImpl implements ConverterService {

	@Override
	public Double convert(String type, double value) {
		Double result = 0.00;
		result = "f2c".equals(type) ? ConversionFormula.F2C.apply(value) : ConversionFormula.C2F.apply(value);
		result = "k2m".equals(type) ? ConversionFormula.K2M.apply(value) : ConversionFormula.M2K.apply(value);
		result = "sk2a".equals(type) ? ConversionFormula.SK2A.apply(value) : ConversionFormula.A2SK.apply(value);
		result = "l2g".equals(type) ? ConversionFormula.L2G.apply(value) : ConversionFormula.G2L.apply(value);
		result = "k2p".equals(type) ? ConversionFormula.F2C.apply(value) : ConversionFormula.C2F.apply(value);
		
		return result;
	}
}