import Controllers.Bookextend;
import Controllers.ReaderImpl;
import DAOctrl.BookDAOctrl;
import ReaderDAO.Readerdao;
import ReaderDAO.ReaderdaoImpl;
import References.Document;

import java.util.List;
import java.util.Scanner;

public class ControlBook {
    public static void editbook() {
        Scanner scanner = new Scanner(System.in);


    }

    public static void addbook() {
        Bookextend bookextend = new Bookextend();
        var book = bookextend.addFromKeyBoard();
        var BookDAO= new BookDAOctrl();
        BookDAO.add(book);
        System.out.println(book);
    }

    public static void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách bạn cần xóa : ");
        var id = scanner.nextLine();
        var BookDAO= new BookDAOctrl();
        var result = BookDAO.remove(id);
        if (result){
            System.out.println("Xóa sách thành công .... ");
        }
        else {
            System.out.println("Sách không tồn tại hoặc đã được xóa .... ");
        }

    }

    public static void Searchbook() {
       Scanner scanner = new Scanner( System.in);
        System.out.println("Nhập mã sách bạn muốn tìm kiếm : ");
        var id = scanner.nextLine();
        var BookDao = new BookDAOctrl();
        var result = BookDao.findByName(id);
        System.out.println(result);

    }

    public static void Managebook() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=========== CHỨC NĂNG QUẢN LÝ SÁCH ===========");
            System.out.println("1. Thêm mới một sách vào CSDL.");
            System.out.println("2. Sửa một sách theo mã sách.");
            System.out.println("3. Xóa một sách theo mã sách.");
            System.out.println("4. Tìm kiếm sách trong CSDL.");
            System.out.println("0. Thoát.");
            System.out.println("Xin mời chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    addbook();
                    break;
                }
                case 2: {
                    editbook();
                    break;
                }
                case 3: {
                    deleteBook();
                    break;
                }
                case 4: {
                    Searchbook();
                    break;
                }

            }

        } while (choice != 0);
    }

    public static void Managetag() {

    }

    public static void ManageBorrow() {

    }
    public static void addreader(){
        ReaderImpl reader= new ReaderImpl();
        var readers = reader.addFromKeyBoard();
        var readao = new ReaderdaoImpl();
        readao.add(readers);
        System.out.println(readers);

    }
    public static void removereader(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập email bạn muốn xóa ... ");
        var id = scanner.nextLine();
        var Readerdao = new  Readerdao();
        var result = Readerdao.remove(id);
        if (result){
            System.out.println("Xóa thành công ... ");
        }else {
            System.out.println("email đã xóa hoặc không tồn tại ... ");
        }

    }
    public static void editreader(){

    }

    public static void ManageReader() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=========== CHỨC NĂNG QUẢN LÍ NGƯỜI ĐỌC ===========");
            System.out.println("1; Thêm người đọc mới ... ");
            System.out.println("2; Xóa người đọc khỏi csdl ... ");
            System.out.println("3; Chỉnh sửa người thông tin người đọc ...");
            System.out.println("0; Thoát ... ");
            choice= scanner.nextInt();
            switch (choice){
                case 1:{
                    addreader();
                    break;
                }
                case 2:{
                    removereader();
                    break;
                }
                case 3:{
                    editreader();
                    break;
                }
            }

        }while (choice!=0);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("========MENU=========");
            System.out.println("1. Quản lý sách.");
            System.out.println("2. Quản lý bạn đọc.");
            System.out.println("3. Quản lý mượn.");
            System.out.println("4. Quản lý phiếu mượn.");
            System.out.println("0. Thoát.");
            System.out.println(" Bạn chọn ? : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Managebook();
                    break;
                }
                case 2: {
                    ManageReader();
                    break;
                }
            }

        } while (choice != 0);
    }
    public static void Showresult(List<Document>book){
        if (book.size()>0){
            for (var b: book){
                System.out.println(b);
            }
        }
        else {
            System.out.println("không có kết quả ... ");
        }
    }
}
