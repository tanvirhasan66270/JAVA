

package com.mycompany.learninharitance;

import com.mycompany.learninharitance.mobile.Android;


public class LearnInHaritance {

    public static void main(String[] args) {
        Android mob=new Android();
        
        
        mob.setOs("Android");
        mob.setVideo("video");
        mob.setYoutube("movie");
        
        
        mob.setCall("call");
     mob.setCamera("cam");
     mob.setGallary("sobin");     
     mob.setGames("game");
     
     
     
        System.out.println("ans: "+mob);
    }
}
