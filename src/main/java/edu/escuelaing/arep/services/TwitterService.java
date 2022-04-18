package edu.escuelaing.arep.services;

import edu.escuelaing.arep.model.Tweet;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class TwitterService {
    ArrayList<Tweet> database = new ArrayList<Tweet>();

    public void postTweet(Tweet tweet){
        database.add(tweet);
    }

    public ArrayList<Tweet> getTweets(){
        ArrayList<Tweet> finalList = new ArrayList<Tweet>();
        for(int i = 0; i < 10; i++){
            finalList.add(database.get(i));
        }
        return finalList;
    }
}
