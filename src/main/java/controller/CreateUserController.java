package controller;

import db.DataBase;
import http.HttpRequest;
import http.HttpResponse;
import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateUserController implements controller{
    private static final Logger log = LoggerFactory.getLogger(controller.class);

    @Override
    public void service(HttpRequest request, HttpResponse response) {
        User user = new User(
                request.getParameter("UserId"), request.getParameter("password"),
                request.getParameter("name"), request.getParameter("email"));
        log.debug("user : {}", user);
        DataBase.addUser(user);
        response.sendRedirect("/index.html");
    }
}
