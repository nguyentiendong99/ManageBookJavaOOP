package DAOctrl;

import References.Document;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DocumentDAO implements DAO<Document> {
    public boolean isIdvalid(String id, String tablename) {
        var sql = "SELECT ID FROM " + tablename + " WHERE ID = ? ";
        var conn = DBConnection.getInstance().getConnection();
        try {
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1,id);
            var result = prepare.executeQuery();
            if (result.next()) {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("có lỗi xảy ra");
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public void add(Document document) {
        var conn = DBConnection.getInstance().getConnection();
        var sql = "insert into dbo.Student(ID,Title,PublishedYear,Quantity,Author)" +
                "values(?,?,?,?,?);";
        try {
            var prepare= conn.prepareStatement(sql);
            prepare.setString(1,document.getName());
            prepare.setString(2,document.getTittle());
            prepare.setInt(3,document.getPublicyear());
            prepare.setInt(4,document.getQuantity());
            prepare.setString(5,document.getAuthors());
            prepare.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean edit(Document document) {
        return false;
    }

    @Override
    public boolean remove(String id) {
        var sql = "delete from dbo.Student where id = ?";
        var conn = DBConnection.getInstance().getConnection();
        try {
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1,id);
            var result = prepare.executeUpdate();
            if (result > 0 ){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Document findById(String id) {
        return null;
    }

    @Override
    public List<Document> findByName(String name) {
        var docs = new ArrayList<Document>();
        var sql = "select*from dbo.Student where Title like ? ";
        var conn = DBConnection.getInstance().getConnection();
        try {
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1,name);
            var result = prepare.executeQuery();
            var id = result.getString("ID");
            var title = result.getString("Title");
            var published = result.getInt("PublishedYear");
            var quantity = result.getInt("Quantity");
            var Author = result.getString("Author");
            var doc = new Document(id,title,published,Author,quantity);
            docs.add(doc);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return docs;
    }

    @Override
    public List<Document> findByType(String type) {
        return null;
    }

}
