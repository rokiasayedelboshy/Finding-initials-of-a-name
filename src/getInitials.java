import java.io.*;
import java.lang.*;
import java.util.*;

public class getInitials {
    public static void main(String[] args)
    {
        String full_name="Rokia Sayed Elboshy";
        char[] chars = full_name.toCharArray();
        ArrayList<Character> init = new ArrayList<Character>();
        init.add(chars[0]);
        for (int i=0; i<chars.length ; i++) {
           if (chars[i]==' '){
               init.add(chars[i+1]);
           }
        }
        System.out.println(init);

        //char[] init;
       // for ()

    }
}
