import java.util.Scanner;
import java.io.File;
public class puzzleHelper{
    public static void main(String[]args) throws Exception{

        File x = new File("puzzle.txt");
        Scanner a = new Scanner(x);
        String y = a.nextLine();
        int i =0;
        int currentindex = 30;
        String currentstring =y.substring(currentindex,currentindex+12);
        int mostvowelindex=0;
        int vowel=0;
        int mostvowel=0;
        int palindromeindex=0;
        int palindromeamount=0;
        int greatestpalindrome=0;
        int consecutivecharacters = 0;
        int consecutivecharacatersnumber = 0;
        int longestconsecutivecharacters =0;
        int longestnumber =0;
        int m = 0;
       


            for(;(currentindex+12)<y.length()-5;){
                currentstring=y.substring(currentindex,currentindex+12);
                
            for(;i<currentstring.length();i++){
                if(i==0){
                    m=0;
                }else{
                    m=(i-1);
                }
                if(currentstring.substring(i,i+1).equals(currentstring.substring((currentstring.length()-i),(currentstring.length()-m)))){
                    palindromeamount+=1;
                }
            } if(palindromeamount>greatestpalindrome){
                palindromeindex=currentindex;
                greatestpalindrome=palindromeamount;

            }
                i=0;
                currentindex++;
                palindromeamount=0;






            } System.out.println(palindromeindex);
            System.out.println(palindromeamount);
            System.out.println(y.substring(palindromeindex,palindromeindex+18));






        // for(;(currentindex+30)<(y.length()-5);){
        //     currentstring=y.substring(currentindex,currentindex+30);
        //     for(;i<(currentstring.length());i++){
        //         if(currentstring.substring(i,(i+1)).equals("a")||currentstring.substring(i,(i+1)).equals("i")||currentstring.substring(i,(i+1)).equals("e")||currentstring.substring(i,(i+1)).equals("o")||currentstring.substring(i,(i+1)).equals("u")) {

        //                         vowel+=1;
                   
        //         }               
        //     }
        //     if(vowel>mostvowel){
        //            mostvowel=vowel; 
        //            mostvowelindex=currentindex;
        //         }
        //         vowel=0;
        //         i=0;
        //         currentindex++;
                
                

        // }System.out.println(mostvowel);
        // System.out.println(mostvowelindex);
        // System.out.println(y.substring(mostvowelindex,(mostvowelindex+110)));






        // for(int i =30;i<(y.length()-3);i++){
        //     if(y.substring(i,i+1).equals(y.substring(i-1,i))){
        //          consecutivecharacters+=1;
        //          consecutivecharacatersnumber=i;
                 
        //     }else{
        //        if(consecutivecharacters>longestconsecutivecharacters) {
        //        longestconsecutivecharacters=consecutivecharacters;
        //        longestnumber=consecutivecharacatersnumber;
                
        //     }
        //         consecutivecharacatersnumber=0;
        //         consecutivecharacters=0;}
        // }System.out.println(longestconsecutivecharacters);
        // System.out.println(y.substring(longestnumber,longestnumber+105));
    
    
    
    }}



    //     for(;count<10;i++){
    //         if(y.substring(i,i+7).equals("giraffe")){
    //                  count+=1;
    //                  System.out.println(i);
                     
                
    //         }
              
    //         }System.out.println(y.substring(i,i+123));
    //     }
    // }
