/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taskbagclient2;

/**
 *
 * @author luka
 */
public class TaskbagClient2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println(getTask("garten"));
    }

    private static String getTask(java.lang.String type) {
        taskbagclient2.Taskbag_Service service = new taskbagclient2.Taskbag_Service();
        taskbagclient2.Taskbag port = service.getTaskbagPort();
        return port.getTask(type);
    }
}
