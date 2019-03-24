import java.util.ArrayList;

public class SmartPhone {
	
	protected OperatingSystem phoneOS;
	
	protected ArrayList<Application> Applications = new ArrayList<Application>();
	
	public SmartPhone( String osName ) {
		setOs( osName );
	}
	
	public void setOs( String osName ) {
		
		Applications.clear();
		
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
	
	public void installApp( String appName ) {
		
		Application app = null;
		
		switch ( getNameOs() ) {
		
			case "Adroid":
				app = new appAdroid( appName );
				break;
				
			case "aPhone":
				app = new appAphone( appName );
				break;
				
			case "Windos":
				app = new appWindos( appName );
				break;
				
		}
		
		if ( app.validateName() ) {
			
			ArrayList<String> appIds = new ArrayList<String>();
			
			if ( ! Applications.isEmpty() ) {
			
				for ( int i = 0; i < Applications.size(); i++ ) {
					appIds.add( Applications.get(i).getAppId() );
				}
				
				while ( ! app.isIdValid( appIds ) ) {
					app.setAppId( app.generateId() );
				}
			
			}
			
			Applications.add( app );
			
		} else {
			
			throw new java.lang.Error("invalid-app-name");
			
		}
		
	}
	
	//	Testing
	public void getApps() {
		
		for ( int i = 0; i < Applications.size(); i++ ) {
			System.out.print(Applications.get(i).getAppId() + " - ");
			System.out.println(Applications.get(i).getAppName());
		}
		
	}

}
