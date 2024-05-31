package Contact;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test
	public void createContact()
	{
		String url=System.getProperty("url");
		String Browser=System.getProperty("browser");
		String Username=System.getProperty("username");

		String Password=System.getProperty("password");
System.out.println(url);
System.out.println(Browser);
System.out.println(Username);
System.out.println(Password);
	}
	@Test
	public void cretephone()
	{
		
	}
}
