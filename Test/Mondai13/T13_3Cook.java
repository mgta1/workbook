package Test.Mondai13;

public class T13_3Cook implements T13_3Person {
    private String name;
    private String job;
    private String specialties;

    public T13_3Cook(String name, String job, String specialties) {
        this.name = name; this.job = job; this.specialties = specialties;
    }

    @Override public void introduce() {
        System.out.println("氏名:" + name);
        System.out.println("職種:" + job);
        System.out.println("得意料理:" + specialties);
    }
}
