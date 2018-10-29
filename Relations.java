import java.util.Arrays;

public class Relations {

    int[][] array={{0, 1, 0, 0, 1, 1, 1},
                   {0, 0, 0, 1, 0, 1, 0},
                   {1, 0, 0, 0, 1, 0, 1},
                   {0, 1, 0, 0, 1, 0, 1},
                   {0, 0, 1, 0, 0, 0, 1},
                   {1, 0, 1, 0, 0, 0, 0},
                   {1, 0, 1, 0, 0, 1, 0}};

    public void print() {
        for (int i=0; i < array.length; i++) {
            for (int j=0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        }

    }

    public void checkDigonals() {

        int rows=0;
        for (int i=rows; i < array.length; i++) {
            if (array[rows + 1][rows + 1] == 1) {
                if (array[rows][rows] == 1) {
                    System.out.println("Reflexive");
                    break;
                } else {
                    System.out.println("Not Reflexive");
                    break;
                }
            } else if (array[rows + 1][rows + 1] == 0) {
                if (array[rows][rows] == 0) {
                    System.out.println("IrrReflexive");
                    break;
                } else {
                    System.out.println("Not Reflexive");
                    break;
                }
            }
//            else if(array[rows][rows] == 0 ||array[rows + 1][rows + 1] == 1){
////                if (array[rows][rows] == 0)
//                System.out.println("Not Reflexive");
//                break;
//            }
//        }


        }
    }
}
