import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PesquisaStorage {
    private static List<Pesquisa> pesquisas = new ArrayList<>();

    public static List<Pesquisa> selectList() {
        try {
            Connection con = MysqlCon.getConexao();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from pesquisa_eleitoral");
            List<Pesquisa> lista;
            lista = new ArrayList<Pesquisa>();
            while (rs.next()) {
                Pesquisa p = new Pesquisa();
                p.setId(rs.getInt(1));
                p.setIdCandidato(rs.getInt(2));
                p.setData(rs.getString(3));
                p.setIntencaoDeVoto(rs.getDouble(4));
                p.setFontePesquisa(rs.getString(5));
                lista.add(p);
            }
            System.out.println(lista);
            return lista;
        } catch (Exception e) {
            System.out.println(e);

        }
        return null;
    }

    public void insertList(Pesquisa p) {

        pesquisas.add(p);
        ResultSet resultSet = null;

        try {

            Connection con = MysqlCon.getConexao();

            PreparedStatement stmt = con.prepareStatement("insert into pesquisa_eleitoral(id_candidato,data_pesquisa,intencao_voto,Fonte_pesquisa)values(?,?,?,?)");
            stmt.setInt(1, p.getIdCandidato());
            stmt.setString(2, p.getData());
            stmt.setDouble(3, p.getIntencaoDeVoto());
            stmt.setString(4, p.getFontePesquisa());
            stmt.execute();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {

                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
    }

    public void updatetList(Pesquisa p) {
        try {

            Connection con = MysqlCon.getConexao();
            PreparedStatement stmt = con.prepareStatement("UPDATE pesquisa_eleitoral SET id_candidato = ?,data_pesquisa=?,intencao_voto=?,Fonte_pesquisa=? WHERE id = ?");
            stmt.setInt(1, p.getIdCandidato());
            stmt.setString(2, p.getData());
            stmt.setDouble(3, p.getIntencaoDeVoto());
            stmt.setString(4,p.getFontePesquisa());
            stmt.setInt(5, p.getId()+1);
            stmt.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    public void deleteList(String c) {
        for(Pesquisa pesquisa : pesquisas)
            if(String.valueOf(pesquisa.getId())== c)
                pesquisas.remove(pesquisa);
        try {
            Connection con = MysqlCon.getConexao();
            PreparedStatement stmt = con.prepareStatement("Delete from pesquisa_eleitoral WHERE id =" + c);
            stmt.execute();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
    public static Pesquisa selectPesquisa(String id) {
        try {
            Pesquisa p = new Pesquisa();
            Connection con = MysqlCon.getConexao();
            Statement stmt = con.createStatement();
            String query ="select * from pesquisa_eleitoral where id = "+ String.valueOf(id);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setIdCandidato(rs.getInt(2));
                p.setData(rs.getString(3));
                p.setIntencaoDeVoto(rs.getDouble(4));
                p.setFontePesquisa(rs.getString(5));
            }
            return p;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    public static List<Pesquisa> selectDesempenho() {
        try {
            Connection con = MysqlCon.getConexao();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select candidato.id ,candidato.nome,AVG(pesquisa_eleitoral.intencao_voto) AS CloseAverage  from candidato INNER JOIN pesquisa_eleitoral ON candidato.id=pesquisa_eleitoral.id_candidato");
            List<Pesquisa> lista;
            lista = new ArrayList<Pesquisa>();
            while (rs.next()) {
                Pesquisa p = new Pesquisa();
                p.setIdCandidato(rs.getInt(1));
                p.setnomeDoCandidato(rs.getString(2));
                p.setIntencaoDeVoto(rs.getDouble(3));
                lista.add(p);
            }
            return lista;
        } catch (Exception e) {
            System.out.println(e);

        }
        return null;
    }
}
