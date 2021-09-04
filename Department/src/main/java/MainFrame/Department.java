/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFrame;

import WorkingClass.Admin_Department;
import WorkingClass.Hr_Department;
import WorkingClass.Tech_Department;

/**
 *
 * @author toast
 */
public class Department {
    private static Admin_Department ad;
    private static Hr_Department hr;
    private static Tech_Department td;
    public static void main(String args[])
    {
      ad=new Admin_Department(); 
        System.out.println("Welcome to "+ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday()+"\n");
        
        hr=new Hr_Department();
        System.out.println("Welcome to "+hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday()+"\n");
        
        td=new Tech_Department();
        System.out.println("Welcome to "+td.departmentName());
        System.out.println(td.getTodaysWork());
        System.out.println(td.getWorkDeadline());
        System.out.println(td.getTechStackInformation());
        System.out.println(td.isTodayAHoliday());
        
        
    }
    
}
