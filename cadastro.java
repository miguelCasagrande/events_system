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
import java.time.LocalDate;

//cadastro de eventos novos

public class cadastro{
  public void eventos(){
    
    Scanner input = new Scanner(System.in);
    List<String> arrayevento = new ArrayList<String>();
    String nomedoevento;
    String categoria;
    String horario;
    String descricao; 
    String endereco;
    String data;
    int ano;
    int mes;
    int dia;





    

    System.out.println("Nome do evento: ");
    nomedoevento = input.nextLine();

    System.out.println("Ano do evento (AAAA): ");
    ano = input.nextInt();

    System.out.println("Mês do evento (MM): ");
    mes = input.nextInt();

    System.out.println("Dia do evento (DD): ");
    dia = input.nextInt();

    data = LocalDate.of(ano, mes , dia).toString();

    System.out.println("Categoria, digite 1 para 'festas', 2 para 'eventos esportivos', 3 para 'shows', 4 para 'outros': ");
    categoria = input.nextLine();
    //input.nextLine();

    System.out.println("Descrição do evento: ");
    descricao = input.nextLine();    

    System.out.println("Endereço: ");
    endereco = input.nextLine();       

    arrayevento.add(data);
    arrayevento.add(nomedoevento);
    
    arrayevento.add(categoria);
    arrayevento.add(descricao);
    arrayevento.add(endereco);


    System.out.println(arrayevento);

    File log = new File("events.data");
    
    try{
    PrintWriter out = new PrintWriter(new FileWriter(log, true));
    out.append(arrayevento.toString() + "\n");
    out.close();
    }catch(IOException e){
        System.out.println("COULD NOT LOG!!");
    }
  }
}
