package servlets;

import FigureFamily.Dice;
import FigureFamily.Cuboid;
import FigureFamily.Figure;
import FigureFamily.Globe;
import FigureFamily.Pyramide4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet("/FigureFormServlet")
public class FigureFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static String shape;
	
    public FigureFormServlet() {
        super();
    }

	public void init (ServletConfig servletConfig) {
		try {
			super.init(servletConfig);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String[] reqParamsValues = request.getParameterValues("params");
		shape = reqParamsValues[0];
		
		ArrayList<Double> doubleParams = new ArrayList<Double>();
		for (int i = 1; i < reqParamsValues.length; i ++) {
			doubleParams.add(Double.parseDouble(reqParamsValues[i]));
		}
		
		switch (shape) {
		case "dice":
			Figure.figure = new Dice(doubleParams.get(0));
			break;
		case "cuboid":
			Figure.figure = new Cuboid (doubleParams.get(0),doubleParams.get(1),doubleParams.get(2));
			break;
		case "globe":
			Figure.figure = new Globe(doubleParams.get(0));
			break;
		case "pyramide4":
			Figure.figure = new Pyramide4 (doubleParams.get(0),doubleParams.get(1),doubleParams.get(2));
			break;
		}
		
		Figure.figure.giveAllResults(Figure.figure.param1, Figure.figure.param2, Figure.figure.param3);
		request.setAttribute("shape",shape);
		request.setAttribute("floorResult", String.valueOf(Figure.figure.floorResult));
		request.setAttribute("surfaceResult", String.valueOf(Figure.figure.surfaceResult));
		request.setAttribute("volumeResult", String.valueOf(Figure.figure.volumeResult));

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/results.jsp");
		dispatcher.forward(request, response);	
	}
}
