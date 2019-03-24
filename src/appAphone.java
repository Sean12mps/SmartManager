
public class appAphone extends Application {
	
	public appAphone(String name) {
		
		super(name);

		setAppId( generateId() );
		
	}

	@Override
	public boolean validateName() {
		
		String name = getAppName();
		
		return name.startsWith( "a" );
		
	}

	@Override
	public String generateId() {
		return "aYYYY"+ generateRandomId( 4 ) +"os";
	}

}
