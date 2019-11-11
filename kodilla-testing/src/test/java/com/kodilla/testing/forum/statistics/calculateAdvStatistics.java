package com.kodilla.testing.forum.statistics;
import org.junit.*;
import org.mockito.Mockito;


import java.util.ArrayList;

public class calculateAdvStatistics {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
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
    public void zeroUsers(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList <String>();
        Mockito.when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate(statisticsMock);
        //When
        int numberOfUsers = listOfUsers.size();
        //Then
        Assert.assertEquals(0, numberOfUsers);
    }

    @Test
    public void OneHundredUsers(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList <String>();
        for (int i=0; i<100; i++)
        {listOfUsers.add("User "+i); }
        Mockito.when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate(statisticsMock);
        //When
        int numberOfUsers = listOfUsers.size();
        //Then
        Assert.assertEquals(100, numberOfUsers);
    }

    @Test
    public void zeroPostCount(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        int postsCount=0;
        Mockito.when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate(statisticsMock);
        //When
        int zeroPostCount = postsCount;
        //Then
        Assert.assertEquals(0, zeroPostCount);
    }

    @Test
    public void OneThousandPostCount(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        int postsCount=100;
        Mockito.when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate(statisticsMock);
        //When
        int OneThousandPostCount = postsCount;
        //Then
        Assert.assertEquals(100, OneThousandPostCount);
    }

    @Test
    public void zeroCommentsCount(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        int commentsCount=0;
        Mockito.when(statisticsMock.postsCount()).thenReturn(commentsCount);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate(statisticsMock);
        //When
        int zeroCommentsCount = commentsCount;
        //Then
        Assert.assertEquals(0, zeroCommentsCount);
    }

    @Test
    public void MorePoststhanCommenths(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        int commentsCount=2;
        int postsCount=5;
        Mockito.when(statisticsMock.postsCount()).thenReturn(commentsCount);
        Mockito.when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate(statisticsMock);
        //When
        int LessCommenthsCount = commentsCount;
        int MorePostsCount = postsCount;
        //Then
        Assert.assertTrue(MorePostsCount>LessCommenthsCount);
    }

    @Test
    public void moreCommentsthanPosts(){
        //Given
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        int commentsCount=5;
        int postsCount=3;
        Mockito.when(statisticsMock.postsCount()).thenReturn(commentsCount);
        Mockito.when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate(statisticsMock);
        //When
        int MoreCommenthsCount = commentsCount;
        int LessPostsCount = postsCount;
        //Then
        Assert.assertTrue(MoreCommenthsCount>LessPostsCount);
    }



















}
