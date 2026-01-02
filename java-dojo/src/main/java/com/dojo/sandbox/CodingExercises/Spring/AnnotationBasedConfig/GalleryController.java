package com.dojo.sandbox.CodingExercises.Spring.AnnotationBasedConfig;

import org.springframework.stereotype.Controller;

@Controller
public class GalleryController {
    private GalleryService galleryService;

    public GalleryController(GalleryService galleryService) {
        this.galleryService = galleryService;
    }
}