package principal;

import pessoa.Pessoa;
import pessoa.PessoaFisica;

public class Principal {
  static int num = 1;

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Ana");
    System.out.println(pessoa.getIdentificacao());

    PessoaFisica pessoaFisica = new PessoaFisica("Iris", "123.456.789-00");
    System.out.println(pessoaFisica.getIdentificacao());
    System.out.println(pessoaFisica.getIdentificacao("(01)234567890"));
  }
}
