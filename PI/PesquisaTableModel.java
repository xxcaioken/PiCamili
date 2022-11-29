import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class PesquisaTableModel extends AbstractTableModel {
    private List<Pesquisa> pesquisa = new ArrayList<>();

    private String[] colunas = new String[] { "Id",
            "id_candidato",
            "data_Pesquisa",
            "intencao_voto",
            "Fonte_pesquisa" };

    public PesquisaTableModel() {
        this.pesquisa = setPesquisaList();
        fireTableDataChanged();
    }

    public static List<Pesquisa> setPesquisaList() {
        new CandidatoStorage();
        return PesquisaStorage.selectList();
    }

    @Override
    public int getRowCount() {
        return pesquisa.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIdx, int colIdx) {
        String value = null;

        Pesquisa pesquisa = this.pesquisa.get(rowIdx);

        switch (colIdx) {
            case 0:
                value = Integer.toString(pesquisa.getId());
                break;
            case 1:
                value = String.valueOf(pesquisa.getIdCandidato());
                break;
            case 2:
                 value = pesquisa.getData();
                break;
            case 3:
                value = Double.toString(pesquisa.getIntencaoDeVoto());
                break;
            case 4:
                value = pesquisa.getFontePesquisa();
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

    public void carregar(List<Pesquisa> pesquisa) {
        this.pesquisa = pesquisa;
        fireTableDataChanged();
    }

}
