public class SRelation {

    int[][] array={{0, 1, 0, 0, 1, 1, 1},
                   {0, 1, 0, 1, 0, 1, 0},
                   {1, 0, 1, 0, 1, 0, 1},
                   {0, 1, 0, 1, 1, 0, 1},
                   {0, 0, 1, 0, 0, 0, 1},
                   {1, 0, 1, 0, 0, 1, 0},
                   {1, 0, 1, 0, 0, 1, 1}};

    public void print() {
        for (int i=0; i < array.length; i++) {
            for (int j=0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        }

    }

    public void checkSymmetricity(){
        int row=0;
        for (int i=row; i <array.length ; i++) {
            if (array[row][row+1] ==1 && transpose()){
                if (array[row][row+1] ==1 || array[row][row+1] ==0){
                    System.out.println("Symmetric");
                    break;
                }
                else if (array[row][row+1] ==1 && !transpose()){
                    if (array[row][row+1] == 1 || array[row+1][row] == 1){
                        if (array[row][row+1] == 0 || array[row][row+1] != array[row+1][row]){
                            System.out.println("Relation is Anti-Symmetric");
                            break;
                        }
                        else {
                            System.out.println("Symmetric");
                            break;
                        }
                    }
                    else {
                        System.out.println("Symmetric");
                        break;
                    }
                }
                else {
                    System.out.println("Symmetric");
                    break;
                }
            }
            else {
                System.out.println("Anti-Symmetric");
                break;
            }
        }

    }
    public boolean transpose(){
        int rows=0;
        int col = 0;
        for (int i=rows; i <array.length ; i++) {
            for (int j=col; j < array[rows].length; j++) {
                array[i][j] = array[j][i];

            }

        }
        return true;
    }
}
