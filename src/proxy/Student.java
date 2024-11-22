package proxy;

public class Student implements DailySession{
    private Attendance attendance;

    public Student(Attendance attendance){
        this.attendance=attendance;
    }
    @Override
    public void attendlesson() {
        System.out.println("Attending the session ..");
    }
}
