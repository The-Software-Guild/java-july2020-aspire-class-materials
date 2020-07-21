/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspire.classroster;

import com.aspire.classroster.controller.ClassRosterController;
import com.aspire.classroster.dao.ClassRosterAuditDao;
import com.aspire.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.aspire.classroster.dao.ClassRosterDao;
import com.aspire.classroster.dao.ClassRosterDaoFileImpl;
import com.aspire.classroster.service.ClassRosterServiceLayer;
import com.aspire.classroster.service.ClassRosterServiceLayerImpl;
import com.aspire.classroster.ui.ClassRosterView;
import com.aspire.userio.UserIO;
import com.aspire.userio.UserIOConsoleImpl;

/**
 *
 * @author agalloway
 */
public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao,myAuditDao);
        ClassRosterController controller
                = new ClassRosterController(myService, myView);
        controller.run();
    }

}
