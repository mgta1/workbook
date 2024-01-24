package Test.Mondai13;

abstract class T13_1Person {
    String name;
    String job;

    public T13_1Person(String name, String job) {
        this.name = name; this.job = job;
    }

    abstract void introduce();
}
