package Opcional;

public class Opcional {

public boolean gus(String str){
        String s = str + str;
        return s.substring(1, s.length() - 1).contains(str);
    }

}
