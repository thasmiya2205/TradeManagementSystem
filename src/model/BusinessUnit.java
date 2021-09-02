package model;

import java.util.ArrayList;
import java.util.List;

public class BusinessUnit {
	
	private int unit_id;
    private String unit_name;
    public List<BusinessUnit> units;
    
public BusinessUnit() {}

public BusinessUnit(int unit_id, String unit_name) {
		
		this.unit_id = unit_id;
		this.unit_name = unit_name;
		units=new ArrayList<BusinessUnit>();
		
	}



public List<BusinessUnit> getUnits() {
	return units;
}

public void setUnits(List<BusinessUnit> units) {
	this.units = units;
}

public int getUnit_id() {
		return unit_id;
	}

public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}

public String getUnit_name() {
	return unit_name;
}

public void setUnit_name(String unit_name) {
	this.unit_name = unit_name;
}
   
   
}
