public class Serie extends ProgramaTV {
    private int temporadas;
    private int episodios;

    public Serie(String nome, String categoria, int temporadas, int episodios) {
        super(nome, categoria);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return this.temporadas;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String toString() {
        return String.format("%sQuantidadade de Temporadas: %d\nQuantidade de Episódios: %d\n", super.toString(), this.getTemporadas(), this.getEpisodios());
    }
}
