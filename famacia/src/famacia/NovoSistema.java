package famacia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novosistema")
public class NovoSistema extends HttpServlet{
	protected void Service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String nome = request.getParameter("nome").toString();
		
		PrintWriter out = response.getWriter();
		
		BancoSistema b1 = new BancoSistema();
		
		Medicamento m1 = b1.getMedicamento(nome);
		b1.adiciona(m1);
		
		out.println("<html>");
		out.println("<body>");
		out.println("O medicamento: "  + m1.getNome() +  " Serve para:" + m1.getSintomaIndicado() + "Custa valor: " + m1.getValorMedicamento());
		out.println("</body>");
		out.println("</html>");
		
	
  }
}
