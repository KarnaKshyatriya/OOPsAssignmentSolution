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
public class Tech_Department extends Super_Department {

    @Override
    public String departmentName() {
        return "Tech Department ";
    }

    /**
     *
     * @return
     */
    @Override
    public String getTodaysWork() {
        return "Complete coding of module 1";
    }

    /**
     *
     * @return
     */
    @Override
    public String getWorkDeadline() {
        return "Complete by EOD ";
    }

    public String getTechStackInformation() {
        return "core Java";
    }

}
