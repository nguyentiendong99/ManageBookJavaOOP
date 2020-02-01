package Tailieu;

public class Members {
    private String Idmember;
    private String membername;
    private String addmember;
    private int agemember;
    public Members(){

    }

    public Members(String idmember, String membername, String addmember, int agemember) {
        Idmember = idmember;
        this.membername = membername;
        this.addmember = addmember;
        this.agemember = agemember;
    }

    public String getIdmember() {
        return Idmember;
    }

    public void setIdmember(String idmember) {
        Idmember = idmember;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getAddmember() {
        return addmember;
    }

    public void setAddmember(String addmember) {
        this.addmember = addmember;
    }

    public int getAgemember() {
        return agemember;
    }

    public void setAgemember(int agemember) {
        this.agemember = agemember;
    }

    @Override
    public String toString() {
        return super.toString() + "Members{" +
                "Idmember='" + Idmember + '\'' +
                ", membername='" + membername + '\'' +
                ", addmember='" + addmember + '\'' +
                ", agemember=" + agemember +
                '}';
    }
}
