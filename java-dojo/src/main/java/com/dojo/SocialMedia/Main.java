package com.armando.SocialMedia;
import com.armando.SocialMedia.Controller.SocialMediaController;

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