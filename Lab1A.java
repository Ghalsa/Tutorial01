/**
 * Created by ghalsa on 04-Sep-17.
 */

import java.io.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Lab1A {

    public static void main(String args[]){

        try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
            char[] CharDelete = new char[20];
            int idx = 0;
            String willDelete = input.readLine();
            for(int i = 0; i<willDelete.length(); i++){
                if(idx<20){ //max char 20 idx 0 -19
                    //System.out.println(temp.charAt(i));
                    if(willDelete.charAt(i) != ' '){ //jika inputan bukan spasi melainkan suatu karakter maka akan dimasukkan ke array string
                        CharDelete[i] = willDelete.charAt(i);
                        idx++;
                        System.out.println(CharDelete[i]+"");
                    }
                }
            }
            String line;
            while ((line = input.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e ){
            System.out.println("error in getting input");
        }

//        for(int i = 0; i < idx; i++){
//            System.out.println(CharDelete[i]);
//        }

    }

}
