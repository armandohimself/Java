package com.armando.sandbox.CodingExercises.Spring.AnnotationBasedConfig;

import org.springframework.stereotype.Service;

@Service
public class GalleryService {
    private GalleryRepository galleryRepository;

    public void setGalleryRepository(GalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }
}