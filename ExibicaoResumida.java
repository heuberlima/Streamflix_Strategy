public class ExibicaoResumida implements ExibicaoStrategy {
    @Override
    public String exibir(Video video) {
        return "Título: " + video.getTitulo() + " (" + video.getAnoLancamento() + ")";
    }
}
