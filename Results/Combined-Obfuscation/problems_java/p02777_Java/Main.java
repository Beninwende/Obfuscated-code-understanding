import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws MyException {
        
     
     Scanner scan = new Scanner(System.in);
     String S = scan.next();
     String T = scan.next();

     
     if(S.length()<1 || S.length()>10) throw new MyException("");
     if(T.length()<1 || T.length()>10) throw new MyException("");
     
     if (!Pattern.matches("^[a-z]+$", S)) throw new MyException("");
     if (!Pattern.matches("^[a-z]+$", T)) throw new MyException("");

     
     if(S.equals(T)) throw new MyException("");
          
     
    String As = scan.next();
    String Bs = scan.next();

     
     if(!Pattern.compile("^-?[0-9]+$").matcher(As).find()) throw new MyException("");
     if(!Pattern.compile("^-?[0-9]+$").matcher(Bs).find()) throw new MyException("");

    
	int A = Integer.parseInt(As);
	int B = Integer.parseInt(Bs);

     
     if(A<1 || A>10) throw new MyException("");
     if(B<1 || B>10) throw new MyException("");

     
     String U = scan.next ();
     
     if(!U.equals(S) && !U.equals(T)) throw new MyException("");

     if(U.equals(S)) System.out.println((A-1) +" "+ B);
     if(U.equals(T)) System.out.println(A +" "+ (B-1));
          
     scan.close();
    }
}

class MyException extends Exception{
  public MyException(String msg){
    super(msg);
  }
}