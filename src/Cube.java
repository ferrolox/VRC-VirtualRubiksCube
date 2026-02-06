public class Cube
{
    private static String[][] cube =
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
    private static final String[][] baseCube =
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

    // {      C L C      } {           RBY RY RYG           }
    // {      L M L      } {           RB  R  RG            }
    // {      C L C      } {           RBW RW RWG           }
    // {C L C C L C C L C} {BYR BR BWR WRB WR WGR GRW GR GRY}
    // {L M L L M L L M L} {BY  B  BW  WB  W  WG  GW  G  GY }
    // {C L C C L C C L C} {BYO BO BOW WBO WO WOG GWO GO GOY}
    // {      C L C      } {           OWB OW OGW           }
    // {      L M L      } {           OB  O  OG            }
    // {      C L C      } {           OBY OY OYG           }
    // {      C L C      } {           YOB YO YGO           }
    // {      L M L      } {           YB  Y  YG            }
    // {      C L C      } {           YRB YR YGR           }

    public static void executeTwist(int numberOfNotations)
    {

    }

    public static void setCube()
    {
        for(int i=0; i<baseCube.length;i++)
        {
            for(int j=0; j<baseCube[j].length;j++)
            {
                cube[i][j] = baseCube[i][j];
            }
        }
    }
}
