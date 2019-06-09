<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login do sistema</title>
</head>
<body>
 
<form action="Login" method="POST">
    <h2>Faça o login</h2>
    <table border="0" cellpadding="1">
        <tr>
            <td><label>CPF</label></td>
            <td><input type="text" name="cpf" size="20" /> </td>
        </tr>
        <tr>
            <td><label>Senha</label></td>
            <td><input type="password" name="senha" size="20" /> </td>
        </tr>
         
        <tr>
            <td colspan="2">
                <input type="submit" value="Entrar"/>
                <input type="reset" value="Limpar"/>
                
            </td>
        </tr>
    </table>
    <p>${param.message}</p>
</form>

<form action="RegistrarUsuarioPag.jsp" method="POST">
 	<input type="submit" value="Registrar"/>
 </form>
 	
 	
</body>
</html>