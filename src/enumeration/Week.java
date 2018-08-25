package enumeration;

public class Week {
    Day day;
    public Week(Day day){
        this.day=day;
    }
    public void whatToDo(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("We are doing pungtami in Monday");
                break;
            case TUESDAY:
                System.out.println("We are Playing Cricket");
                break;
            case WEDNESDAY:
                System.out.println("We are Studying");
                break;
            case THURSDAY:
                System.out.println("We are Mentoring");
                break;
            case FRIDAY:
                System.out.println("We are Chodachuding");
                break;
            case SATURDAY:
                System.out.println("bududdudddddd");
                break;
            case SUNDAY:
                System.out.println("ghrrrrrrrrrrrrrrrrrrrrrr");
                break;
            default:
                System.out.println("Kisu na");
                break;

        }
    }}
