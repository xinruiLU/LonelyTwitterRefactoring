package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Al on 2017-11-03.
 */


public class ImportantLonelyTweet extends LonelyTweet {

    public ImportantLonelyTweet() {
    }

    public ImportantLonelyTweet(String text, Date date) {
        this.tweetDate = date;
        this.tweetBody = text;
    }

    @Override
    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20) {
            return false;
        }

        return true;
    }

    @Override
    public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}
