import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControlLogin {
	
	public String login(String cpf, String senha) throws SQLException
	{
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection c = connectionFactory.getConnection();
		Statement stm = c.createStatement();
		//String SQL = "create table usuarios(cpf varchar(20) not null,nome varchar(20) not null,senha varchar(20) not null,primary key(cpf))";
		//stm.executeUpdate(SQL);
		
		String SQL2 = "SELECT * FROM usuarios";
		
		System.out.println(SQL2);
		stm.executeQuery(SQL2);
		
		ResultSet rs = stm.getResultSet();
		

		while ( rs.next() ) {
			String aux = rs.getString("cpf");
			String aux2 = rs.getString("senha");
			String aux3 = rs.getString("nome");
			//System.out.println(aux);
			//System.out.println(aux2);
			if(aux.equals(cpf) && aux2.equals(senha)) {
				return aux3;
			}
			if(aux.equals(cpf) && !(aux2.equals(senha))) {
				return "Senha errada!";
			}
			
		}
		return "Usuário não encontrado!";
		
		

		
	}
}
