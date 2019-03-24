
public class appWindos extends Application {
	
	public appWindos(String name) {
		
		super(name);

		setAppId( generateId() );
		
	}

	@Override
	public boolean validateName() {
		
		String name = getAppName();
		
		return name.contains( "WindOS" );
		
	}

	@Override
	public String generateId() {
		return "wind"+ generateRandomId( 6 ) +"OS";
	}

}
