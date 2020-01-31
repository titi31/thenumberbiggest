package co.simplon;

import java.util.Arrays;

public class Main {
    public static int tab[]={5,3,-2,12,0,21};
    public static int otherTab[]={-1,5,23,1,2};
    private static int theBiggest = Integer.MIN_VALUE;
    private static int the2Biggest = Integer.MIN_VALUE;
    public static void main(String[] args) {

        int a=add(theBiggest,otherTab);

        otherTab[Arrays.binarySearch(otherTab,a)] = Integer.MIN_VALUE;
      int b= add(the2Biggest,otherTab);
        System.out.println(a+"+"+b+" = "+(b+a));



    }
    public static  int add(int var,int tab[]){
        for(int i=0;i<tab.length;i++){
            if(var<tab[i]){
                var=tab[i];
            }


        }
       return var;


    }
}
