package id.co.nbs.android.materialtab.model;

/**
 * Created by Sidiq on 01/05/2017.
 */

public class Contact {
    private String nameUser;
    private int imgUser;

    public Contact(int imgUser, String nameUser) {
        this.imgUser = imgUser;
        this.nameUser = nameUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getImgUser() {
        return imgUser;
    }

    public void setImgUser(int imgUser) {
        this.imgUser = imgUser;
    }
}
