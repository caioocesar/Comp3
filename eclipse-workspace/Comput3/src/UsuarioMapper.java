import java.sql.*;

public class UsuarioMapper {
	
	public Usuario verificaRegistro(String nome, String cpf, String senha) throws SQLException
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
				//System.out.println(aux);
				if(aux.equals(cpf)) {
					return null;
				}
				
			}
			registra(nome, cpf, senha, c);
			return new Usuario(nome, cpf, senha);
			
			
	}
	
	private void registra(String nome, String cpf, String senha, Connection c) throws SQLException
	{
		Statement stm = c.createStatement();
				
		String SQL2 = "INSERT INTO usuarios VALUES(\n"
        + "\'"+cpf+"\'"+",\n"
        + "\'"+nome+"\'"+",\n"
        + "\'"+senha+"\'"+"\n"
        + ")";
		//System.out.println(SQL2);
		stm.executeUpdate(SQL2);
		
	}
	
	
}
