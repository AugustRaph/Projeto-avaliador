import java.util.*; 
class Main {
  public static void main(String[] args) {
    int indice = 99;
    HashMap<Integer, String> chart = new HashMap<Integer, String>()
    System.out.println("Bem Vindo a Loja do Raphael");
    HashMap<Integer, String> Menu = new HashMap<Integer, String>();
    Menu.put(1,"1 - Carrinho de Compras");
    Menu.put(2,"2 - Calças");
    Menu.put(3,"3 - Vestidos");
    Menu.put(4,"4 - Shorts");
    Menu.put(5,"5 - Tênis");
    Menu.put(6,"6 - Camisetas");
    Menu.put(0,"0 - Sair");
    System.out.println("Bem Vindo a Loja do Raphael");
    System.out.println("Você está na Seção:" + "Menu Principal") ;
    System.out.println("Escolha Uma Seção");  
    Menu.forEach((k,v) -> System.out.println(v));
    Scanner scan = new Scanner(System.in);  
    while (indice != 0) {
      indice = scan.nextInt();
      System.out.println("Você está na Seção:" + Menu.get(indice)) ;
      switch(indice){
        case 1:
          System.out.println("Carrinho de Compras");
          //Carrinho.carrinho();
          break;
        case 2:
          System.out.println("Calças"); 
        case 3:
          System.out.println("Vestidos");
        case 4:
          System.out.println("Shorts");
        case 5:
          System.out.println("Tênis");
        case 6:
          System.out.println("Camisetas");
      }
    };
    System.out.println("Obrigado por Visitar a Loja do Raphael");;
  }
}