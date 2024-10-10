import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                // Criando filmes
                Filme filme1 = new Filme("Interestelar", "Christopher Nolan", 2014, "Ficção Científica",
                                Arrays.asList("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"), 169);

                Filme filme2 = new Filme("Cidade de Deus", "Fernando Meirelles", 2002, "Drama",
                                Arrays.asList("Alexandre Rodrigues", "Leandro Firmino", "Alice Braga"), 130);

                // Criando série
                Serie serie1 = new Serie("Stranger Things", "Irmãos Duffer", 2016, "Ficção Científica",
                                Arrays.asList("Millie Bobby Brown", "Finn Wolfhard", "Winona Ryder"), 4);

                // Aplicando a estratégia de exibição detalhada
                ExibicaoStrategy exibicaoDetalhada = new ExibicaoDetalhada();

                filme1.setEstrategiaExibicao(exibicaoDetalhada);
                serie1.setEstrategiaExibicao(exibicaoDetalhada);

                System.out.println("Exibição Detalhada:");
                System.out.println();
                System.out.println(filme1.exibir());
                System.out.println();
                System.out.println(serie1.exibir());

                // Mudando para a estratégia de exibição resumida
                ExibicaoStrategy exibicaoResumida = new ExibicaoResumida();

                filme1.setEstrategiaExibicao(exibicaoResumida);
                serie1.setEstrategiaExibicao(exibicaoResumida);

                System.out.println();
                System.out.println("\nExibição Resumida:");
                System.out.println(filme1.exibir());
                System.out.println();
                System.out.println(serie1.exibir());

                // Para o filme 2
                filme2.setEstrategiaExibicao(exibicaoDetalhada);

                System.out.println("\nExibição Detalhada:");
                System.out.println(filme2.exibir());

                // Mudando para a estratégia de exibição resumida
                filme2.setEstrategiaExibicao(exibicaoResumida);

                System.out.println("\nExibição Resumida:");
                System.out.println(filme2.exibir());

        }
}
