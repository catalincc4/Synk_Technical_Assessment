import java.util.Arrays;

public class Main {

    static char[][] encryptText(String s){
        String sWithoutSpaces = s.replaceAll(" ", "");
        double sqrtLength = Math.sqrt(sWithoutSpaces.length());
        int rows = (int) Math.floor(sqrtLength);
        int cols = (int) Math.ceil(sqrtLength);

        //check if it actually fit in the grid
        rows = rows*cols < sWithoutSpaces.length() ? rows + 1 : rows;
        char[][] grid = new char[rows][cols];
        // fill the grid line by line
        for(int i = 0; i < rows; i++){
            // add the line to the grid, I also include in  this part to check if we reach the last line,
            // such that to not cross the boundary of the string length
            grid[i] = sWithoutSpaces.substring(i*cols, i+1 == rows ? sWithoutSpaces.length() : (i+1)*cols).toCharArray();
            // use this line if you want to run the code and it's actually run
            System.out.println(i + ". "+ Arrays.toString(grid[i]));
        }
        return grid;
    }

    public static void main(String[] args){
        String s = "if man was meant to stay on the round god would have given us roots";
        char[][] grid = encryptText(s);

    }
}
