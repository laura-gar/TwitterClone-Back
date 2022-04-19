package edu.escuelaing.arep;

import com.google.gson.Gson;
import edu.escuelaing.arep.model.Tweet;
import edu.escuelaing.arep.services.TwitterService;

import java.util.ArrayList;

import static spark.Spark.*;


public class App {
    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        TwitterService twitterService = new TwitterService();

        port(getPort());

        // Allow CORS
        options("/*",
                (request, response) -> {
                    String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
                    if (accessControlRequestHeaders != null) {
                        response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
                    }
                    String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
                    if (accessControlRequestMethod != null) {
                        response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
                    }
                    return "OK";
                });
        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

        path("/api/v1", () -> {
            path("/feed", () -> {
                get("", (req, res) -> {
                    res.type("application/json");
                    return twitterService.getTweets();
                });
            });

            post("/post", (req, res) -> {
                res.type("application/json");
                Tweet tweet = (new Gson()).fromJson(req.body(), Tweet.class);

                return twitterService.postTweet(tweet);
            });
        });






    }


    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}
