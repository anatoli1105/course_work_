import java.util.Arrays;
public class Main {

    private static Employee []employee2=new Employee[10];
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

        listWorker(employee2);
        System.out.println();
        calculateSalary(employee2);
        System.out.println("общая сумма зарплат ->"+calculateSalary(employee2));
        System.out.println();

        maxMinSalary(employee2);
        System.out.println();



        averageSalary(employee2,employee2.length);
        System.out.println("средняя зарплата -> "
                +averageSalary(employee2,employee2.length));
        System.out.println();

        printWorkers(employee2);

        System.out.println();
        double index=1.1;
        indexingSalary(employee2,index);
        System.out.println(Arrays.toString(employee2));

        int numberDeportment=2;
        countDeprtment(employee2,numberDeportment);

        Employee [] deportament2=new Employee[countDeprtment(employee2,numberDeportment)];
        addDeportament(employee2,deportament2);
        System.out.println(Arrays.toString(deportament2));
        System.out.println();

        seachDeportament(employee2,5);

        System.out.println();

        maxMinSalary(deportament2);

        System.out.println("сумма зарплат отдела 2 -"+calculateSalary(deportament2));
        calculateSalary(deportament2);

        int average=averageSalary(deportament2,deportament2.length);

        System.out.println("средняя зарплата отдела 2 -"+average);

        indexingSalary(deportament2,index);

        System.out.println(Arrays.toString(deportament2));

        System.out.println();

        listDeportament2(deportament2);

        System.out.println();

        int value=50000;

        moreValue(employee2,value);
        System.out.println();
        lessValue(employee2,value);

    }
    private static void seachDeportament(Employee[] employee1, int i) {
        for( Employee item:employee1){
            if (i==item.getDepartament()){
                System.out.println("список сотрудников отдела "+i+":"+
                                    "id :"+item.getId()+" ,фамилия :"+item.getSecondName()+
                                " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName()+
                                    " ,зарплата:"+item.getSalary());
            }

        }
    }

    private static void lessValue(Employee[] employee1, int value) {
        System.out.println("сотрудники с зарплатой меньше "+value);
        for( Employee item:employee1){
            if(item.getSalary()<=value){
                System.out.println("id :"+item.getId()+" ,фамилия :"+item.getSecondName()+
                        " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName()+" ,зарплата:"+item.getSalary());
            }

        }
    }

    private static void moreValue(Employee[] employee1, int value) {
        System.out.println("сотрудники с зарплатой больше "+value);
        for( Employee item:employee1){
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

    static Employee[] addDeportament(Employee[] employees, Employee[] deportament2) {
        int i=0;
        for( Employee item:employees){
            if(item.getDepartament()==2){

                deportament2[i]=item;
                i++;
            }
        }
        return deportament2;
    }

    private static int countDeprtment(Employee[]employees,int i) {
        int count=0;
        for(Employee item:employees){
            if(item.getDepartament()==i){
                count++;
            }
        }

        return count;
    }

    static Employee [] indexingSalary(Employee[] employee1,double i) {
        for(Employee item:employee1){
            item.setSalary((int )(item.getSalary()*i));
        }
        return employee1;
    }

    private static void printWorkers(Employee[] employee1) {
        for (Employee item : employee1){
            System.out.println("фамилия :"+item.getSecondName()+
                    " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName());
        }
    }

    static int averageSalary(Employee[] employee1,int j) {
        int res = 0;
        for (Employee item : employee1) {
            res += item.getSalary();

        }

        return res/=j;

    }



    private static int calculateSalary(Employee[] employee1) {
        int res = 0;
        for (Employee item : employee1) {
            res += item.getSalary();

        }
        return res;
    }


    private static void listWorker(Employee[] employee1) {
        for (Employee item : employee1) {
            System.out.println(item);

        }
    }

    private static void maxMinSalary(Employee[] employee1) {
        int max = 0;

        for (Employee item : employee1) {

            if (max < item.getSalary()) {
                max = item.getSalary();
            }
        }

        for (Employee item : employee1) {

            if (max == item.getSalary()) {
                System.out.println("сотрудник с максимальной зарплатой->"+item);
            }
        }
        int min = max;
        for (Employee item : employee1) {
            if (min > item.getSalary()) {
                min = item.getSalary();
            }
        }
        for (Employee item : employee1) {

            if (min == item.getSalary()) {
                System.out.println("сотрудник с минимальной  зарплатой->"+item);
            }
        }

    }



}
