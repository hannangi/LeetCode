/*
Given a 2 Dimensional array that represents a map with 1 representing land and 0 representing water, find the largest island on the map. 
An island is defined as any connected land in the hortizontal and vertical directions (not diagonal)
*/

public class MapProblem {

    static int[][] map = {
                     {0,0,1,0,0,0,0,0,0,0},
                     {0,0,1,1,0,0,0,0,0,0},
                     {0,0,1,1,0,0,0,0,0,0},
                     {0,0,0,1,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0,0}};
    
        public static void main(String[] args) {
            int islandSize = 0;
            for(int i= 0; i < map.length; i ++) {
                for(int j =0; j  < map[i].length; j++) {
                    if(map[i][j] == 1) {
                        int currentSize = findSize(i, j);
                        if(currentSize > islandSize) {
                            islandSize = currentSize;
                        }
                    }
                }
                
            }
            System.out.println(islandSize);
        }
    
        static int findSize(int x, int y) {
            map[x][y] = 0;
            int up = (x - 1) >= 0 && map[x-1][y] == 1 ? findSize(x -1, y): 0;
            int down = (x + 1) < map.length  && map[x+1][y] == 1 ? findSize(x +1, y) : 0;
            int left = (y - 1) >= 0 && map[x][y-1] == 1 ? findSize(x, y-1): 0;
            int right = (y + 1) < map[0].length  && map[x][y+1] == 1 ? findSize(x, y+1): 0;
            return 1 + up + down + left + right;
        }
    }