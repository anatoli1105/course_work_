import java.util.Arrays;
public class Main {

     static Employee []employee2=new Employee[10];
    public static void main(String[] args) {
        employee2[0]=new Employee( "ivanov", "ivan",
                "ivanovich", 12500, 2);
        employee2[1]=new Employee("dd","rr","tt",
                23333,3);
        employee2[2] = new Employee( "diveeva", "dariy",
                "vitalievna", 10500, 1);
        employee2[3] = new Employee( "petrov", "evgenii",
                "ilyich", 56500, 5);
        employee2[4] = new Employee( "иванов", "иван",
                "иванович", 22500, 2);
        employee2[5] = new Employee( "kuzmin", "fediy",
                "sergeevich", 17590, 4);
        employee2[6] = new Employee( "зверева", "александра",
                "витальевна", 20500, 2);
        employee2[7] = new Employee( "попов", "женя",
                "витальевич", 57500, 5);
        employee2[8] = new Employee( "калинин", "александр",
                "робинович", 20500, 2);
        employee2[9] = new Employee( "дубин", "костя",
                "виниаминович", 57599, 5);

        listWorker();
        System.out.println();
        calculateSalary();
        System.out.println("общая сумма зарплат ->"+calculateSalary());
        System.out.println();

        maxMinSalary();
        System.out.println();



        averageSalary(employee2.length);
        System.out.println("средняя зарплата -> "
                +averageSalary(employee2.length));
        System.out.println();

        printWorkers();

        System.out.println();
        double index=1.1;
        indexingSalary(index);
        System.out.println(Arrays.toString(employee2));

        int numberDeportment=2;
        countDeprtment(numberDeportment);

        Employee [] deportament2=new Employee[countDeprtment(numberDeportment)];
        addDeportament(deportament2);
        System.out.println(Arrays.toString(deportament2));
        System.out.println();

        seachDeportament(5);

        System.out.println();

        maxMinSalary();

        System.out.println("сумма зарплат отдела 2 -"+calculateSalary());
        calculateSalary();

        int average=averageSalary(deportament2.length);

        System.out.println("средняя зарплата отдела 2 -"+average);

        indexingSalary(index);

        System.out.println(Arrays.toString(deportament2));

        System.out.println();

        listDeportament2(deportament2);

        System.out.println();

        int value=50000;

        moreValue(value);
        System.out.println();
        lessValue(value);

    }
    private static void seachDeportament(int i) {
        for( Employee item:Main.employee2){
            if (i==item.getDepartament()){
                System.out.println("список сотрудников отдела "+i+":"+
                                    "id :"+item.getId()+" ,фамилия :"+item.getSecondName()+
                                " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName()+
                                    " ,зарплата:"+item.getSalary());
            }

        }
    }

    private static void lessValue( int value) {
        System.out.println("сотрудники с зарплатой меньше "+value);
        for( Employee item:Main.employee2){
            if(item.getSalary()<=value){
                System.out.println("id :"+item.getId()+" ,фамилия :"+item.getSecondName()+
                        " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName()+" ,зарплата:"+item.getSalary());
            }

        }
    }

    private static void moreValue( int value) {
        System.out.println("сотрудники с зарплатой больше "+value);
        for( Employee item:Main.employee2){
            if(item.getSalary()>=value){
                System.out.println("id :"+item.getId()+" ,фамилия :"+item.getSecondName()+
                        " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName()+" ,зарплата:"+item.getSalary());
            }
        }
    }

    private static void listDeportament2(Employee[] deportament2) {
        System.out.println("список сотрудников отдела 2 ");
        for( Employee item:deportament2){
            System.out.println("id :"+item.getId()+" ,фамилия :"+item.getSecondName()+
                    " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName()+" ,зарплата:"+item.getSalary());
            System.out.println();
        }
        System.out.println("============");
    }

    static Employee[] addDeportament( Employee[] deportament2) {
        int i=0;
        for( Employee item:Main.employee2){
            if(item.getDepartament()==2){

                deportament2[i]=item;
                i++;
            }
        }
        return deportament2;
    }

    private static int countDeprtment(int i) {
        int count=0;
        for(Employee item:Main.employee2){
            if(item.getDepartament()==i){
>>>>>>>>> Temporary merge branch 2
                count++;
            }
        }

        return count;
    }

    static Employee [] indexingSalary(double i) {
        for(Employee item:Main.employee2){
            item.setSalary((int )(item.getSalary()*i));
>>>>>>>>> Temporary merge branch 2
        }
        return employee2;
    }

    private static void printWorkers() {
        for (Employee item :Main.employee2){
            System.out.println("фамилия :"+item.getSecondName()+
                    " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName());
        }
    }

    static int averageSalary(int j) {
        int res = 0;
        for (Employee item : Main.employee2) {
            res += item.getSalary();

        }

        return res/=j;

    }



    private static int calculateSalary() {
        int res = 0;
        for (Employee item : Main.employee2) {
            res += item.getSalary();

        }
        return res;
    }


    private static void listWorker() {
        for ( Employee item : Main.employee2 ) {
            System.out.println(item);

        }
    }

    private static void maxMinSalary() {
        int max = 0;

        for (Employee item :Main.employee2) {

            if (max < item.getSalary()) {
                max = item.getSalary();
            }
        }

        for (Employee item : Main.employee2) {

            if (max == item.getSalary()) {
                System.out.println("сотрудник с максимальной зарплатой->"+item);
            }
        }
        int min = max;
        for (Employee item : Main.employee2) {
            if (min > item.getSalary()) {
                min = item.getSalary();
            }
        }
        for (Employee item : Main.employee2) {

            if (min == item.getSalary()) {
                System.out.println("сотрудник с минимальной  зарплатой->"+item);
            }
        }

    }



}
