import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CandidatoStorage {
    private static List<Candidato> candidatos = new ArrayList<>();

    public static List<Candidato> selectList() {
        List<Candidato> lista = new ArrayList<>();
        try {
            Connection con = MysqlCon.getConexao();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from candidato");
            while (rs.next()) {
                Candidato p = new Candidato();
                p.setId(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setpartido(rs.getString(3));
                lista.add(p);
            }
            System.out.println(lista);
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public static Candidato selectCandidato(int id) {
        try {
            Candidato p = new Candidato();
            Connection con = MysqlCon.getConexao();
            Statement stmt = con.createStatement();
            String query ="select * from candidato where id = "+ String.valueOf(id);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setpartido(rs.getString(3));
            }
            return p;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public void insertList(Candidato c) {
        candidatos.add(c);
        ResultSet resultSet = null;

        try {

            Connection con = MysqlCon.getConexao();

            PreparedStatement stmt = con.prepareStatement("insert into candidato(id,nome,partido)values(?,?,?)");
            stmt.setInt(1, c.getId());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getPartido());
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

    public void updatetList(Candidato c) {
        try {

            Connection con = MysqlCon.getConexao();
            PreparedStatement stmt = con.prepareStatement("UPDATE candidato SET nome = ?,partido = ? WHERE id = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getPartido());
            stmt.setInt(3, c.getId());
            stmt.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteList(String c) {
        for(Candidato candidato : candidatos)
            if(String.valueOf(candidato.getId())== c)
                candidatos.remove(candidato);
        try {

            Connection con = MysqlCon.getConexao();
            PreparedStatement stmt = con.prepareStatement("Delete from candidato WHERE id =" + c);
            stmt.execute();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}
