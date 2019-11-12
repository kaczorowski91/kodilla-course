package com.kodilla.testing.forum.statistics;

public class StatisticsCalculate {

    int avaragePostsPerUser;
    int avarageCommentsPerUser;
    int avarageCommentsPerPost;
    Statistics statistics;

    public StatisticsCalculate(Statistics statistics){
        this.statistics=statistics;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size() != 0) {
            avaragePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        } else {
            avaragePostsPerUser = 0;
        }
        if (statistics.postsCount() != 0) {
            avarageCommentsPerPost = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            avarageCommentsPerPost = 0;
        }
        if (statistics.commentsCount() != 0) {
            avarageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            avarageCommentsPerUser = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Avarage post per user " + avaragePostsPerUser);
        System.out.println("Avarage comments per user " + avarageCommentsPerUser);
        System.out.println("Avarage comments per post " + avarageCommentsPerPost);
    }

}
