package Test.Mondai12;

class Test12_2Cook extends Test12_2Person {
        String specialities;

        Test12_2Cook(String name, String job, String specialities) {
            super(name, job); this.specialities = specialities;
        }

        public void introduce() {
            System.out.println("氏名: " + name);
            System.out.println("職業: " + job);
            System.out.println("得意料理:" + specialities);
        }
}
