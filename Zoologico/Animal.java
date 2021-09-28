package Zoologico;

public abstract class Animal {
    private String nome;
    private float comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velocidade;


    public Animal(){
        this.numPatas = 4;
    }

    public int getNumPatas(){
        return this.numPatas;
    }
    public void setNumPatas(int numPatas){
        this.numPatas = numPatas;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public float getComprimento(){
        return this.comprimento;
    }
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getAmbiente(){
        return ambiente;
    }
    public void setAmbiente(String ambiente){
        this.ambiente = ambiente;
    }

    public double getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }


    public String toString(){
        return "Nome do Animal: " + this.nome +
                "\nComprimento do Animal: " + this.comprimento + "cm" +
                "\nNúmero de Patas: " + this.numPatas +
                "\nCor do Animal: " + this.cor + 
                "\nAmbiente do Animal: " + this.ambiente +
                "\nVelocidade do Animal: " + this.velocidade + "m/s";
    }

}
