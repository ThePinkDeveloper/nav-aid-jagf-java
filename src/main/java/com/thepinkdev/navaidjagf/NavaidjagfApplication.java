package com.thepinkdev.navaidjagf;

import java.io.File;

import com.thepinkdev.navaidjagf.utils.FileAccessUtils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NavaidjagfApplication {

	public static void main(String[] args) {
		FileAccessUtils.readFile(".apikey");
		SpringApplication.run(NavaidjagfApplication.class, args);
	}

}
