package Readers;

public class Ctrlreader extends Intro {
    private int timeborrow;
    private int timetra;
    private String payments;

    public Ctrlreader(int timeborrow, int timetra, String payments) {
        this.timeborrow = timeborrow;
        this.timetra = timetra;
        this.payments = payments;
    }

    public Ctrlreader(String email, String name, String add, int age, int timeborrow, int timetra, String payments) {
        super(email, name, add, age);
        this.timeborrow = timeborrow;
        this.timetra = timetra;
        this.payments = payments;
    }

    public int getTimeborrow() {
        return timeborrow;
    }

    public void setTimeborrow(int timeborrow) {
        this.timeborrow = timeborrow;
    }

    public int getTimetra() {
        return timetra;
    }

    public void setTimetra(int timetra) {
        this.timetra = timetra;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return super.toString() + "Ctrlreader{" +
                "timeborrow=" + timeborrow +
                ", timetra=" + timetra +
                ", payments='" + payments + '\'' +
                '}';
    }
}
