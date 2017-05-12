package id.co.nbs.android.materialtab.model;

/**
 * Created by Sidiq on 30/04/2017.
 */

public class WhatsAppTest {
    private int idUser;
    private int imgUser;
    private int imgStatus;
    private String nameUser;
    private String messageUser;
    private String timeMessageUser;
    private String notificationMessageUser;

    public WhatsAppTest(int imgUser, int imgStatus, String nameUser, String messageUser, String timeMessageUser, String notificationMessageUser) {
        this.imgUser = imgUser;
        this.imgStatus = imgStatus;
        this.nameUser = nameUser;
        this.messageUser = messageUser;
        this.timeMessageUser = timeMessageUser;
        this.notificationMessageUser = notificationMessageUser;
    }

    public WhatsAppTest(int idUser, int imgUser, int imgStatus, String nameUser, String messageUser, String timeMessageUser, String notificationMessageUser) {
        this.idUser = idUser;
        this.imgUser = imgUser;
        this.imgStatus = imgStatus;
        this.nameUser = nameUser;
        this.messageUser = messageUser;
        this.timeMessageUser = timeMessageUser;
        this.notificationMessageUser = notificationMessageUser;
    }

    public int getImgStatus() {
        return imgStatus;
    }

    public void setImgStatus(int imgStatus) {
        this.imgStatus = imgStatus;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getImgUser() {
        return imgUser;
    }

    public void setImgUser(int imgUser) {
        this.imgUser = imgUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public String getTimeMessageUser() {
        return timeMessageUser;
    }

    public void setTimeMessageUser(String timeMessageUser) {
        this.timeMessageUser = timeMessageUser;
    }

    public String getNotificationMessageUser() {
        return notificationMessageUser;
    }

    public void setNotificationMessageUser(String notificationMessageUser) {
        this.notificationMessageUser = notificationMessageUser;
    }
}
