package Activity1Dastruct;

import java.util.*;

public class Main {

        public static void main(String[]args){

            Scanner scan = new Scanner(System.in);

            int size;
            System.out.print("Enter The Size Of Queue: ");
            size = scan.nextInt();
            
            Backbone back = new Backbone(size);
            back.menu();

        }



}
