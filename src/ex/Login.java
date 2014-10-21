package ex;

public class Login {

	public static void tryLogin(String u, String p) throws SecurityBreachException
	{
		if(u.equals("u") && p.equals("p"))
		{
			System.out.println("ok");
		}
		else
		{
			throw new SecurityBreachException();
			
		}
	}
	
	public static void main(String[] args)
	{
		try{
			tryLogin("x", "y");
		}
		catch(SecurityBreachException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	
}
