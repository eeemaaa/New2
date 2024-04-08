public class Main {
    public static void main(String[] args) {
       int sum = 0;
       int count = 1;
       while (count<=100)
       {
           sum+= count;
           count++;
       }
       int result = sum / count;
        System.out.println("srednee arifmet chisel = " + result);
    }
}