package com.adamoubello.services;

import org.springframework.web.multipart.MultipartFile;


public interface ImageService {
    void saveImageFile(String recipeId, MultipartFile file);
}
