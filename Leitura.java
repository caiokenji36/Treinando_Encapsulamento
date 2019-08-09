package biblioteca;
public class Leitura {
   public static void main(String[] args){
       Pessoa p1 = new Pessoa("caio",15,'m');
       Pessoa p2 =new Pessoa("Dani",23,'f');
       p1.fazerAni();
       p2.fazerAni();
       
       Livro l1 = new Livro("Matador","Teddy",200,100,p2);
       Livro l2 = new Livro("Matador2","Teddy",500,1,p1);
       
       l1.detalhes();
       l2.detalhes();
       
       
       l1.abrir();
       
       l1.avancarPagina();
       l1.avancarPagina();
       
       
       l2.faltaPaginas();
       l1.faltaPaginas();
   }
    
}
