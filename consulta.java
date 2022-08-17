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


public class consulta{
  public void readObject(String user){


    ArrayList<String> eventos = new ArrayList<String>(); // Create an ArrayList object
    Scanner input = new Scanner(System.in);
    String nomedoevento;
    File file = new File("events.data");
    int num = 0;
    int presenca = 0;
    
    
    try {
      File myObj = new File("events.data");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        eventos.add(data);
        //System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();}

    Collections.sort(eventos);

    for(int i = 0; i < eventos.size(); i++){
    System.out.println(eventos.get(i));
    }



    //File log = new File("events.data");
    try{
    PrintWriter out = new PrintWriter(file);

    for(int i = 0; i < eventos.size(); i++){
    out.append(eventos.get(i)+"\n");
    }
      
    
    out.close();
    }catch(IOException e){
        System.out.println("COULD NOT LOG!!");
    }

    System.out.println("Digite 1 se quiser marcar presença em algum evento e 0 para voltar ao menu principal: ");


    presenca = input.nextInt();
    input.nextLine();

    if (presenca == 1){

    System.out.println("Digite o nome do evento que voce deseja confirmar presença:");
    nomedoevento = input.nextLine();
      System.out.println("AAAAAAAAAAAAAA ");
      

    try {
        Scanner scanner = new Scanner(file);
        int lineNum = 0;

        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          lineNum++;
          if (line.contains(nomedoevento)){
            num = lineNum;
          }
        }
      } catch(FileNotFoundException e) { 
        System.out.println("aaaaaaaa");
      }


    File log = new File(String.format("%s", user, ".txt"));
    
    try{
    PrintWriter out = new PrintWriter(new FileWriter(log, true));
    out.append(eventos.get(num-1).toString() + "\n");
    out.close();
    }catch(IOException e){
        System.out.println("COULD NOT LOG!!");
    }
    System.out.println("Sua presença foi confirmada no evento.");
    }else{System.out.println("Voltando ao menu.");}
  }
}



