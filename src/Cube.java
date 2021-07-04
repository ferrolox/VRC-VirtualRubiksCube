import java.util.*;

public class Cube
{
    private static String cube[][] =
            {
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},
                    {" "," "," "," "," "," "," "," "," "},

            };
    private static String staCube[][] =
            {
                    {" "," "," ","RBY","RY","RYG"," "," "," "},
                    {" "," "," ","RB","R","RG"," "," "," "},
                    {" "," "," ","RBW","RW","RWG"," "," "," "},
                    {"BYR","BR","BWR","WRB","WR","WGR","GRW","GR","GRY"},
                    {"BY","B","BW","WB","W","WG","GW","G","GY"},
                    {"BYO","BO","BOW","WBO","WO","WOG","GWO","GO","GOY"},
                    {" "," "," ","OWB","OW","OGW"," "," "," "},
                    {" "," "," ","OB","O","OG"," "," "," "},
                    {" "," "," ","OBY","OY","OYG"," "," "," "},
                    {" "," "," ","YOB","YO","YGO"," "," "," "},
                    {" "," "," ","RB","R","RG"," "," "," "},
                    {" "," "," ","YRB","YR","YGR"," "," "," "},

            };

    // {      E K E      } {           RBY RY RYG           }
    // {      K M K      } {           RB  R  RG            }
    // {      E K E      } {           RBW RW RWG           }
    // {E K E E K E E K E} {BYR BR BWR WRB WR WGR GRW GR GRY}
    // {K M K K M K K M K} {BY  B  BW  WB  W  WG  GW  G  GY }
    // {E K E E K E E K E} {BYO BO BOW WBO WO WOG GWO GO GOY}
    // {      E,K,E      } {           OWB OW OGW           }
    // {      K,M,K      } {           OB  O  OG            }
    // {      E,K,E      } {           OBY OY OYG           }
    // {      E,K,E      } {           YOB YO YGO           }
    // {      K,M,K      } {           YB  Y  YG            }
    // {      E,K,E      } {           YRB YR YGR           }

    public static void exeMove(String operation, boolean twist, int numOfOperations)
    {
        String curOperation = " ";

        for(int i=0; i<10;i++)
        {
            curOperation = Game.twist(numOfOperations)[i];
        }
    }

    public static void setCube()
    {
        for(int i=0; i<staCube.length;i++)
        {
            for(int j=0; j<staCube[j].length;j++)
            {
                cube[i][j] = staCube[i][j];
            }
        }
    }
}
