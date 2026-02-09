package com.mycompany.learninharitance.mobile;

public class Iphone extends Mobile{
    
    private String faceCall;
    private String imassage;
    private String os;

    public Iphone() {
    }

    @Override
    public String toString() {
        return "Iphone{" + "faceCall=" + faceCall + ", imassage=" + imassage + ", os=" + os + '}';
    }
   
    public Iphone(String faceCall, String imassage, String os) {
        this.faceCall = faceCall;
        this.imassage = imassage;
        this.os = os;
    }

    public String getFaceCall() {
        return faceCall;
    }

    public void setFaceCall(String faceCall) {
        this.faceCall = faceCall;
    }

    public String getImassage() {
        return imassage;
    }

    public void setImassage(String imassage) {
        this.imassage = imassage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    
    
    

    public Iphone(String faceCall, String imassage, String os, String call, String massage, String games, String camera, String gallary) {
        super(call, massage, games, camera, gallary);
        this.faceCall = faceCall;
        this.imassage = imassage;
        this.os = os;
    }
    
    

    
    
    

}
