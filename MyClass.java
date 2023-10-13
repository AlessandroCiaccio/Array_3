public class MyClass {
    public static void main(String args[]) {
       int[] firstArr = {1, 2, 2, 3, 4, 4, 5};
       
       int[] secondArr = new int[firstArr.length];
        int ind=0;
        for (int i=0; i<firstArr.length; i++){
            boolean isDup=false;
            for (int j=0; j<ind; j++){
                if(firstArr[i]==secondArr[j]){
                    isDup=true;
                    break;
                }
            }
            if(!isDup){
                secondArr[ind]=firstArr[i];
                ind++;
            }
        }
       
       
       
       for (int i : secondArr) {
            if (i != 0) { 
                System.out.print(i + " ");
            }
        }
    }
}