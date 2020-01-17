package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("User1-Millenials");
        User user2 = new YGeneration("User2-YGeneration");
        User user3 = new ZGeneration("User3-ZGeneration");

        //When
        String user1Use = user1.sharePost();
        System.out.println("User1 use: " + user1Use);
        String user2Use = user2.sharePost();
        System.out.println("User2 use: " + user2Use);
        String user3Use = user3.sharePost();
        System.out.println("User3 use: " + user3Use);

        //Then
        Assert.assertEquals("snapchat", user1Use);
        Assert.assertEquals("facebook", user2Use);
        Assert.assertEquals("twitter", user3Use);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("User1-Millenials");

        //When
        String user1Use = user1.sharePost();
        System.out.println("User1 use: " + user1Use);
        user1.setSocialPublisher(new FacebookPublisher());
        user1Use = user1.sharePost();
        System.out.println("User1 use: " + user1Use);

        //Then
        Assert.assertEquals("facebook", user1Use);


    }
}
