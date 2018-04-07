/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.managersystem.web.action;

import com.mycompany.managersystem.web.form.EmployeeForm;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author jason email: 765798166@qq.com
 * @date 2018-3-9 18:22:56
 */
public class LoginAction extends ActionSupport {

    private EmployeeForm employeeForm;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public EmployeeForm getEmployeeForm() {
        return employeeForm;
    }

    public void setEmployeeForm(EmployeeForm employeeForm) {
        this.employeeForm = employeeForm;
    }

}
