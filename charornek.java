public class charornek {
   
        public static void main(String[] args) {
         int n = 1, w = 1;
         char[] ch = { 'M', 'a', 'l', 'a', 't','y', 'a' };
         for (char c : ch) {
         w = w * n;
         n++;
         }
         System.out.println(w);
         
        } 
}
