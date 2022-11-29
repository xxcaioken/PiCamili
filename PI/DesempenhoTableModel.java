import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
public class DesempenhoTableModel extends AbstractTableModel {
    private List<Pesquisa> desempenhos = new ArrayList<>();
    private String[] colunas = new String[] { "Id",
            "Nome",
            "Desempenho" };

    public DesempenhoTableModel() {
        List<Pesquisa> p = setCandidatoList();
        this.desempenhos =p;
        fireTableDataChanged();
    }
    public static List<Pesquisa> setCandidatoList(){
        new PesquisaStorage();
        return PesquisaStorage.selectDesempenho();
    }
    @Override
    public int getRowCount() {
        return desempenhos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIdx, int colIdx) {
        String value = null;

        Pesquisa desempenho = desempenhos.get(rowIdx);

        switch (colIdx) {
            case 0:
                value = Integer.toString(desempenho.getIdCandidato());
                break;
            case 1:
                value = desempenho.getnomeDoCandidato();
                break;
            case 2:
                value = String.valueOf(desempenho.getIntencaoDeVoto()) + " de media nas pesquisas registradas";
                break;
            default:
                System.err.printf("[ERRO] Índice de coluna inválido: %d%n",
                        colIdx);
        }
        return value;
    }

    @Override
    public String getColumnName(int colIdx) {
        String colName = null;

        colName = colunas[colIdx];

        return colName;
    }

    public void carregar(List<Pesquisa> desempenhos) {
        this.desempenhos = desempenhos;
        fireTableDataChanged();
    }

    public Pesquisa getCandidato(int rowIdx) {
        Pesquisa candidato = null;
        candidato = desempenhos.get(rowIdx);
        return candidato;
    }
    
    public List<Pesquisa> getCandidatos() {
        return this.desempenhos;
    }
}