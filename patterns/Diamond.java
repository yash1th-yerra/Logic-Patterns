import java.io.*;
import java.util.*;
public class Diamond {
    public static void main(String[] args) throws Exception  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
            for(int i=0;i<2*n-1;i++){
                int star,space;
                if(i<=n){
                    space = n-i-1;
                    star = 2*i+1;
                }
                else{
                    space = i;
                    star = ;
                }
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<star;j++){
                    System.out.print("*");
                }
               
                System.out.println();
            }
            
    
    }
}




