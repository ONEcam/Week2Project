
public class DataFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataFactory dataFactory = new DataFactory();
		
		Data data1 = dataFactory.getData("Turn1Data");
		
		data1.dataLogging();
		
		Data data2 = dataFactory.getData("Turn2Data");
		
		data2.dataLogging();
		
		Data data3 = dataFactory.getData("Turn3Data");
		
		data3.dataLogging();
		
		Data data4 = dataFactory.getData("Turn4Data");
		
		data4.dataLogging();
			
	}

}
