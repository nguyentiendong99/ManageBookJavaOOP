package ReaderDAO;

import DAOctrl.DBConnection;
import Readers.Intro;

import java.sql.SQLException;

public class Readerdao implements DAO<Intro> {
    public boolean Isvalid(String id, String tablename){
        var sql = "select email from " + tablename + " where email = ? ";
        var conn = DBConnection.getInstance().getConnection();
        try {
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1,id);
            var result = prepare.executeQuery();
            if (result.next()){
                return false;
            }
        } catch (SQLException e) {
            System.out.println("có lỗi xảy ra .... ");
            e.printStackTrace();
        }
        return true;
    }
    @Override
    public void add(Intro intro) {
        var conn = DBConnection.getInstance().getConnection();
        var sql = " insert into dbo.Reader(email,Name,address,Age)" +
                "values(?,?,?,?)";
        try {
            var prepare =conn.prepareStatement(sql);
            prepare.setString(1,intro.getEmail());
            prepare.setString(2,intro.getName());
            prepare.setString(3,intro.getAdd());
            prepare.setInt(4,intro.getAge());
            prepare.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean edit(Intro intro) {
        return false;
    }

    @Override
    public boolean remove(String id) {
        var sql = "delete from dbo.Reader where email = ? ";
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
}
