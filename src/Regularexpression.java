import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpression{
    public static void main(String[] args) {
        System.out.println("mời bạn nhập địa chỉ email của mình : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "^[a-z]+[0-9]+@gmail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        if(matcher.find()){
            System.out.println("chính xác");
        }
        else {
            System.out.println("mời bạn nhập lại");
        }
        scanner.nextLine();
        System.out.println("mời bạn nhập số điện thoại của mình vào đây : ");
        String output = scanner.nextLine();
        String regit = "^[0]+[0-9]{9}$";
        Pattern pattern1 = Pattern.compile(regit);
        Matcher matcher1 = pattern1.matcher(output);
        if(matcher1.find()){
            System.out.println("chính xác");
        }
        else {
            System.out.println("mời bạn nhập lại bạn nhập không chính xác");
        }
        scanner.nextLine();
        System.out.println("mời bạn nhập mã sinh viên của bạn :");
        String Id = scanner.nextLine();
        String regot = "^[bBcC]+[17]+[dDcCvVtT]+[0-9]{3}$";
        Pattern pattern2 = Pattern.compile(regot);
        Matcher matcher2= pattern2.matcher(Id);
        if(matcher2.find()){
            System.out.println("chính xác");
        }
        else {
            System.out.println("mời bạn nhập lại bạn nhập không chính xác !!! ");
        }
    }
}