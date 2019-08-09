package biblioteca;
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    public Pessoa(String nome,int idade,char sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    
}
    
     //Metodos
    public void fazerAni(){
        this.setIdade(this.getIdade()+1);
        System.out.println("Feliz aniversario "+this.getNome());
        System.out.println("Agora voce tem: "+this.getIdade());
        if(this.sexo=='m'){
            System.out.println("Voce e um menino");
        }else{
            System.out.println("Voce e uma menina");
        }
    }
    
    //Get e Set
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade=idade;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo=sexo;
    }
    
    
   
    
}
