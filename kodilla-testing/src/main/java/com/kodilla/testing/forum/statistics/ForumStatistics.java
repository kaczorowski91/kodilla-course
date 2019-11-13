package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPost;


    public int getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public ForumStatistics(Statistics statistics) {
    }

    public void calculateAdvStatistics(Statistics statistics) {


        if (statistics.usersNames().isEmpty()) {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
            averageCommentsPerPost = 0;
        } else {

            averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();

            if (statistics.postsCount() != 0) {
                averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
            } else {
                averageCommentsPerPost = 0;
            }
            if (statistics.commentsCount() != 0) {
                averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
            } else {
                averageCommentsPerUser = 0;
            }
        }
    }

    public void showStatistics() {
        System.out.println("Average post per user " + averagePostsPerUser);
        System.out.println("Average comments per user " + averageCommentsPerUser);
        System.out.println("Average comments per post " + averageCommentsPerPost);
    }

}

