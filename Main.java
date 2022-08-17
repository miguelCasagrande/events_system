import java.util.Scanner;

// falta: cancelar eventos inscritos

class Main {
  public static void main(String[] args) {
    boolean logged = false;
    Scanner input = new Scanner(System.in);
    String usuario = "";

    while (logged==false){
      Scanner inputlog = new Scanner(System.in);

      System.out.println("Digite 1 para criar uma conta ou 2 para fazer login:");
      int loginnum = inputlog.nextInt();

      if (loginnum == 1){
        criarconta criarcontaobject = new criarconta();
        criarcontaobject.conta();
      }
    
      if (loginnum == 2){
        checarlogin checarloginobject = new checarlogin();
        usuario = checarloginobject.checarconta();
        logged = true;
        System.out.println("Bem vindo!");
      }else{
        logged = false;
      }
    }
    
    while (true){
      
      System.out.println("Digite 1 para cadastrar eventos, 2 para consultar eventos e marcar presença ou 3 para eventos que voce confirmou presença");

    

      int num = input.nextInt();

      if (num == 1){
        cadastro cadastroobject = new cadastro();
        cadastroobject.eventos();
      }

      if (num == 2){
        consulta consultaobject = new consulta();
        consultaobject.readObject(usuario);
      }

      if (num == 3){
        eventosconfirmados eventosconfaobject = new eventosconfirmados();
        eventosconfaobject.presencadouser(usuario);
      }
      
    }


    
  }
}