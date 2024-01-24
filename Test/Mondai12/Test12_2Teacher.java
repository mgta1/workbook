package Test.Mondai12;

class Test12_2Teacher extends Test12_2Person {
    String  subject;
    
    Test12_2Teacher(String name, String job, String subject) {
        super(name, job); this.subject = subject;
    }

    public void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職業: " + job);
        System.out.println("担当科目:" + subject);
    }
}


