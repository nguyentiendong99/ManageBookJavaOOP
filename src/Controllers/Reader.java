package Controllers;

import ReaderDAO.Readerdao;
import Readers.Intro;

import java.util.Scanner;

public class Reader implements Ctrls<Intro> {
    public boolean Checkmail(String mail){
        String regex = "^\\w+@gmail.com$";
        return mail.matches(regex);
    }
    @Override
    public void Show(Intro intro) {

    }

    @Override
    public Intro addFromKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        var Cmail = "";
        while (!Checkmail(Cmail)){
            System.out.println("Mời bạn nhập lại email để đăng kí : ");
            Cmail = scanner.nextLine();
        }
        Readerdao readerdao = new Readerdao();
        var isvalid = readerdao.Isvalid(Cmail,"dbo.Reader");
        while (!isvalid){
            System.out.println("email đã có mời bạn nhập lại ... ");
            System.out.println("Mời bạn nhập lại email để đăng kí : ");
            Cmail = scanner.nextLine();
            isvalid = readerdao.Isvalid(Cmail,"dbo.Reader");

        }
        System.out.println("Mời nhập tên : ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập địa chỉ đang ở : ");
        String add = scanner.nextLine();
        System.out.println("Nhập tuổi : ");
        int age = scanner.nextInt();
        Intro intro = new Intro(Cmail,name,add,age);
        return intro;
    }
}
