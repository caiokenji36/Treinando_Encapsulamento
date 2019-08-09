package biblioteca;
public class Livro implements InterfaceLivro{
    
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private Pessoa leitor;
    private boolean status;
    
    
    //COnstrutor
    public Livro(String titulo,String autor,int totalPaginas,int pagAtual, Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPagAtual(pagAtual);
        this.setTotalPaginas(totalPaginas);
        this.setLeitor(leitor);
        this.setStatus(false);
    }
    
    //Metodos
    public void detalhes(){
        System.out.println("**********DETALHE DO LIVRO*********");
        System.out.println(this.getTitulo());
        System.out.println(this.getAutor());
        System.out.println("Esse livro tem: "+this.getTotalPaginas()+" paginas");
        System.out.println("Voce esta na pagina: "+this.getPagAtual());
        System.out.println("Esta sendo lido por: "+this.getLeitor().getNome());
        System.out.println("Idade: "+this.getLeitor().getIdade());
        
    }
    
    public void faltaPaginas(){
        System.out.print("Faltam: ");
        System.out.println(this.getTotalPaginas()-this.getPagAtual());
    }
    
    public void abrir(){
        if(this.getStatus()==false){
            this.setStatus(true);
            System.out.println("Abrindo livro");
        }else
            System.out.println("Livro ja esta aberto:");
    }
    
    public void fechar(){
        if(this.getStatus()){
            this.setStatus(false);
            System.out.println("Voce fechou o livro:");
        }else{
            System.out.println("Livro ja esta fechado");
        }
        
    }
    
    public void avancarPagina(){
        if(this.getPagAtual()<this.getTotalPaginas()&& this.getStatus()){
            this.setPagAtual(this.getPagAtual()+1);
        }else{
            System.out.println("O livro terminou");
        }
        
        
    }
    public void voltarPagina(){
        if(this.getStatus()){
            this.setPagAtual(this.getPagAtual()-1);
        }else{
            System.out.println("Impossivel com o livro fechado");
        }
        
    }
    
    
    //Set e Get
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public int getTotalPaginas(){
        return totalPaginas;
    }
    public void setTotalPaginas(int totalPaginas){
        this.totalPaginas=totalPaginas;
    }
    
    public int getPagAtual(){
        return pagAtual;
    }
    
    public void setPagAtual(int pagAtual){
        this.pagAtual=pagAtual;
    }
    
    public Pessoa getLeitor(){
        return leitor;
    }
    
    public void setLeitor(Pessoa leitor){
        this.leitor=leitor;
    }
    
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status=status;
    }
    
}
