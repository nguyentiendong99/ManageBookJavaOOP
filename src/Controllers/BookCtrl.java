package Controllers;

import DAOctrl.DocumentDAO;
import References.Document;

import java.util.Scanner;

public class BookCtrl implements Ctrls<Document> {
    public boolean CheckID(String id){
        String regex = "^DOC-\\d{3}$";
        return id.matches(regex);
    }
    @Override
    public void Show(Document document) {
    }

    @Override
    public Document addFromKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        var id = "";
        do {
            System.out.println("Mời bạn nhập mã tài liệu : DOC-xxx ");
            id= scanner.nextLine();
        }while (!CheckID(id));
        DocumentDAO documentDAO = new DocumentDAO();
        var isValid = documentDAO.isIdvalid(id,"dbo.Student");
        while (!isValid){
            System.out.println("Mã bạn nhập đã bị trùng mời bạn nhập lại ");
            System.out.println("Mời bạn nhập mã tài liệu : DOC_xxx ");
            id= scanner.nextLine();
            isValid = documentDAO.isIdvalid(id,"dbo.Student");

        }
//        String name, String tittle, int publicyear, String authors, int quantity
        System.out.println("Tiêu đề : ");
        var Tittle = scanner.nextLine();
        System.out.println("Tác giả : ");
        var authors = scanner.nextLine();
        var publicyear = 0;
        var quantity =0;
        var isOk= false;
        do {
            try {
            System.out.println("Năm xuất bản : ");
            publicyear = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số lượng : ");
            quantity = Integer.parseInt(scanner.nextLine());
            isOk= true;
        }catch (Exception e){
            System.out.println("mời bạn nhập lại năm xuất bản và số lượng ...");
        }
        }while (!isOk);
        var d = new Document(id,Tittle,publicyear,authors,quantity);
        return d;
    }
}
