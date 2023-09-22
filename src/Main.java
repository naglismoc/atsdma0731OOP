import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] names = {"Naglis", "Petras", "Jonas"};
        String[] surnames = {"Mockevicius","Vaisgantas","Barsauskas"};
        String[] emails = {"naglis@gmail.com","petras@gmail.com","jonas@gmail.com"};
        int[] phoNos = {63500658, 65878954,65245879};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + surnames[i] + " " + emails[i] + " " + phoNos[i]);
        }
        System.out.println("---------------------------------");

        String[][] students = {names,surnames,emails};

        for (int i = 0; i < students.length; i++) {
            for (int a = 0; a < students[i].length; a++) {
                System.out.print(students[i][a] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < students[0].length; i++) {
            for (int a = 0; a < students.length; a++) {
                System.out.print(students[a][i] + " ");
            }
            System.out.println();
        }

//        String[] student = {"Naglis","Mokevicius", "naglis@gmail.com",63500987,true,1990};
//        String[] student2 = {"Naglis","Mokevicius", "naglis@gmail.com",63500987,true,1990};
//        String[] studen3 = {"Naglis","Mokevicius", "naglis@gmail.com",63500987,true,1990};
        Student st = new Student();
        st.name = "Naglis";
        st.surname = "Mockevicius";
        st.email = "naglis@gmail.com";
        st.phoNo = 63400698;
        st.gender = true;
        st.birthYear = 1990;

        Student st2 = new Student();
        st2.name = "Naglis2";
        st2.surname = "Mockevicius2";
        st2.email = "naglis2@gmail.com";
        st2.phoNo = 63400699;
        st2.gender = true;
        st2.birthYear = 1991;

        System.out.println(st.name + " " + st.surname + " " + st.email + " " + st.phoNo + " " + st.gender + " " + st.birthYear);
        System.out.println("---------------------------------");

//        Student[] students2 = {st,st2};

        Student[] students2 = new Student[2];
        students2[0] = st;
        students2[1]= st2;

        for (int i = 0; i < students2.length; i++) {
            System.out.println(students2[i].name + " " + students2[i].surname);
        }
        System.out.println("---------------------------------");

        for (Student stud : students2) {
            System.out.println(stud.name + " "+ stud.surname);
        }


        Teacher t = new Teacher();
        t.name = "Dailius";
        t.email = "dailius@gmail.com";
        t.topics = new String[] {"java","html","css","js","c#","selenium","testAuto"};

        Employee e = new Employee();
        e.name = "Vilhelmas";
        e.email = "vilhelmasvcs@vilniuscoding.lt";
        e.occupation = "studiju kokybes koordinatorius";

        System.out.println("---------------------------------");
        System.out.println(st.getAge(2020));
        System.out.println(st2.getAge(2020));

        Student studFull = new Student("a","a","",1,true,1,"");
        Human h = new Human("a","a","",1,true,1);

        ArrayList<String> tekstai = new ArrayList<>();
        System.out.println(tekstai.size());
        tekstai.add("labas");
        tekstai.add("rytas");
        System.out.println(tekstai.size());
        System.out.println(tekstai.get(0) + " " + tekstai.get(1));
        tekstai.set(1,"vakaras");
        System.out.println(tekstai.get(0) + " " + tekstai.get(1));
        System.out.println(tekstai);

        ArrayList<Student> studnentai = new ArrayList<>();
        studnentai.add(st);
        studnentai.add(st2);
        studnentai.add(studFull);
        System.out.println(studnentai);

        for (int i = 0; i < studnentai.size(); i++) {
            System.out.println(studnentai.get(i).getStudies() );
        }
        for (Student stu : studnentai) {
            System.out.println(stu.getStudies());
        }

//        st2.studies = "algebra";
//        System.out.println(st2.studies);
        st2.setStudies("algebra");
        System.out.println( st2.getStudies() );

        Student.classIntro();
        /*constructor empty/full+
        this+
        arrays
        incapsulation
        overloading+
        overriding+

         */
    }
}