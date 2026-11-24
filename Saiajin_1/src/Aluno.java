public class Aluno {
    int matrícula;
    String nome;
    // notas aluno (0-10)
    double nota_de_prova1;
    double nota_de_prova2;
    double nota_de_trabalho;

    public void calculaMedia() {
      double media = ((nota_de_prova1 * 2.5) + (nota_de_prova2 * 2.5) +
              (nota_de_trabalho * 2))/7;

        if (media >= 6) {
            System.out.println("Paszo");
        }
        else {
            System.out.println("Paaso não");
        }
    }
}
