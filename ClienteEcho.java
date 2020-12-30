import java.net.*;
import java.io.*;
import java.util.*;

public class ClienteEcho {
       public static void main(String args[]) throws Exception
       {  
            
            InetAddress end = InetAddress.getLocalHost();
            Socket s = new Socket(end,9000);
            Scanner entrada = new Scanner(s.getInputStream()); 
            PrintWriter saida = new PrintWriter(s.getOutputStream(),true); // assim que tiver dados, envia
            Scanner teclado;
            teclado = new Scanner(System.in);
            String msg,msgRecebida;
            do {
            	System.out.println("Digite: ");
                msg = teclado.nextLine();
                saida.println(msg);
                msgRecebida = entrada.nextLine();
                System.out.println(msgRecebida);
            }while(!msg.equals("bye"));
            
            entrada.close();
            saida.close();
            s.close();
       }
}
