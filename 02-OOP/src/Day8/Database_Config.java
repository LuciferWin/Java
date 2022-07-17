package Day8;

public class Database_Config {
//	2 Static Field
	static Database_Config config;
	
//	1 Private Constructor
	private Database_Config() {
		
	}
	
//	3 Static Method to return obj
	public static Database_Config getInstance() {
		if(config == null)
			config = new Database_Config();
		return config;
	}
}
