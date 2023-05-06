import java.net.*;
import java.io.*;



class Client
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Client Application is running...");
        
        System.out.println("Client is waiting for connection");


        Socket s = new Socket("localhost",2100);
                                         // port
                                // ip address

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferReader br1 = new BufferReader(new InputStreamReader(s.getInputStream()));
        BufferReader br2 = new BufferReader(new InputStreamReader(System.in));

        String str1,str2;
        while(str2 = br2.readLine()).equals("end");
        {
            ps.println(str1);
            System.out.println("Enter message for Server :");
            str2 = br1.readLine();
            System.out.println("Server says :"+str2());
        }




    }
}