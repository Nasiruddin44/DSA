
/*
Job Sequencing Problem
Given an array of jobs where every job has a deadline and profit if the job is finished
before the deadline.It is also given that every job takes a single unit of time, so the
minimum possible deadline for any job is 1.Maximize the total profit if only one job
can be sccheduled at a time.

Job A=4,20
Job B=1,10
Job C=1,40
Job D=1,30
 
 */
import java.util.*;

public class JobSequencingProblem {
    static class job {
        int deadline;
        int profit;
        int id;

    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

    }
}
