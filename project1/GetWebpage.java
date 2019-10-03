import java.net.*;
import java.io.*;
public class GetWebpage {
    public static void main(String args[]) throws Exception {

        // args[0] has the URL passed as the command parameter.
        // You need to retrieve the webpage corresponding to the URL and print it out on console
        // Here, we simply printout the URL
        try {
            StringBuilder sb = new StringBuilder();
            String line="";
            URL url = new URL(args[0]);
            URLConnection urlconnection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
           
              line =reader.readLine();
           if(line!=null){
		sb.append(line);
	}
	 while((line=reader.readLine())!=null) {
                sb.append("\n"+line);
            }
            
            reader.close();
            System.out.println(sb.toString());



        } catch(IOException e) {
            e.printStackTrace();
        }


        //System.out.println(args[0]);
    }
}


