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


public class checarlogin{
  public String checarconta(){
    Scanner inputconta = new Scanner(System.in);
    List<String> arrayconta = new ArrayList<String>();
    String usuario = "";
    String senha;
    boolean exist = false;
    boolean existlogin = false;
    boolean existsenha = false;
    
    while (exist == false){
      arrayconta = new ArrayList<String>();
      
      System.out.println("Digite seu nome de usuario:");
      usuario = inputconta.nextLine();

      if (usuario.equals("cancelar")){
        System.exit(0);
      }

      System.out.println("Digite sua senha: ");
      senha = inputconta.nextLine();

      arrayconta.add(usuario);
      arrayconta.add(senha);

      File file = new File("registros.txt");

      try {
        Scanner scanner = new Scanner(file);
        int lineNum = 0;
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          lineNum++;
          if (line.contains(usuario)){
            existlogin = true;
          }
        }
      } catch(FileNotFoundException e) { 
        System.out.println("aaaaaaaa");
}


      try {
        Scanner scanner = new Scanner(file);
        int lineNum = 0;
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          lineNum++;
          if (line.contains(senha)){
            existsenha = true;
          }
        }
      } catch(FileNotFoundException e) { 
        System.out.println("aaaaaaaa");
}

      if (existlogin && existsenha){
        exist = true;
        return usuario;
        

      }else{
        exist = false;
        existlogin = false;
        existsenha = false;
        
          
        System.out.println("Esta conta não existe, tente novamente.");
        return usuario;
      }

    }
    return usuario;
    

  }
}
