/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taskbagsv;

/**
 *
 * @author luka
 */
public class Task {
    private int ID;
    private String type;
    private String descr;
    private boolean done;

    public Task(String type, String descr) {
        this.type = type;
        this.descr = descr;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    
    
}
