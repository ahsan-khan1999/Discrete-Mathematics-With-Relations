public class TransitiveR {

    int[][] array={{1, 1, 1, 1, 1, 1, 1},
                   {1, 0, 1, 1, 1, 1, },
                   {1, 1, 0, 1, 1, 1, 1},
                   {1, 1, 1, 0, 1, 1, 1},
                   {1, 1, 1, 1, 0, 1, 1},
                   {1, 1, 1, 1, 1, 0, 1},
                   {1, 1, 1, 1, 1, 1, 0}};

    public void print() {
        for (int i=0; i < array.length; i++) {
            for (int j=0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        }

    }

    public void checkTransitivity(){
        int row=0;

        for (int i=0; i < array.length; i++) {
            if (array[row][row+1] == 1  && array[row+1][row+2] == 1){
                if (array[row][row+2] == 1){
                    System.out.println("Relation Is Transitive!");
                    break;
                }
                else {
                    System.out.println("Not Transitive!");
                    break;
                }
            }
            else {
                System.out.println("Transitive!!");
                break;
            }

        }

    }
    public void checkTransitive(){
        int row=0;
        int col = 0;
        for (int i=row; i <array.length-1 ; i++) {
            for (int j=col; j <array.length-1 ; j++) {
                if (array[i][j] == 1 && array[i][j++] == 1){
                    if (array[i][j] == 1){
                        System.out.println("Transitive!!!!");
                        break;
                    }
                    else {
                        System.out.println("Not Tr");
                        break;
                    }
                }
                else {
                    System.out.println("Transitive bcz there is nothing to check transitivity!");
                    break;
                }
            }
            break;
        }

    }

}
