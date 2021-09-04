/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingClass;

import Model.Super_Department;

/**
 *
 * @author toast
 */
public class Admin_Department extends Super_Department {

    @Override
    public String departmentName() {
        return "Admin Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    /**
     *
     * @return
     */
    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

}
