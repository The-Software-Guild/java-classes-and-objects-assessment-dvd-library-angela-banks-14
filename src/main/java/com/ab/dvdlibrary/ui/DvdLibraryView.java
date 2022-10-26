package com.ab.dvdlibrary.ui;

import com.ab.dvdlibrary.dto.DvD;
import java.util.List;

public class DvdLibraryView {

    private UserIO io;

    public DvdLibraryView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        //implement
        io.print("Main Menu:");
        io.print("1- List DVD collection");
        io.print("2- Add new DVD(s) to collection");
        io.print("3- View a specific DVD in collection");
        io.print("4- Delete DVD(s) from collection");
        io.print("5- Edit a DVD(s) from collection");
        io.print("6- Exit");

        return io.readInt("Please select from menu", 1, 6);
    }
    public int printEditMenuAndGetSelection() {
        //implement
        io.print("Edit DVD Menu");
        io.print("1- Edit title");
        io.print("2- Edit release date");
        io.print("3- Edit MPAA rating");
        io.print("4- Edit Director's name");
        io.print("5- Edit Studio name");
        io.print("6- Edit user rating");

        return io.readInt("Please select from menu", 1, 6);
    }
    /*
     This method prompts the user for dvd ID, First Name, Last Name, and Cohort,
    gathers this information, creates a new dvd object, and returns it to the caller.
     */
    public DvD getNewDvDInfo() {
        //implement
        String title = io.readString("Please enter DVD title:");
        String ReleaseDate = io.readString("Please enter release date:");
        String MPAA = io.readString("Please enter MPAA rating:");
        String DirectorsName = io.readString("Please enter name of director:");
        String Studio = io.readString("Please enter name of studio:");
        String UserRating = io.readString("Please enter your rating:");

        DvD currentDvd = new DvD(title);
        currentDvd.setReleaseDate(ReleaseDate);
        currentDvd.setMPAA(MPAA);
        currentDvd.setDirectorsName(DirectorsName);
        currentDvd.setStudio(Studio);
        currentDvd.setUserRating(UserRating);

        return currentDvd;
    }

    /*
    This method simply displays a banner or heading to the UI indicating that
    the next interactions on the screen will be for creating a new dvd
     */
    public void displayCreateDvDBanner() {
        io.print("=== Create DvD ===");
    }

    /*
    The second method displays a message that the new dvd was successfully created
    and waits for the user to hit Enter to continue
     */
    public void displayCreateSuccessBanner() {
        io.readString(
                "DvD successfully created.  Please hit enter to continue");
    }

    /*
    A method that takes a list of DVD objects as a parameter and displays the information for each Dvd to the screen.
     */
    public void displayDvdList(List<DvD> dvdList) {
        //implement
        for (DvD currentDvd : dvdList) {
            String dvdInfo = String.format("%s : %s : %s : %s : %s : %s",
                    currentDvd.getTitle(),
                    currentDvd.getReleaseDate(),
                    currentDvd.getMPAA(),
                    currentDvd.getDirectorsName(),
                    currentDvd.getStudio(),
                    currentDvd.getUserRating());
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All Dvds ===");
    }

    /*
    Shows the dvd banner
     */
    public void displayDisplayDvdBanner() {
        io.print("=== Display Dvd ===");
    }

    /*
    Get the dvd title to display information
     */
    public String getDvdTitleChoice() {
        return io.readString("Please enter the dvd title.");
    }

    /*
    Displays the dvd information
     */
    public void displayDvd(DvD dvd) {
        //implement
        if (dvd != null) {
            io.print(dvd.getTitle());
            io.print(dvd.getReleaseDate());
            io.print(dvd.getMPAA());
            io.print(dvd.getDirectorsName());
            io.print(dvd.getStudio());
            io.print(dvd.getUserRating());
            io.print("");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveDvdBanner() {
        io.print("=== Remove Dvd ===");
    }

    public void displayRemoveResult(DvD dvdRecord) {
        //implement
        if (dvdRecord != null) {
            io.print("DVD successfully removed.");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    public void displayEditDvdBanner() {
        io.print("=== Edit DVD ===");
    }

    public void displayEditDvdSuccess() {
        io.readString(
                "DVD successfully Edited.  Please hit enter to continue");
    }

    public void displayEditReleaseDateBanner() {
        io.print("=== Edit DVD Release Date ===");
    }

    public void displayEditMpaaBanner() {
        io.print("=== Edit DVD MPAA rating ===");
    }

    public void displayEditDirectorNameBanner() {
        io.print("=== Edit DVD Director's Name ===");
    }

    public void displayEditStudio() {
        io.print("=== Edit DVD Studio ===");
    }

    public void displayEditUserRating() {
        io.print("=== Edit DVD User Rating ===");
    }

    public String getNewReleaseDate() {
        return io.readString("Please enter new release date.");
    }

    public String getNewMpaaRating() {
        return io.readString("Please enter new MPAA rating.");
    }

    public String getNewDirectorName() {
        return io.readString("Please enter new director's name.");
    }

    public String getNewUserRating() {
        return io.readString("Please enter new user rating.");
    }

    public String getNewStudio() {
        return io.readString("Please enter new studio.");
    }

    public void displayNullDVD() {
        io.print("No such DVD.");
        io.readString("Please hit enter to continue.");
    }
}

