import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
import java.util.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;


// consulta de eventos existentes

public class eventosconfirmados{
  public void presencadouser(String user){


    ArrayList<String> eventos = new ArrayList<String>(); // Create an ArrayList object
    Scanner input = new Scanner(System.in);
    String nomedoevento;
    String string = String.format("%s", user, ".txt");
    File file = new File(string);
    int num = 0;
    int presenca = 0;
    
    
    try {
      File myObj = new File(string);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        //eventos.add(data);
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Você não marcou presença em nenhum evento");
      e.printStackTrace();}

  }
}