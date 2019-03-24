import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Application implements ApplicationInterface  {
	
	public String appName;
	public String appId;
	
	public Application( String name ) {
		setAppName( name );
	}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String generateRandomId( int length ) {
		
		String randomThings = "";

		Random rand = new Random();
		
		for ( int i = 0; i < length; i++ ) {
			randomThings += rand.nextInt(9);
		}
		
		return randomThings;
		
	}
	
	public boolean isIdValid( ArrayList<String> appIds ) {
		
		return ( ! appIds.contains( getAppId() ) );
	}

}
