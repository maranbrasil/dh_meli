// import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String[] cities = {
            "Londres", 
            "Madrid", 
            "Nova York", 
            "Buenos Aires", 
            "Asuncion", 
            "São Paulo", 
            "Lima", 
            "Santiago", 
            "Lisboa", 
            "Toquio",
        };

        int[][] temp = { {-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};       
        int indexL = 0;
        int indexH = 0;
        int lowerTemp = temp[0][0];
        int higherTemp = temp[0][1];
        for(int l=0; l < temp.length; l++){
            if (l == 0){
                if(temp[l+1][0] < temp[l][0]){
                    indexL = l+1;
                    lowerTemp = temp[l+1][0];
                } 
                if(temp[l+1][1] > temp[l][1]){
                    indexH = l+1;
                    higherTemp = temp[l+1][1];
                } 
            }
            if(temp[l][0] < lowerTemp){
                indexL = l;
                lowerTemp = temp[l][0];
            } 
            if(temp[l][1] > higherTemp){
                indexH = l;
                higherTemp = temp[l][1];
            } 
        }
        System.out.println(lowerTemp);
        System.out.println(cities[indexL]);
        System.out.println(higherTemp);
        System.out.println(cities[indexH]);
    }
}
