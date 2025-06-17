
public class CountSay{
    public String countAndSay(int n){
            if(n==1){
                return "1";
            }
           String prev = countAndSay(n-1);
           StringBuilder sb = new StringBuilder();
           int count = 1;
           for(int i=0; i<prev.length(); i++){
               if(prev.charAt(i)==prev.charAt(i-1)){
                count++;
               }
               else{
                sb.append(count);
                sb.append(prev.charAt(i-1));
                count=1;
               }
           }
           
        return sb.toString();
    }

    public static void main(String[] args) {
        CountSay cs = new CountSay();
        cs.countAndSay(4);
    }
}

