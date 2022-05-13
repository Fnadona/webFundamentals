import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperarConexao();

        PreparedStatement stm = connection.prepareStatement("DELETE FROM produto WHERE ID > ?");
        stm.setInt(1, 3);
        stm.execute();

        Integer linhasModificadas = stm.getUpdateCount();

        System.out.println("Quantidade de linhas que foram modificadas: "+ linhasModificadas);

        stm.close();
        connection.close();
    }
}
