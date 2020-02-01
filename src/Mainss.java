import Controllers.Bookextend;
import DAOctrl.BookDAOctrl;

import java.lang.management.BufferPoolMXBean;

public class Mainss {
    public static void main(String[] args) {
        Bookextend bookextend = new Bookextend();
        var book = bookextend.addFromKeyBoard();
        var BookDAO= new BookDAOctrl();
        BookDAO.add(book);
        System.out.println(book);
    }
}
