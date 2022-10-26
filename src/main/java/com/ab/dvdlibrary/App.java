package com.ab.dvdlibrary;

import com.ab.dvdlibrary.controller.DvdLibraryController;
import com.ab.dvdlibrary.dao.DvdLibraryDaoFileImpl;
import com.ab.dvdlibrary.dao.dvdLibraryDao;
import com.ab.dvdlibrary.ui.DvdLibraryView;
import com.ab.dvdlibrary.ui.UserIO;
import com.ab.dvdlibrary.ui.UserIOConsoleImpl;

/**
 *
 * @author Angela Banks
 */
public class App {

    public static void main(String[] args) {
        /*
        Instantiate the UserIO, DvdLibraryView,dvdLibraryDao,  DvdLibraryController class and call the run method
         */
        UserIO myIo = new UserIOConsoleImpl();
        DvdLibraryView myView = new DvdLibraryView(myIo);
        dvdLibraryDao myDao = new DvdLibraryDaoFileImpl();
        DvdLibraryController controller = new DvdLibraryController(myView, myDao);
        controller.run();

    }
}
