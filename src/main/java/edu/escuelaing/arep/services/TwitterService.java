package edu.escuelaing.arep.services;

import edu.escuelaing.arep.model.Tweet;

import java.util.ArrayList;
import com.google.gson.*;

public class TwitterService {
    ArrayList<Tweet> database = new ArrayList<Tweet>();
    int requestSize = 20;

    public JsonArray postTweet(Tweet tweet){
        database.add(tweet);

        return new Gson().toJsonTree(new Tweet[]{tweet}).getAsJsonArray();
    }

    public JsonArray getTweets(){
        ArrayList<Tweet> finalList = new ArrayList<Tweet>();

        if (database.size() == 0){
            return new Gson().toJsonTree(finalList).getAsJsonArray();
        }

        if (database.size() < requestSize){
            int totalTweets = database.size();

            for(int i = 0; i < totalTweets; i++){
                finalList.add(database.get(i));
            }
        } else {
            for(int i = 0; i < requestSize; i++){
                finalList.add(database.get(i));
            }
        }

        JsonArray response = new Gson().toJsonTree(finalList).getAsJsonArray();

        return response;
    }
}
