
public class Pesquisa {
    private int idDaPesquisa;
    private String data;
    private int idCandidato;
    private double intencaoDeVoto;
    private String fontePesquisa;
    private String nomeDoCandidato;
    private int desempenho;

    public int getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(int desempenho) {
        this.desempenho = desempenho;
    }

    public String getnomeDoCandidato() {
        return nomeDoCandidato;
    }

    public void setnomeDoCandidato(String nomeDoCandidato) {
        this.nomeDoCandidato = nomeDoCandidato;
    }

    public String getFontePesquisa() {
        return fontePesquisa;
    }

    public void setFontePesquisa(String fontePesquisa) {
        this.fontePesquisa = fontePesquisa;
    }

    public double getIntencaoDeVoto() {
        return intencaoDeVoto;
    }

    public void setIntencaoDeVoto(Double intencaoDeVoto) {
        this.intencaoDeVoto = intencaoDeVoto;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return idDaPesquisa;
    }

    public void setId(int id) {
        this.idDaPesquisa = id;
    }

    public Pesquisa get(int rowIdx) {
        return null;
    }

}
