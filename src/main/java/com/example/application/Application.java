package com.example.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.example.application.bdd.Initialisation;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
@NpmPackage(value = "lumo-css-framework", version = "^4.0.10")
@NpmPackage(value = "line-awesome", version = "1.3.0")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        //try (Connection con = Commandes.connect("localhost", 5432, "postgres", "postgres", "pass")) {
        //     Commandes.tabledrop(con);
        //     Commandes.table(con);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // LaunchUtil.launchBrowserInDevelopmentMode(SpringApplication.run(Application.class, args));
        Initialisation.init();
    }

}