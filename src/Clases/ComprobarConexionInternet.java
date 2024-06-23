package Clases;

import java.net.Socket;

public class ComprobarConexionInternet {
    public boolean test()
    {
        String dir = "www.google.com";
        int puerto= 80;
        try
        {
            Socket s = new Socket(dir, puerto);
            if(s.isConnected()){
                System.out.println("Conexión establecida con la dirección: " + dir + " a través del pueto: " + puerto);
            }
        }
        catch (Exception e)
        {
            System.err.println("No se pudo establecer conexión con: " + dir + " a través del puerto: " + puerto);
            return false;
        }
        return true;
    }
}
