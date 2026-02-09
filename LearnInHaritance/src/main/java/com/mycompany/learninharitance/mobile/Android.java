package com.mycompany.learninharitance.mobile;

public class Android extends Mobile {

    private String os;
    private String video;
    private String youtube;

    public Android() {
        
        
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Android{" + "os=" + os + ", video=" + video + ", youtube=" + youtube + '}';
    }

    public Android(String os, String video, String youtube) {
        this.os = os;
        this.video = video;
        this.youtube = youtube;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }
    
    
    

    public Android(String os, String video, String youtube, String call, String massage, String games, String camera, String gallary) {
        super(call, massage, games, camera, gallary);
        this.os = os;
        this.video = video;
        this.youtube = youtube;
    }

}
