public class test2{
    public static void main(String[] args) {
        
        System.out.println(logNthPrime(5));
        System.out.println(logNthPrime(3));
        System.out.println(logNthPrime(6));
        System.out.println(logNthPrime(9));
        
    }

    private static int logNthPrime(int nthPosition) {
        int counter=0;
        int inputData=1;
        while(counter<=nthPosition){
           if(isPrime(inputData)){
            counter++;
           }
            if(counter==nthPosition){
                break;
            }else
           {
            inputData++;
           } 
        }
        return inputData;
    }

    private static boolean isPrime(int inputData) {
        boolean isPrime=true;
        if(inputData<=1) {isPrime= false;}
        else{
            for(int j=2;j<inputData;j++){
                if(inputData%j==0){
                    isPrime= false;
                    break;
                }
            }
           
        }
        return isPrime;
    }

    
}