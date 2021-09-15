package edu.escuelaing.nanosparkweb;
import static edu.escuelaing.nanosparkweb.NanoSpark.*;

/**
 * Class that is responsible for starting the nano spark server and printing the response of the requests made to it
 */
public class NanoSparkWebDemo {

    /**
     * Main Function For The WebApp
     *
     * @param args List of the arguments needed for run the program.
     */
    public static void main (String[] args){
        get("/hello",(req,resp) -> {
            if(req.getValues()==""){
                return "Por favor ingresa un valor. Ejemplo : /Apps/hello?value=JP";
            }
            String response = "";
            try {
                response = getResponse(req.getValues());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return response;
        });
        startServer();
    }


    /**
     * Gets the response of a request to the web server
     * @param values values that the user entered as a parameter
     * @return the html response of a request to the web server
     * @throws Exception If an error occurs obtaining the response
     */
    private static String getResponse(String values) throws Exception {
        return  "<!DOCTYPE html>"
        + "<html>"
        + "<head>"
        + "<meta charset=\"UTF-8\">"
        + "<title>Title of the document</title>\n"
        + "</head>"
        + "<body>"
        + "My Web Site"
        + "</body>"
        + "</html>";
    }
}
