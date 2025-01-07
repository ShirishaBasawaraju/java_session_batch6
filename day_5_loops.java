
public class day_5_loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Shirisha");
        }

        String s = "PHONE";
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }

        System.err.println("b" + 1+ "a"+2*8);
        public String stringBits(String str) {
            String s = "";
            for (int i = 0; i < str.length(); i+=2){
              if(i%2==0){
                s += str.charAt(i);
            }
            }
            return s;
          }

          public String stringTimes(String str, int n) {
            String s = "";
            for (int i = 0; i <n;i++){
              s =s+=str;
            }
            return s;
          }
    }
}
