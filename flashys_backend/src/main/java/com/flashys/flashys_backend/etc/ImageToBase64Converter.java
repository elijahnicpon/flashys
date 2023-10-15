package com.flashys.flashys_backend.etc;

import java.util.Base64;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ImageToBase64Converter {

    public static List<String> convertImagesToBase64(String folderPath) throws IOException {
        List<String> base64Images = new ArrayList<>();
        File folder = new File(folderPath);

        if (folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().toLowerCase().endsWith(".png")) {
                        byte[] fileContent = Files.readAllBytes(file.toPath());
                        String base64Image = Base64.getEncoder().encodeToString(fileContent);
                        base64Images.add(base64Image);
                    }
                }
            }
        }

        return base64Images;
    }
}