# Mlh_Code_Sample

Hii I know that there is specified that no Algorithm implementations / competitive coding solutions comes under poor code samples but i have to submit this only because of 
two reasons:----------------------------------------------

1.At this time i haven't contain any of the good code samples due to which i dont want to fake it and makeit real that i will show only that thing which i know 

2.It is a nice question that it applies in our daily live that is the combination of two buttons on the dial pad can provide us how much no of combination of character that 
particularly that digit contains for example In dialpad 1 contains abc character and so on the other butons 

So it;s a request you to pls look into the explaination once-------------------------------------------------
   //////////////////Prerequistes for this question will be a Understanding on recursion and a sight on Arraylist and that's it \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
first its a permutation question so we will use the string unprocessed and processed method to make sure that our permutation 
 
 So we take the input of the button as a string input and then pass it into another function called Alloutcomes1
 where it has two arguments Called (String p,String Up) and here we return the arraylist<String> so to get output in one arraylist type
  
  *******First we take the convention if The String Up is empty means all the number we taken as input we get the corresponding output in String P*********************
  
We create an new Arraylist in the the UP.isEmpty() so that whenever the the string is empty then store the value of Stirng P in the arraylist 
   if (Up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
  
   int digit = Up.charAt(0) - '0'; // This is used for getting the value of digit at 1st place nut we know that the Input is given us in the format of String So we have to convert 
  // it into digit and we can do it by Subtracting the character 0 from the character of the Character at first of the Stirng Up
  
  And  WE KNOW THAT EVERY NUMBER ON THE DIALPAD CONTAINS THREE CHARACTER OF THE ALPHABET SO WHATEVER WE WILL GET THE DIGIT IT MUST BE RUN THREE TIMES SO THAT ALL THE CHACATER
  COULD POSSIBLY COMBINES WITH  THE OTHER CHARACTER OF THE OTHER NUMBER SO WE NEED TO FORMULATE A FORMULA FOR FINDING THE RANGE OF THE NUMBER
  
  digit:[(digit-1)*3,digit*3)    so lets think of the example:-- lets 1 be the digit so its range will be [(1-1)*3,1*3)=>1:[0,3) 
  now we get the range now the question arises who to convert this number into the character of which that digit contains
  like 1 contains[a,b,c] we will do it by adding the range of the each number of the digit to the character a and the result comes via the ascii value as a+'i' this will 
  give us the ascii value and we then have to convert this ascii value into its corresponding character 
![Char-Data-conversion-ASCII-Decimal-and-Biner](https://user-images.githubusercontent.com/97210098/166198769-bf43b309-0d30-44ee-8783-d5435e809699.png)
  **Above is the ascii table of all the character in English**
  And then we typecast the ascii value into the character
 for (int i = (digit - 1) * 3; i < digit * 3; i++) {     //Run for three times and with the range as discussed above
            char ch = (char) ('a' + i);          //We get the charctecter by the typecast in charcater of the ascii value 
            list.addAll(Alloutcomes1(p + ch, Up.substring(1)));////////now we to permutate so we have to done one by all again and again 
        }          //first we get one character of the 1st integer of the up string and store it in the processed string which contains nothing but we will add the charcater 
          by the p+ch and then we do again make the function to do recursion but now with the number after that number stored in the processed 
          and then we again run the same function and store the character corresponding to the range of that digit one by one and add it one by one with the character of the 
          processed string and so we will get all our possibilty in the final array list as we add all the recursion return in the final arraylist ny the following command
                    *********************list.addAll(Alloutcomes1(p + ch, Up.substring(1)));***********************************************************
                        and we know that the return of the function will be the arraylist and it will be stored in the final Arraylist
                                                         
                                                         
               [THAT'S HOW OUR NOT SO HARD BUT A GOOD AND PRACTICAL QUESTION IS SOLVED THANK YOU FOR READING THE DOCUMENTATION OF THE PROBLEM]                                          
