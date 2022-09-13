package com.shashwat.Recursion.Backtracking;

import java.util.Arrays;

public class Maze_allDirection {

    public static void main (String[] args) {


        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

//        movingInAllDirections(" ", maze, 0, 0);
        int[][] path = new int[maze.length][maze[0].length];
        printPath(" ", maze, 0, 0, 1, path);
    }

    static void movingInAllDirections(String p, boolean[][] maze, int row, int col) {       //index starting with (0,0)

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p + " ");
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

//        if (row < maze.length-1 && col < maze[0].length-1) {
//            movingInAllDirections(p + 'D', maze, row + 1, col + 1);
//        }

        if (row > 0) {
            movingInAllDirections(p + 'U', maze, row - 1, col);
        }

        if (col > 0) {
            movingInAllDirections(p + 'L', maze, row, col - 1);
        }

        if (row < maze.length-1) {
            movingInAllDirections(p + 'V', maze, row + 1, col);
        }

        if (col < maze[0].length-1) {
            movingInAllDirections(p + 'R', maze, row, col + 1);
        }

        maze[row][col] = true;
    }

    static void printPath(String p, boolean[][] maze, int row, int col, int steps, int[][] path) {       //index starting with (0,0)

        if (row == maze.length - 1 && col == maze[0].length - 1) {

            path[row][col] = steps;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = steps;

//        if (row < maze.length-1 && col < maze[0].length-1) {
//            printPath(p + 'D', maze, row + 1, col + 1, steps + 1, path);
//        }

        if (row < maze.length-1) {
            printPath(p + 'V', maze, row + 1, col, steps + 1, path);
        }

        if (col < maze[0].length-1) {
            printPath(p + 'R', maze, row, col + 1, steps + 1, path);
        }

        if (row > 0) {
            printPath(p + 'U', maze, row - 1, col, steps + 1, path);
        }

        if (col > 0) {
            printPath(p + 'L', maze, row, col - 1, steps + 1, path);
        }

        maze[row][col] = true;
        path[row][col] = 0;

    }
}
