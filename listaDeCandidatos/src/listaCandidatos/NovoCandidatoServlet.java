package listaCandidatos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//criação da servelet 
@WebServlet("/novoCandidato")
public class NovoCandidatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
//metodo do Post encapsula o corpo da requisição http
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//cria um candidato e instancia a classe candidato
		Candidato c1 = new Candidato();
		String nome = request.getParameter("nome");
		c1.setNome(nome);
		
		String cpf = request.getParameter("cpf");
		c1.setCPF(cpf);
		
		String sobrenome = request.getParameter("sobrenome");
		c1.setSobrenome(sobrenome);
		
		String cep = request.getParameter("cep");
		c1.setCEP(cep);
		
		String titulo = request.getParameter("titulo");
		c1.setTitulo(titulo);
		
		String rg = request.getParameter("rg");
		c1.setRG(rg);
		
		PrintWriter out = response.getWriter();
		Banco1 b1 = new Banco1();
		b1.adiciona(c1);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Candidato "  + nome +  "  cadastrado com sucesso");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Candidato" + nome + "\ncadastrado com sucesso");
		
		
		
	}

}
