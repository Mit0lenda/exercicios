package br.com.alura.exercicios;

public class IdadePessoal {
    private int idade;
    private  String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    //Metodo
    public void maiorOuNao(){
        if (idade >=18){
            System.out.println("Maior de Idade");
        }else {
            System.out.println("Menor de Idade");
        }
    }
}
