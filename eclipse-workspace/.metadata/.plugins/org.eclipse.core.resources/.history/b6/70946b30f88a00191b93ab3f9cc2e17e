import java.sql.SQLException;

public class Usuario {
	private String nome;
	private String cpf;
	private String senha;
	private String funcao = "Ainda nada";
	private boolean teste = false;
	
	public Usuario(String nome, String cpf, String senha) throws SQLException
	{
		UsuarioMapper mapper = new UsuarioMapper();
		boolean result = mapper.verificaRegistro(nome, cpf, senha);
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		teste = result;
	}
	public Usuario(String id)
	{
		
	}
	public boolean resultado()
	{
		return this.teste;
	}
}
