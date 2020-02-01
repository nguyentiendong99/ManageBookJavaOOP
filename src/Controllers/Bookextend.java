package Controllers;

import DAOctrl.DocumentDAO;
import References.Book;
import References.Document;

import java.util.Scanner;

public class Bookextend extends BookCtrl {
    public boolean CheckType (String id){
        String regex = "^dcmt_\\d{3}";
        return id.matches(regex);
    }
    @Override
    public void Show(Document document) {
        super.Show(document);
    }

    @Override
    public Document addFromKeyBoard() {
        var doc = super.addFromKeyBoard();
        Scanner scanner = new Scanner(System.in);
        var cid= "";
        while (!CheckType(cid)){
            System.out.println("Mời bạn nhập mã sách muốn chọn : (vd : dcmt_xxx) :...");
            cid = scanner.nextLine();
        }
        DocumentDAO documentDAO= new DocumentDAO();
        var isvalid = documentDAO.isIdvalid(cid,"dbo.Book");
        while (!isvalid){
            System.out.println("mã sách của bạn nhập đã bị trùng . Mời bạn nhập lại ...");
            System.out.println("Mời bạn nhập mã sách muốn chọn : (vd : dcmt_xxx) :...");
            cid = scanner.nextLine();
            isvalid = documentDAO.isIdvalid(cid,"dbo.Book");
        }
        int choice;
        String Kinds[] = {"","1;khoa học ","2; Kinh tế ","3; Công nghệ","4; Tình yêu"};
        do {
            System.out.println("Nhập loại sách : ");
            System.out.println("1; khoa học ");
            System.out.println("2; Kinh tế ");
            System.out.println("3; Công nghệ ");
            System.out.println("4; Tình yêu ");
            choice= scanner.nextInt();
            if (choice > 0 && choice <5){
                break;
            }
        }while (true);
        var typeofbook = Kinds[choice];
        Book book = new Book(doc.getName(),doc.getTittle(),doc.getPublicyear()
                ,doc.getAuthors(),doc.getQuantity(),cid,typeofbook);

        return book;
    }
}
