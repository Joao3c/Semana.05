package petshop;

class Cachorro {

    public Cachorro(String nome, String raca, int idade, Dono dono, String porte) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
        this.porte = porte;
    }

    String nome;
    String raca;
    int idade;
    Dono dono;
    String porte;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public Dono getDono() {
        return dono;
    }

    public String getPorte() {
        return porte;
    }

}
