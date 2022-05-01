package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Rectangullo;

import java.io.IOException;


public class RectanguloControlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public RectanguloControlerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//1 recuperar los valores enviados desde el formulario
		String operacion = request.getParameter("operacion");
		String baseStr = request.getParameter("base");
		String alturaStr = request.getParameter("altura");
		
		//2. convertir al tipo de dato deseado
		int base = Integer.parseInt(baseStr);
		int altura = Integer.parseInt(alturaStr);
		
		
		//3 utilizar las clases modelo para hacer calculos o acciones 
		Rectangullo rectangulo = new Rectangullo(base, altura);
		if(operacion.equalsIgnoreCase("area")) {
			int area = rectangulo.calcularArea();
			request.setAttribute("resultado", area);
			request.setAttribute("operacion", "area");
		}else {
			int perimetro = rectangulo.calcularPerimetro();
			request.setAttribute("resultado", perimetro);
			request.setAttribute("operacion", "perimetro");
		}
		
		//4 delegar una vista para que muestr el o los resultados
		String rutaJSP = "/WEB-INF/jsp/view/rectangulo.jsp";
		
		// pasamos los datos al JSP
		request.getRequestDispatcher(rutaJSP).forward(request, response);
		
		/*response.getWriter()
			.append("Base = "+base+"\n")
			.append("Altura = "+altura+"\n");
			*/
	}

	

}
