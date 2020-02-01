package Tailieu;

public class Newmembers extends Members {
    private String codebook;
    private String TimeBorrow;
    private String Timeagain;

    public Newmembers(String codebook, String timeBorrow, String timeagain) {
        this.codebook = codebook;
        TimeBorrow = timeBorrow;
        Timeagain = timeagain;
    }

    public Newmembers(String idmember, String membername, String addmember, int agemember, String codebook, String timeBorrow, String timeagain) {
        super(idmember, membername, addmember, agemember);
        this.codebook = codebook;
        TimeBorrow = timeBorrow;
        Timeagain = timeagain;
    }

    public String getCodebook() {
        return codebook;
    }

    public void setCodebook(String codebook) {
        this.codebook = codebook;
    }

    public String getTimeBorrow() {
        return TimeBorrow;
    }

    public void setTimeBorrow(String timeBorrow) {
        TimeBorrow = timeBorrow;
    }

    public String getTimeagain() {
        return Timeagain;
    }

    public void setTimeagain(String timeagain) {
        Timeagain = timeagain;
    }

    @Override
    public String toString() {
        return super.toString() + "Newmembers{" +
                "codebook='" + codebook + '\'' +
                ", TimeBorrow='" + TimeBorrow + '\'' +
                ", Timeagain='" + Timeagain + '\'' +
                '}';
    }
}
