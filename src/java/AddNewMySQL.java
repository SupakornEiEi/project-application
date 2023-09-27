
import controller.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Pets;

public class AddNewMySQL extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        // get parameters
        String petsName = request.getParameter("petsName");
        String petsType = request.getParameter("petsType");
        String nature[] = request.getParameterValues("nature");
        String leg = request.getParameter("leg");
        int price = Integer.parseInt(request.getParameter("price"));

        // create an instance of Food
        Pets pets = new Pets();
        pets.setName(petsName);
        pets.setType(petsType);
        pets.setNature(nature);
        pets.setLeg(leg);
        pets.setPrice(price);

        // insert into MySQL: table food
        DBConnection dbConnection = new DBConnection();
        if(!dbConnection.insertNewPets(pets)){
            System.out.println(">>> AddNewPetsMySQL ERROR");
        }

        // forward to addNewFoodSuccess.jsp
        HttpSession session = request.getSession();
        session.setAttribute("pets", pets);
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/addNewSuccess.jsp");
        rd.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
