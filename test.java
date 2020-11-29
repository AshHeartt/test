
import java.util.*;
import java.io.*;



class tes{
    public static void main(String [] args) throws IOException{
        FileReader f1=new FileReader("myfile.txt");
        int ch;
        int sum=0;
        while((ch=f1.read())!=-1){
            if((char)ch=='a'||(char)ch=='e'||(char)ch=='i'||(char)ch=='o'||(char)ch=='u'){
                sum++;
            }
        }



        System.out.println(sum);

    }//sasasasasas
}
