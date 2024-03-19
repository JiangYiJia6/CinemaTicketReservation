public class Cinema {
    private final NotificationService notificationService;
     String title,showtime;
     int salle;
     public Cinema(){
         notificationService =new NotificationService();
     }

     public void Notify(Movie movieType){
         notificationService.notifyUser(movieType);
     }

    public NotificationService getNotificationService(){
         return notificationService;
    }


    public void upload(String title,String showtime,int salle){
        this.title=title;
        this.showtime=showtime;
        this.salle=salle;

    }
}
