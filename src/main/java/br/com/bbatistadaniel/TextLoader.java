package br.com.bbatistadaniel;

import java.io.FileInputStream;

public class TextLoader {

    public static void showDialogue(String text, int delayInMilliseconds){

        for(int i = 0; i < text.length(); i++){

            System.out.printf("%s", text.charAt(i));
            try{
                Thread.sleep(delayInMilliseconds);
            }catch (InterruptedException e){
                System.err.println(e.getMessage());
            }

        }

    }

    public static void clearConsole(){
        for(int i = 0; i < 140; i++){
            System.out.println("");
        }
    }

}
