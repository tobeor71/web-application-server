package webserver;

import java.util.HashMap;
import java.util.Map;

import controller.Controller;
import controller.CreateUserController;

public class RequestMapping {
    private static Map<String, Controller> controllers = new HashMap<String, Controller>();

    static{
        controllers.put("/user/create", new CreateUserController());
    }
}
