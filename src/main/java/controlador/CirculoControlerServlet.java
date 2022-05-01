package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Circulo;

import java.io.IOException;


public class CirculoControlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CirculoControlerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacion = request.getParameter("operacion");
		String diametroStr = request.getParameter("diametro");
		
		double diametro = Double.parseDouble(diametroStr);
		
		Circulo circulo = new Circulo(diametro);
		if(operacion.equalsIgnoreCase("area")) {
			double area = circulo.calcularArea();
			request.setAttribute("resultado", area);
			request.setAttribute("operacion", "area");
		}else {
			double perimetro = circulo.calcularPerimetro();
			request.setAttribute("resultado", perimetro);
			request.setAttribute("operacion", "perimetro");
		}
		
		
		//4 delegar una vista para que muestr el o los resultados
		String rutaJSP = "/WEB-INF/jsp/view/circulo.jsp";
				
		// pasamos los datos al JSP
		request.getRequestDispatcher(rutaJSP).forward(request, response);
	}


}
