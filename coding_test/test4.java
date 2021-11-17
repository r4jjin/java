
import java.util.ArrayList; 
import java.util.Arrays;


public class test4 {
    public static void main(String[] args) {
        System.out.println(countCharDisplay("inputdatastring"));
    }

    private static String countCharDisplay(String input){
        System.out.println("countCharDisplay");
        String outpit="";
        char c[]=input.toCharArray();
        Arrays.sort(c);
        ArrayList<String> list = new ArrayList<String>(); 
        for(int i=0;i<c.length;i++){
           if(!list.contains(c[i]+""))
           {
            int count= getCount(c[i],c);
            System.out.println(c[i]+" count == "+count);
            outpit=outpit+c[i]+count;
           }
           list.add(c[i]+"");
           
        }
        return outpit;
    }

    private static int getCount(char c, char[] c2) {
        int count=0;
        for(int i=0;i<c2.length;i++){
            if(c==c2[i]){count++;}
        }
        return count;
    }
}
