package neil.com.converter.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConverterDTO {
	 
	double value;
	String type;
	 
	public String getType() {
		return type;
	}
	 
	public void setType(String type) {
		this.type = type;
	}
	 
	public double getValue() {
		return value;
	}
	 
	public void setValue(double value) {
		this.value = value;
	}
}