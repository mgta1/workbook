package Test.Mondai13;

class T13_1Cook extends T13_1Person {
    String specialities;
    
    T13_1Cook(String name, String job, String specialities) {
        super(name, job); this.specialities = specialities;
    }

    @Override
    void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + job);
        System.out.println("得意料理: " + specialities);
    }
}

