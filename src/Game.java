import java.util.*;

public class Game
{
    static Random r = new Random();
    static Menu m = new Menu();

    public static void main(String args[]) throws InterruptedException
    {
        Menu start = new Menu();
        Cube.setCube();
        start.welcomeMSG();
        start.startingMenu();
    }

    public static String[] generateNotations(int numOfOperations)
    {
        String operations[] = new String[numOfOperations];
        int ranSite = 0;
        int ranDir = 0;
        String curSite = " ";
        String curDir = " ";
        String curOperation;

        for(int i = 0;i < numOfOperations;i++)
        {
            ranSite = r.nextInt(6);
            ranDir = r.nextInt(2);

            switch(ranSite)
            {
                case 0:
                    curSite = "U";
                    break;

                case 1:
                    curSite = "D";
                    break;

                case 2:
                    curSite = "R";
                    break;

                case 3:
                    curSite = "L";
                    break;

                case 4:
                    curSite = "F";
                    break;

                case 5:
                    curSite = "B";
                    break;
            }

            switch(ranDir)
            {
                case 0:
                    break;

                case 1:
                    curDir = "'";
                    break;

            }
            curOperation = curSite + curDir;
            operations[i] = curOperation;
        }
        return operations;
    }
}
