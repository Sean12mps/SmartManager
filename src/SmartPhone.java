
public class SmartPhone {
	
	public OperatingSystem phoneOS;
	
	public Application[] Application;
	
	public SmartPhone( String osName ) {
		
		switch ( osName ) {
		
			case "Adroid":
				this.phoneOS = new osAdroid();
				break;
				
			case "aPhone":
				this.phoneOS = new osAphone();
				break;
				
			case "Windos":
				this.phoneOS = new osWindos();
				break;
				
		}
		
	}
	
	public String getNameOs() {
		return this.phoneOS.getName();
	}

}
