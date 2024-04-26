public class Main {
    public static void main(String[] args) {
        int ageMasha = 17;
        if (ageMasha >= 18) {
            System.out.println("он совершенно летний");
        } else {
            System.out.println(" Он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperature = 1;
        if (temperature < 5) {
            System.out.println(" На улице " + temperature + " нужно надеть шапку ");
        } else {
            System.out.println("на улице " + temperature + " можно идти буз шапки ");
        }
        int speed = 80;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + " придеться заплатить штраф");
        } else {
            System.out.println("Если скорсть " + speed + " можно есзтить спокойно ");
        }
        int age = 33;
        boolean kindergarten = age > 2 && age > 6;
        if (kindergarten) {
            System.out.println(" Если возраст равен " + age + ", то ему нужно ходить в детскй сад ");
        }
        boolean shcool = age >= 7 && age >= 17;
        if (shcool) {
            System.out.println(" Если возраст равен " + age + ", то ему нужно ходить в школу ");
        }
        boolean university = age >= 18 && age <= 24;
        if (university) {
            System.out.println((" Если возраст равен " + age + ", то ему нужно ходить в университет ");
        }
        boolean work = age < 24;
        if (work) {
            System.out.println((" Если возраст равен " + age + ", то ему нужно ходить на работу ");
        }


    }

}
}