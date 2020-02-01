package Controllers;
import Readers.Ctrlreader;
import Readers.Intro;

import java.util.Scanner;


public class ReaderImpl extends Reader {
    @Override
    public void Show(Intro intro) {
        super.Show(intro);
    }

    @Override
    public Intro addFromKeyBoard() {
        var read =  super.addFromKeyBoard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thời gian mượn sách : ");
        int time = scanner.nextInt();
        System.out.println("Nhập thời gian trả sách : ");
        int time1 = scanner.nextInt();
        int choice;
        String kinds[]= {"","1; Thẻ ngân hàng", "2; tiền mặt","3; Momo"};
        do {
            System.out.println("Mời chọn hình thức thanh toán : ");
            System.out.println("1; Thẻ ngân hàng ");
            System.out.println("2; Tiền mặt");
            System.out.println("3; Momo");
            choice= scanner.nextInt();
            if (choice>0 && choice<4){
                break;
            }
        }while (true);
        var tyopeofpayment = kinds[choice];
        Ctrlreader ctr = new Ctrlreader(read.getEmail(),read.getName()
        ,read.getAdd(),read.getAge(),time,time1,tyopeofpayment);
        return ctr;
    }
}
