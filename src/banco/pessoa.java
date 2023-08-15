package banco;

public class pessoa {

    private String Nome;
    private int Cpf;
    private int dataNacimento;
    private String endereco;

    public pessoa(String Nome, int Cpf, int dataNacimento, String endereco) {
        
        this.Nome = Nome;
        if(this.Cpf)
        
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.dataNacimento = dataNacimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return Nome;
    }
    
      public void setNome(String Nome) {
        this.Nome = Nome;
    }
      
      public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

 // Cpf e data de nacimento não pode ser trocada 
    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public void setDataNacimento(int dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    private boolean valisaCPF(String cpf){
        return true;
        
    }
    
   
        }
    }

}
