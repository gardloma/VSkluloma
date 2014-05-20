package taskbagsv;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "Taskbag")
@Stateless()
public class Taskbag {
    @EJB
    private TaskBagTable taskBagTable;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "putTask")
    public String putTask(@WebParam(name = "type") String type, @WebParam(name = "description") String description) {
        this.taskBagTable.addTask(type, description);        
        return "Task added";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getTask")
    public String getTask(@WebParam(name = "type") String type) {
        String result = null;
        while (result == null) { // block serverside
            result = this.taskBagTable.getNextTaskByType(type);
        }
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readTask")
    public String readTask(@WebParam(name = "type") String type) {
        String result = null;
        while (result == null) { // block serverside
            result = this.taskBagTable.getNextTaskByType(type);
        }
        return result;
    }
}
