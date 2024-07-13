import br.com.alura.exercicios.*;

public class ContaPrincipal {
    public static void main(String[] args) {
        exercicios conta1 = new exercicios();
        conta1.nome = "Nicollas";
        conta1.setNumeroDaConta(2);
        conta1.setSaldo(1500);

        System.out.println("Titular da conta:" + conta1.nome);
        System.out.println("Numero da conta:" + conta1.getNumeroDaConta());
        System.out.println("Saldo da conta:" + conta1.getSaldo());

        conta1.setSaldo(1200);
        System.out.println("Saldo da conta:" + conta1.getSaldo());

        IdadePessoal idade1 = new IdadePessoal();
        idade1.setNome("João");
        idade1.setIdade(15);

        System.out.println("Seu nome: " + idade1.getNome());
        System.out.println("Sua idade: " + idade1.getIdade());
        idade1.maiorOuNao();

        Produto produto1 = new Produto("celular",1500);
        System.out.println("Nome do Produto: " + produto1.getNome());
        System.out.println("O valor sem desconto: " + produto1.getPreco());

        produto1.Aplicardesconto(10);
        System.out.println("O valor pos desconto: " + produto1.getPreco());

        Aluno aluno1 = new Aluno("Maria",7.5,8.0,9.2);
        System.out.println("Nome do Aluno: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.MediaNota());
        System.out.println();

        Livro livro1 = new Livro();
        livro1.setAutor("Antoine de Saint");
        livro1.setTitulo("Pequeno Príncipe");
        livro1.ExibirDetalhes();

    }
}