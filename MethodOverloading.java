package Login;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading mo  = new MethodOverloading();
		mo.login(1231231234);
	}
	public void login (String username)
	{
		System.out.println("Logged in with username");
	}
    public void login(String Email ,String Password)
    {
	System.out.println("login with email and password");
    }
    public void login(int mobile)
    {
    	System.out.println("login with mobile");
    }




}

