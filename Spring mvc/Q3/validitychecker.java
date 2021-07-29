package webmvcQ3;

public class validitychecker {
	public validitychecker() {
		
	}
	
	public static boolean checking(String name , String email ,String password ) {
		 return (name.equalsIgnoreCase("snehal") && email.equalsIgnoreCase("snehal@gamil.com") &&  password.equalsIgnoreCase("snehal@123"));

}
}
