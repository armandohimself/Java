package com.dojo.SocialMedia;
import com.dojo.SocialMedia.Controller.SocialMediaController;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        
        // Entry into app - start our API
        SocialMediaController controller = new SocialMediaController();
        Javalin app = controller.startAPI();
        app.start(9090);
    }

    public static String sayHello() {
        return "Hello, Maven!";
    }
}