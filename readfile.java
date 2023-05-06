import java.io.*;

class readfile
{
    public static void main(String Arg[]) throws Exception
    {
        FileOutputStream fobj = new FileOutputStream("Infosystem.txt");
        int i = 0;

        while(( i = fobj.read()) != -1)
        {
            System.out.print((char)i);
        }

        fobj.close();
    }
}