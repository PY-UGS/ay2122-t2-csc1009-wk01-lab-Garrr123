package Week2.Week_2;

public class Week2TutQues3 {
    public static void main(String[] args) {
        long Millisec = System.currentTimeMillis();
        long seconds = (Millisec/1000); 
        long finalSecond = seconds % 60;
        long minutes = seconds/60;
        long finalminutes = minutes%60;
        long hrs = (minutes/60);
        long finalhrs = hrs % 24;

        System.out.println("Current time is " + finalhrs + " : " + finalminutes + " : " + finalSecond + " GMT");

    }
}
