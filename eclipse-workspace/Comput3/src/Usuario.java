import java.sql.SQLException;

public class Usuario {
	private String nome;
	private String cpf;
	private String senha;
	private boolean flag = false;
	
	public Usuario(String nome, String cpf, String senha) throws SQLException
	{
		UsuarioMapper mapper = new UsuarioMapper();
		Usuario user = mapper.verificaRegistro(nome, cpf, senha);
		
		if(user == null)
		{
			flag = false;
		}
		else
		{
			flag = true;
			this.nome = user.getNome();
			this.cpf = user.getCpf();
			this.senha = user.getSenha();
		}

	}
	
	public Usuario(String id)
	{
		
	}
	public boolean resultado()
	{
		return this.flag;
	}
	
	
	public String getNome() {
		return nome;
	}




	public String getCpf() {
		return cpf;
	}




	public String getSenha() {
		return senha;
	}





}
