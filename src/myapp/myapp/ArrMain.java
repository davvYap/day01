package myapp;

public class ArrMain {
    public static void main(String[] args){

        String[] names = new String[3];
        names[0] = "David";
        names[1] = "Davv";
        names[2] = "Thomas";

        // System.out.print(names);

        for(int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }

        int i = 0;
        while(i<names.length){
            System.out.printf("[%d] %s\n",i,names[i]);
            i++;
        }
    }
}
