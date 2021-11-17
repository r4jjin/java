public class test3 {
    public static void main(String[] args) {
        // System.out.println(tranform("modify_variableName"));
        System.out.println(tranform("thisIsAVariable"));
       
    }
    public static String tranform(String input){
        
        if(input.contains("_")){
            return  convertCppToJavaMode(input);
        }
        else{
            return  convertJavaToCppMode(input);
        }
    }
    public static String convertCppToJavaMode(String s){
        String x[]=(s.split("_"));
        String result="";
        for(int i=0;i<x.length;i++){
            String q=x[i];
            if(i==0){
               q=q.toLowerCase();
            }else{
                q=q.substring(0,1).toUpperCase()+q.substring(1);
            }
           
            result=result+q;
        }
       
        return result;
    }
    public static String convertJavaToCppMode(String input){
        System.out.println("convertJavaToCppMode="+input);
        String result="";
        char s[]=input.toCharArray();
        for(int i=0;i<s.length;i++){
            if(Character.isUpperCase(s[i])){
                String temp="_"+s[i]+"".toLowerCase();
                result=result+temp;
            }else{
                result=result+s[i];
            }
        }
        result=result.toLowerCase();
        return result;
    }
}
