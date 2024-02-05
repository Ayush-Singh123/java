import java.util.*;

class WordExtractiondemo {
    public static void main(String[] args) {
        String str ="He said, \"Hello!\"";
        StringTokenizer st = new StringTokenizer(str,"[ ,.?!\"]+");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(">"+st.nextToken()+"<");
        }
    }
}