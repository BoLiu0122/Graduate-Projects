/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue sendWorkQueue;
    private WorkQueue receiveWorkQueue;

    public UserAccount() {
        sendWorkQueue = new WorkQueue();
        receiveWorkQueue = new WorkQueue();
    }

    public WorkQueue getReceiveWorkQueue() {
        return receiveWorkQueue;
    }

    public void setReceiveWorkQueue(WorkQueue receiveWorkQueue) {
        this.receiveWorkQueue = receiveWorkQueue;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getSendWorkQueue() {
        return sendWorkQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}