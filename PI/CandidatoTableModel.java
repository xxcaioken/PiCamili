import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class CandidatoTableModel extends AbstractTableModel {
    private List<Candidato> candidatos = new ArrayList<>();
    private String[] colunas = new String[] { "Id",
            "Nome",
            "Partido" };

    public CandidatoTableModel() {
        this.candidatos = setCandidatoList();
        fireTableDataChanged();
    }
    public static List<Candidato> setCandidatoList(){
        new CandidatoStorage();
        return CandidatoStorage.selectList();
    }
    @Override
    public int getRowCount() {
        return candidatos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIdx, int colIdx) {
        String value = null;

        Candidato tarefa = candidatos.get(rowIdx);

        switch (colIdx) {
            case 0:
                value = Integer.toString(tarefa.getId());
                break;
            case 1:
                value = tarefa.getNome();
                break;
            case 2:
                value = tarefa.getPartido();
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

    public void carregar(List<Candidato> candidatos) {
        this.candidatos = candidatos;
        fireTableDataChanged();
    }

    public Candidato getCandidato(int rowIdx) {
        Candidato candidato = null;
        candidato = candidatos.get(rowIdx);
        return candidato;
    }
    
    public List<Candidato> getCandidatos() {
        return this.candidatos;
    }
}
