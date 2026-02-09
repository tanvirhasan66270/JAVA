
package com.mycompany.learninharitance.mobile;


public class Mobile {
  
    private String call;
    private  String massage;
    private  String games;
    private  String camera;
    private String gallary;

    public Mobile() {
    }

    public Mobile(String call, String massage, String games, String camera, String gallary) {
        this.call = call;
        this.massage = massage;
        this.games = games;
        this.camera = camera;
        this.gallary = gallary;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getGallary() {
        return gallary;
    }

    public void setGallary(String gallary) {
        this.gallary = gallary;
    }

    @Override
    public String toString() {
        return "Mobile{" + "call=" + call + ", massage=" + massage + ", games=" + games + ", camera=" + camera + ", gallary=" + gallary + '}';
    }
    
    
      
}
