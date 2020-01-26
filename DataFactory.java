
public class DataFactory {
	
	public Data getData (String dataType) {
		if(dataType==null) {
			return null;
		}
		
	if (dataType.equals("Turn1Data")) {
		return new Turn1Data();
		
	}
	else if (dataType.equals("Turn2Data")) {
		return new Turn2Data();
	
	}
	else if (dataType.equals("Turn3Data")) {
		return new Turn3Data();
		
	}
	else if (dataType.equals("Turn4Data")) {
		return new Turn4Data();
	}
	
	return null;
	}
}
