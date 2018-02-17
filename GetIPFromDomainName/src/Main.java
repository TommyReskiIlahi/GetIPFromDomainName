import java.util.*;
import java.net.*;

public class Main
{
	public static void main(String[] args)
	{
		String url = "www.google.com";
		try{
			InetAddress getIP = InetAddress.getByName("www.google.com");
			System.out.println("IP " + url + " is: " + getIP.getHostAddress());
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
