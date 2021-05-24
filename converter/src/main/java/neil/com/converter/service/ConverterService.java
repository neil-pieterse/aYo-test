package neil.com.converter.service;

import org.springframework.stereotype.Service;

@Service
@FunctionalInterface
public interface ConverterService {
	public Double convert(String type, double value);
}