package com.shashwat.Recursion;

import java.util.*;

public class Maze {

    public static void main (String[] args) {

//        System.out.println("No. of ways to reach (0,0) are: " + countWays(4,4));
//        System.out.println("Possible of ways to reach (0,0) are: " + possibleWays(" ", 3,3));
//        System.out.println("Possible of ways to reach (0,0) are: " + diagonalIncluded(" ", 3,3));

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathWithObstacles(" ", maze, 0, 0);

    }


    static void pathWithObstacles(String p, boolean[][] maze, int row, int col) {       //index starting with (0,0)

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p + " ");
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        if (row < maze.length-1 && col < maze[0].length-1) {
            pathWithObstacles(p + 'D', maze, row + 1, col + 1);
        }

        if (row < maze.length-1) {
            pathWithObstacles(p + 'V', maze, row + 1, col);
        }

        if (col < maze[0].length-1) {
            pathWithObstacles(p + 'H', maze, row, col + 1);
        }
    }

    static List<String> possibleWays(String p, int r, int c) {

        if (r == 1 && c == 1) {
          List<String> list = new ArrayList<>();
          list.add(p);
          return list;
        }

        List<String> ans = new ArrayList<>();

        if (r > 1) {
            ans.addAll(possibleWays(p + 'D', r-1, c));
        }

        if (c > 1) {
            ans.addAll(possibleWays(p + 'R', r, c-1));
        }
        return ans;
    }

    static List<String> diagonalIncluded(String p, int r, int c) {

        if (r==1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();

        if (r > 1 && c > 1) {
            ans.addAll(diagonalIncluded(p + 'D', r-1, c-1));
        }

        if (r > 1) {
            ans.addAll(diagonalIncluded(p + 'V', r-1, c));
        }

        if (c > 1) {
            ans.addAll(diagonalIncluded(p + 'H', r, c-1));
        }
        return ans;
    }

    static int countWays(int r, int c) {

        if (r == 1 || c == 1)
            return 1;

        int left = countWays(r-1, c);
        int right = countWays(r, c-1);

        return left + right;
    }
}
