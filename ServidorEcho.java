import java.net.*;
import java.util.*;
import java.io.*;

public class ServidorEcho {
	public static void main(String[] agrs) throws Exception{
		ServerSocket serv = new ServerSocket(9000);
		while(true) {
		System.out.println("Aguardando...");
		Socket s = serv.accept();
		Scanner entrada = new Scanner(s.getInputStream());
		PrintWriter saida = new PrintWriter(s.getOutputStream(),true);
		String msg;
		do {
			 msg = entrada.nextLine();
			 saida.println(msg.toUpperCase());
		}while(!msg.equals("bye"));
		
		entrada.close();
		saida.close();
		s.close();
		}
		//serv.close();
	}
}
