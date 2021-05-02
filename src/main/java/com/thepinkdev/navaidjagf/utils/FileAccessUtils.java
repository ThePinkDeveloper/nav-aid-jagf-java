package com.thepinkdev.navaidjagf.utils;

import java.io.File;
import java.nio.file.Files;

import org.springframework.core.io.ClassPathResource;

public class FileAccessUtils {

    public static String readFile(String filepathFromResources) {

        String result = "";

        try {
            File resource = new ClassPathResource(filepathFromResources).getFile();
            result = new String(Files.readAllBytes(resource.toPath()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }
    
}
