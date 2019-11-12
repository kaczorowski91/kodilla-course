package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPost;
    private Statistics statistics;

    public int getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public Statistics getStatistics() {
        return statistics;
    }


    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }


    public void calculateAdvStatistics(Statistics statistics) {

        if (statistics.usersNames().size() == 0) {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
            averageCommentsPerPost = 0;
        } else {

            if (statistics.postsCount() != 0) {
                averageCommentsPerPost = statistics.commentsCount() / statistics.usersNames().size();
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
        System.out.println("Avarage post per user " + averagePostsPerUser);
        System.out.println("Avarage comments per user " + averageCommentsPerUser);
        System.out.println("Avarage comments per post " + averageCommentsPerPost);
    }

}

