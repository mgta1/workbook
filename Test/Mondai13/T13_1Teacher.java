package Test.Mondai13;

class T13_1Teacher extends T13_1Person {
    String subject;

    T13_1Teacher(String name, String job, String subject) {
        super(name, job); this.subject = subject;
    }

    @Override
    void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + job);
        System.out.println("担当科目: " + subject);
    }
}

