package br.com.junglesoft.objetos;

public class Desenvolvedor extends Funcionario{
    private String linguagem;
    private String framework;

    public Desenvolvedor(){
        linguagem = "";
        framework = "";
    }

    public Desenvolvedor(String nome, float salario, String cpf, String linguagem, String framework){
        super(nome, salario, cpf);
        this.linguagem = linguagem;
        this.framework = framework;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    //Polimorfismo - sobreescrita
    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Liguagem: " + linguagem);
        System.out.println("Framework: " + framework);
    }

    //Polimorfismo - sobrecarga(overload)
    public void programar(){
        System.out.println("Estou programando!");
    }

    public void programar(String opcao){
        System.out.println("Estou programando mais rapido!");
    }
    public void programar(int opcao){
        System.out.println("Estou programando em " + opcao + "x");
    }

}
