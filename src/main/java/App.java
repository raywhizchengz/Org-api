//import static spark.Spark.port;
import  com.google.gson.*;

import DB.DB;
import dao.*;
import exceptions.ApiException;
import models.*;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {


    public static void main(String[] args) {

//        ProcessBuilder process = new ProcessBuilder();
//        Integer port;
//
//        if (process.environment().get("PORT") != null) {
//            port = Integer.parseInt(process.environment().get("PORT"));
//        }else {
//            port = 4567;
//        }
//        port(port);

        Sql2oUserDao userDao = new Sql2oUserDao(DB.sql2o);
        Sql2oNewsDao newsDao;
        Gson gson = new Gson();


        //create
        post("/users/new","application/json", (req, res) -> {
            User user = gson.fromJson(req.body(), User.class);
            userDao.add(user);
            res.status();
            return gson.toJson(user);
        });


        //READ
        get("/users", "application/json",(req, res) -> {
           return gson.toJson(userDao.getAll());
        });

        exception(ApiException.class, (exc, req, res) ->{
            ApiException err = (ApiException) exc;
            Map<String, Object> jsonMap = new HashMap<>();
            jsonMap.put("status", err.getStatusCode());
            jsonMap.put("errorMessage", err.getMessage());
            res.type("application/json");
            res.status(err.getStatusCode());
            res.body(gson.toJson(jsonMap));
        });

        //FILTERS
        after((req, res) -> {
            res.type("application/json");
        });


    }
}
