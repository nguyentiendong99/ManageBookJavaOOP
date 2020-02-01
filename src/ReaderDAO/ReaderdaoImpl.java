package ReaderDAO;

import DAOctrl.DBConnection;
import Readers.Ctrlreader;
import Readers.Intro;

import java.sql.SQLException;

public class ReaderdaoImpl extends Readerdao {
    @Override
    public boolean Isvalid(String id, String tablename) {
        return super.Isvalid(id, tablename);
    }

    @Override
    public void add(Intro intro) {
        super.add(intro);
        var conn = DBConnection.getInstance().getConnection();
        var sql = "insert into dbo.introreader(timeborrow,timetra,payments) " +
                " values(?,?,?) ";
        try {
            var prepare = conn.prepareStatement(sql);
            var Ctrlreader = (Ctrlreader)intro;
            prepare.setInt(1,Ctrlreader.getTimeborrow());
            prepare.setInt(2,Ctrlreader.getTimetra());
            prepare.setString(3,Ctrlreader.getPayments());
            prepare.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean edit(Intro intro) {
        return super.edit(intro);
    }

    @Override
    public boolean remove(String id) {
        return super.remove(id);
    }
}
