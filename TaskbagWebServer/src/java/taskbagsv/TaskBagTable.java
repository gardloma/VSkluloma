
package taskbagsv;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.Singleton;
//import taskbagsv.Task;

/**
 *
 * @author luka
 */
@Singleton
public class TaskBagTable {

    private Map<Integer, Task> taskbag = new HashMap<Integer, Task>();
    private int maxkey = 0; // zeigt stets auf den ersten freien Eintrag

    public void addTask(String type, String descr) {
        Task tmp = new Task(type, descr);
        tmp.setID(this.taskbag.size());
        tmp.setDone(false);

        this.taskbag.put(taskbag.size(), tmp);
    }

    public String getNextTaskByType(String type) {
        String result = null;
        int place = findTaskIDByType(type);
        if (place != -1) {
            result = this.taskbag.get(place).getDescr();
            this.taskbag.get(place).setDone(true);
        }
        return result;
    }

    public String readNextTaskByType(String type) {
        String result = null;
        int place = findTaskIDByType(type);
        if (place != -1) {
            result = this.taskbag.get(place).getDescr();
        }
        return result;
    }

    private int findTaskIDByType(String type) {
        for (int i = 0; i < this.taskbag.size(); i++) {
            if (this.taskbag.get(i).getType() == type) {
                if (this.taskbag.get(i).isDone() == false) {
                    return i;
                }
            }
        }
        return -1; // error code
    }
}
