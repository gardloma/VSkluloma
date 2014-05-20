/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taskbagclient1;

/**
 *
 * @author luka
 */
public class TaskbagClient1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(putTask("garten", "rasenmaehen"));
        
    }

    private static String putTask(java.lang.String type, java.lang.String description) {
        taskbagclient1.Taskbag_Service service = new taskbagclient1.Taskbag_Service();
        taskbagclient1.Taskbag port = service.getTaskbagPort();
        return port.putTask(type, description);
    }
}
