package com.example.application.views.helloworld;

import java.sql.*;

import com.example.application.bdd.Commandes;
// |||| unused imports
// import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
// |||| import utilisés que pour le menu déroulant
// import com.vaadin.flow.router.PageTitle;
// import com.vaadin.flow.router.RouteAlias;
// |||| import pour le menu
// import com.example.application.views.MainLayout;

// |||| route du menu
// @PageTitle("Hello World")
// @Route(value = "hello-world", layout = MainLayout.class)
// @RouteAlias(value = "", layout = MainLayout.class)
@Route("")
public class HelloWorldView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public HelloWorldView() {
        setMargin(true);
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        add(name, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
            try (Connection con = Commandes.connect("localhost", 5432, "postgres", "postgres", "pass")) {
                // java.sql.Date date = java.sql.Date.valueOf("2002-08-02");
                // String nom = name.getValue();
                // Commandes.createPerson(con, nom, date);
                // Commandes.afficheToutesPersonnes(con);
            } catch (Exception err) {
                System.out.println(err);
            }
        });
    }

}
