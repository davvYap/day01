package myapp;

public class MultiArrMain {
    public static void main(String[] args){

        String[][] names = new String[2][3];

        names[0][0] = "David";
        names[0][1] = "Davv";
        names[0][2] = "Thomas";

        names[1][0] = "Yunice";
        names[1][1] = "Shanice";
        names[1][2] = "Canny";

        System.out.println("For loop:");
        for(int i=0; i<names.length;i++){
            for(int j=0; j<names[i].length;j++){
                System.out.printf("[%d][%d] - %s\n",i,j,names[i][j]);
            }
        }
        System.out.println("While loop:");
        int i=0;
        while(i<names.length){
            int j=0;
            while(j<names[i].length){
                System.out.printf("[%d][%d] - %s\n",i,j,names[i][j]);
                j++;
            }
            i++;
        }
    }
}
