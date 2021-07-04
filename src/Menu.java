import java.util.*;
import java.util.concurrent.*;

public class Menu
{
    Scanner s = new Scanner(System.in);
    public void welcomeMSG() throws InterruptedException
    {
        System.out.println("Welcome to your Virtual 3x3 Rubik's Cube(VC)");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("\nFirst, do you want to get a quick introduction to the programm(VC)?\nType yes or no or esc to exit the programm.\n");
    }

    public void introduction() throws InterruptedException
    {

    }

    public void startingMenu() throws InterruptedException
    {
        boolean end = false;
        while(end == false)
        {
            String curInput = s.next();
            System.out.println("");
            switch(curInput)
            {
                case "yes":
                    TimeUnit.SECONDS.sleep(1);
                    introduction();
                    break;

                case "no":
                    TimeUnit.SECONDS.sleep(1);
                    //System.out.print("\033[H\033[2J");
                    //System.out.flush();
                    System.out.println("Okay sure. So let's get started directly.");
                    TimeUnit.SECONDS.sleep(2);
                    gamemodeMenu();
                    break;

                case "esc":
                    TimeUnit.SECONDS.sleep(1);
                    boolean endExit = false;
                    //System.out.print("\033[H\033[2J");
                    //System.out.flush();
                    System.out.println("Are you sure you want to exit?\nType yes or no.\n");
                    while(endExit == false)
                    {
                        String curInputExit = s.next();
                        switch(curInputExit)
                        {
                            case "yes":
                                TimeUnit.SECONDS.sleep(1);
                                end = true;
                                endExit = true;
                                System.out.print("\n\nThank you for using the VC. Have a great Day");
                                TimeUnit.SECONDS.sleep(2);
                                s.close();
                                break;

                            case "no":
                                TimeUnit.SECONDS.sleep(1);
                                endExit = true;
                                System.out.println("\nOkay sure so let's continue.");
                                TimeUnit.SECONDS.sleep(2);
                                System.out.println("\nDo you want to get a quick introduction to the programm(VC)?\nType yes or no or esc to exit the programm.\n");
                                startingMenu();
                                break;

                            default:
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("\nI think, that I didn't quite get that.\nType yes or no.\n");
                                TimeUnit.SECONDS.sleep(1);
                                break;
                        }
                    }
                    break;

                default:
                    System.out.println("I think, that I didn't quite get that.\nType yes or no.\n");
                    break;
            }
        }
    }

    public void gamemodeMenu() throws InterruptedException
    {
        boolean end = false;
        System.out.println("Before we can start, please type the number of the game mode or special option you want to open.");
        TimeUnit.SECONDS.sleep(3);
        while(end == false)
        {
            System.out.print("\nGame Modes:\n\n\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("1 - Solve yourself\n\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("2 - Let solve\n\n");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("Special Options:\n\n\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("3 - Open Explanation Hub\n\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("4 - Twist Cube\n\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("5 - Show Cube\n\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("6 - Exit Game\n");
            String curInput2 = s.next();
            switch(curInput2)
            {
                case "1":
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    //System.out.print("\033[H\033[2J");
                    //System.out.flush();
                    //Sites.print();
                    break;

                case "6":
                    TimeUnit.SECONDS.sleep(1);
                    boolean endExit = false;
                    //System.out.print("\033[H\033[2J");
                    //System.out.flush();
                    System.out.println("\nAre you sure you want to exit?\nType yes or no.\n");
                    while(endExit == false)
                    {
                        String curInputExit = s.next();
                        switch(curInputExit)
                        {
                            case "yes":
                                TimeUnit.SECONDS.sleep(1);
                                end = true;
                                endExit = true;
                                System.out.print("Thank you for using the VC. Have a great Day");
                                TimeUnit.SECONDS.sleep(2);
                                s.close();
                                break;

                            case "no":
                                TimeUnit.SECONDS.sleep(1);
                                endExit = true;
                                System.out.println("\nOkay sure so let's continue.");
                                break;

                            default:
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("\n\nI think, that I didn't quite get that.\nType yes or no.\n");
                                TimeUnit.SECONDS.sleep(1);
                                break;
                        }
                    }
                    break;

                default:
                    System.out.println("I think, that I didn't quite get that.\nType 1,2,3,4,5 or 6.\n");
                    TimeUnit.SECONDS.sleep(1);
                    break;
            }
        }
    }

    public void explanationHub()
    {

    }
}
