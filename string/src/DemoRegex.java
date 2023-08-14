import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args){
        String str1 = "*1 Rental $70000Shopping  $299. Expenses $800 . House$200000";
        Pattern pattern  = Pattern.compile("\\$\\d+(,\\d+)*(\\.\\d+)?");

        Matcher matcher = pattern.matcher(str1);

        int sum =0;
        while(matcher.find()){
            String price = matcher.group().replaceAll("\\$","");
            int p = Integer.parseInt(price);
            System.out.println("$" +p);
            sum +=p;
        }
        System.out.println(sum);
    }
}