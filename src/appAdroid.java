
public class appAdroid extends Application {
	
	public appAdroid(String name) {
		
		super(name);

		setAppId( generateId() );
		
	}

	@Override
	public boolean validateName() {
		
		String name = getAppName();
		
		return name.endsWith( "Droid" );
		
	}

	@Override
	public String generateId() {
		return "dio"+ generateRandomId( 7 ) +"rda";
	}

}
