package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.mockito.Mockito;

import java.util.ArrayList;

public class ForumTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testZeroPost() {
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        ArrayList<String> listUserNames = new ArrayList<String>();
        listUserNames.add("User ");
        Mockito.when(statisticsMock.usersNames()).thenReturn(listUserNames);
        Mockito.when(statisticsMock.postsCount()).thenReturn(0);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(10);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(10, forumStatistics.getAverageCommentsPerUser());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testOneThousandPost() {
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        ArrayList<String> listUserNames = new ArrayList<String>();
        listUserNames.add("User ");
        Mockito.when(statisticsMock.usersNames()).thenReturn(listUserNames);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(10000);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(1000, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(10000, forumStatistics.getAverageCommentsPerUser());
        Assert.assertEquals(10, forumStatistics.getAverageCommentsPerPost());


    }

    @Test
    public void testZeroComment() {
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        ArrayList<String> listUserNames = new ArrayList<String>();
        listUserNames.add("User ");
        Mockito.when(statisticsMock.usersNames()).thenReturn(listUserNames);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(1000, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        ArrayList<String> listUserNames = new ArrayList<String>();
        listUserNames.add("User ");
        Mockito.when(statisticsMock.usersNames()).thenReturn(listUserNames);
        Mockito.when(statisticsMock.postsCount()).thenReturn(5);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(10);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(5, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(10, forumStatistics.getAverageCommentsPerUser());
        Assert.assertEquals(2, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testMorePostsThanComments() {
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        ArrayList<String> listUserNames = new ArrayList<String>();
        listUserNames.add("User ");
        Mockito.when(statisticsMock.usersNames()).thenReturn(listUserNames);
        Mockito.when(statisticsMock.postsCount()).thenReturn(10);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(5);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(10, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(5, forumStatistics.getAverageCommentsPerUser());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }


    @Test
    public void testZeroUsers() {
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        ArrayList<String> listUserNames = new ArrayList<String>();
        Mockito.when(statisticsMock.usersNames()).thenReturn(listUserNames);
        Mockito.when(statisticsMock.postsCount()).thenReturn(0);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testOneHundredUsers() {
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        ArrayList<String> listUserNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            listUserNames.add("User " + (i + 1));
        }
        Mockito.when(statisticsMock.usersNames()).thenReturn(listUserNames);
        Mockito.when(statisticsMock.postsCount()).thenReturn(10);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assert.assertEquals(10, forumStatistics.getAverageCommentsPerUser());
        Assert.assertEquals(100, forumStatistics.getAverageCommentsPerPost());
    }
}
