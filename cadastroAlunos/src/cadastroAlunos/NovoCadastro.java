package cadastroAlunos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






@WebServlet("/novocadastro")

public class NovoCadastro extends HttpServlet {
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome").toString();
		Aluno a1 = new Aluno();
		
		a1.setNome(nome);
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id").toString();
		a1.setId(id);
		
		String rg = request.getParameter("rg").toString();
		a1.setRg(rg);
		
		String cpf = request.getParameter("cpf").toString();
		a1.setCpf(cpf);
		
		String endereço = request.getParameter("endereço").toString();
		a1.setEndereço(endereço);
		
		
		
		BancoAluno b1 = new BancoAluno();
		
		b1.adicionaAluno(a1);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Aluno: "  + nome +  "  Aluno Cadastrado com Sucesso");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Aluno" + nome + "\nAluno cadastrado com sucesso");
		
		
	
 }
}
