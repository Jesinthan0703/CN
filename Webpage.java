import java.io.*;
import java.net.*;

 
public class Webpage {
  public static void main(String[] args) throws Exception {
     URL url = new URL("https://www.loyolacollege.edu/");
     BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
     BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
    
	 System.out.println("Webpage downloaded successfully");
     reader.close();
     writer.close();
  }
}

