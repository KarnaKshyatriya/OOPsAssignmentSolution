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
public class Hr_Department extends Super_Department {

    /**
     *
     * @return
     */
    @Override
    public String departmentName() {
        return "Hr Department ";
    }

    /**
     *
     * @return
     */
    @Override
    public String getTodaysWork() {
        return "Fill today’s worksheet and mark your attendance";
    }

    /**
     *
     * @return
     */
    @Override
    public String getWorkDeadline() {
        return "Complete by EOD ";
    }

    public String doActivity() {
        return "team Lunch";
    }
}
