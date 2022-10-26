package com.ab.dvdlibrary.dto;

import java.util.Date;

public class DvD {
    private String title;
    private String ReleaseDate;
    private String MPAA;
    private String DirectorsName;
    private String Studio;
    private String UserRating;

    public DvD(String title) {
        this.title = title;
    }
    //implement
     //public void setTitle(String title) {
    //this.title = title;
    //}

    public String getTitle() {
        return title;
    }

    public void setReleaseDate(String ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setMPAA(String MPAA) {
        this.MPAA = MPAA;
    }

    public String getMPAA() {
        return MPAA;
    }

    public void setDirectorsName(String directorsName) {
        DirectorsName = directorsName;
    }

    public String getDirectorsName() {
        return DirectorsName;
    }

    public void setStudio(String studio) {
        Studio = studio;
    }

    public String getStudio() {
        return Studio;
    }

    public void setUserRating(String userRating) {
        UserRating = userRating;
    }

    public String getUserRating() {
        return UserRating;
    }
}
