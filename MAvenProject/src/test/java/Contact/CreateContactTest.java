package Contact;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test
	public void createContact()
	{
		String url=System.getProperty("url","http:localhost:8888");
		String Browser=System.getProperty("browser","chrome");
		String Username=System.getProperty("username","admin");

		String Password=System.getProperty("password","admin");
System.out.println(url);
System.out.println(Browser);
System.out.println(Username);
System.out.println(Password);
	}
	@Test
	public void cretephone()
	{
		
	}
	
	@Test
	public void deleteContact()
	{
		System.out.println("delete contact");
	}
}
