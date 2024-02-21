import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String[] arr = br.readLine().split(" ");

       for(int i = 0; i < arr.length; i++){
        int a = Integer.parseInt(arr[i]);
        if(a == 1){
            System.out.println(i+1);
            break;
        }
       }
    }
}
