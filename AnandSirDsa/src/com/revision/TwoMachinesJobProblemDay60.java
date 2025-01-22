package com.revision;

import java.util.Scanner;

public class TwoMachinesJobProblemDay60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of jobs
        System.out.print("Enter the number of jobs: ");
        int n = scanner.nextInt();

        // Input: Job times
        int[] jobs = new int[n];
        System.out.println("Enter the time taken for each job:");
        for (int i = 0; i < n; i++) {
            jobs[i] = scanner.nextInt();
        }

        // Calculate the minimum makespan
        int result = findMinMakespan(jobs);

        // Output the result
        System.out.println("The minimum makespan is: " + result);

        scanner.close();
    }

    private static int findMinMakespan(int[] jobs) {
        int n = jobs.length;

        // Calculate total time of all jobs
        int totalTime = 0;
        for (int job : jobs) {
            totalTime += job;
        }

        // DP array to store possible times
        boolean[] dp = new boolean[totalTime + 1];
        dp[0] = true; // Base case

        // Fill DP array
        for (int job : jobs) {
            for (int t = totalTime; t >= job; t--) {
                dp[t] |= dp[t - job];
            }
        }

        // Find the minimum makespan
        int minMakespan = Integer.MAX_VALUE;
        for (int t = 0; t <= totalTime / 2; t++) {
            if (dp[t]) {
                int s1 = t;
                int s2 = totalTime - t;
                minMakespan = Math.min(minMakespan, Math.max(s1, s2));
            }
        }

        return minMakespan;
    }
}

