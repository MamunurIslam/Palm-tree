package oops1;

public class Teacher {
        //(1) OOPs beginning ( object, class, calling)
    /*   String name, gender;
        int phone;

        void setInformation(String n, String m, int ph){
            name = n;
            gender = m;
            phone =ph;
        }

        void displayInformation(){
            System.out.println("Name: "+name);
            System.out.println("Gender: "+gender);
            System.out.println("Phone: "+phone);
            System.out.println("\n\n");
        }*/
                //Constructor Parameterized
    String name, gender;
    int phone;
    Teacher(){
        System.out.println("No value");
    }
    Teacher (String n, String g,int p){ // parameterized construction
        name = n;
        gender = g;
        phone =p;
    }
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println("\n\n");
    }



}
