package Day3Day4;

public class Uc4 {
    public static void main(String[] args) {
        int wageperhr=20;
        int dayhrs=8;
        int wages= wageperhr*dayhrs;
        int wageparttimehrs =4;
        int wagesfrhalfday = wageperhr*wageparttimehrs;

        int empcheck=(int)Math.floor(Math.random()*10)%3;

        switch (empcheck)
        {

            case 0:
                System.out.println("Employee is Absent");
                System.out.println("your Salary is zero");
                break;

            case 1:
                System.out.println("Employe is present");
                System.out.println("Your salary is $" + wages);
                break;

            case 2:
                System.out.println("Employe is present but only for half day");
                System.out.println("Your salary is $" + wagesfrhalfday);
                break;
        }

    }
}
