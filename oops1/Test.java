package oops1;

public class Test {
    public static void main(String[] args) {

                //(1)OOPs beginning ( object, class, calling)
        /*Teacher teacher1 = new Teacher();// object declare

        teacher1.setInformation("Mamunur","male",1458947574); //initialising
        teacher1.displayInformation();

        //System.out.println("Name: "+teacher1.name);
        //System.out.println("Gender: "+teacher1.gender);
        //System.out.println("Phone: "+teacher1.phone);


        Teacher teacher2 = new Teacher();

        //teacher2.name = "Islam";
        //teacher2.gender = "male";  all made easy by using method and putting infos
        //teacher2.phone = 145357574;

        teacher2.setInformation("Islam","male",145357574);
        teacher2.displayInformation();     // if we set this, no need to use        System.out.println("Name: "+teacher2.name);

                                // System.out.println("Gender: "+teacher2.gender);
                               //System.out.println("Phone: "+teacher2.phone);
        */
                    //Constructor

        Teacher teacher1 = new Teacher("Mamunur","male",1458947574);// object declare
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Islam","male",145357574);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();

    }
}
