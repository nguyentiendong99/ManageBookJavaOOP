package DAOctrl;

import References.Book;
import References.Document;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAOctrl extends DocumentDAO {
    @Override
    public boolean isIdvalid(String id, String tablename) {
        return super.isIdvalid(id, tablename);
    }

    @Override
    public void add(Document document) {
        super.add(document);
        var conn = DBConnection.getInstance().getConnection();
        var sql = " INSERT INTO dbo.Book(ID,Typebook)" +
                " VALUES(?,?)";
        try {
            var Book= (Book)document;
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1,Book.getID());
            prepare.setString(2,Book.getTyle());
            prepare.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean edit(Document document) {
        return super.edit(document);
    }

    @Override
    public boolean remove(String id) {
        return super.remove(id);
    }

    @Override
    public Document findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<Document> findByName(String name) {

        return super.findByName(name);
    }

    @Override
    public List<Document> findByType(String type) {
        return super.findByType(type);
    }

}
