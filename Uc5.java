package Day3Day4;

public class Uc5 {
    public static void main(String[] args) {
        int wageperhr=20;
        int dayhrs=8;
        int workingdays=20;
        int wages= wageperhr*dayhrs*workingdays;
        int wageparttimehrs =4;
        int wagesfrhalfday = wageperhr*wageparttimehrs*workingdays;

        int empcheck=(int)Math.floor(Math.random()*10)%3;

        switch (empcheck)
        {

            case 0:
                System.out.println("Employee is Absent");
                System.out.println("your Salary is zero");
                break;

            case 1:
                System.out.println("Employe is present");
                System.out.println("Your salary is for 20 days$" + wages);
                break;

            case 2:
                System.out.println("Employe is present but only for half day");
                System.out.println("Your salary is for 20 days $" + wagesfrhalfday);
                break;
        }

    }
}
