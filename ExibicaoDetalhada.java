public class ExibicaoDetalhada implements ExibicaoStrategy {
    @Override
    public String exibir(Video video) {
        return video.toString();
    }
}
