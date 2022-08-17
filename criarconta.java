import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import static java.nio.file.StandardOpenOption.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;



public class criarconta{
  public void conta(){
    Scanner inputconta = new Scanner(System.in);
    List<String> arrayconta = new ArrayList<String>();
    String usuario;
    String senha;
    boolean exist = true;
    
    while (exist == true){
      arrayconta = new ArrayList<String>();
      exist = false;
      
      System.out.println("Crie um usuario, ou digite 'cancelar' para voltar ao menu principal:");
      usuario = inputconta.nextLine();

      if (usuario.equals("cancelar")){
        System.exit(0);
      }

      System.out.println("Crie uma senha: ");
      senha = inputconta.nextLine();

      arrayconta.add(usuario);
      arrayconta.add(senha);

      File file = new File("registros.txt");

      try {
        Scanner scanner = new Scanner(file);

          //now read the file line by line...
        int lineNum = 0;
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          lineNum++;
          if (line.contains(usuario)){
            exist = true;
            System.out.println("Este usuario já existe, tente novamente.");
          }
        }
      } catch(FileNotFoundException e) { 
        System.out.println("aaaaaaaa");
}

    }
    File log = new File("registros.txt");
    
    try{
    PrintWriter out = new PrintWriter(new FileWriter(log, true));
    out.append(arrayconta.toString() + "\n");
    out.close();
    }catch(IOException e){
        System.out.println("COULD NOT LOG!!");
    }
    System.out.println("Conta criada com sucesso!");
  }
}
