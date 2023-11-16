import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ID id = new ID(0);
        Employee worker1 = new Employee(id.getId(), "ivanov", "ivan",
                "ivanovich", 12500, 2);
        Employee worker2 = new Employee(id.getId(), "kuzmin", "fediy",
                "sergeevich", 175900, 4);
        Employee worker3 = new Employee(id.getId(), "diveeva", "dariy",
                "vitalievna", 10500, 1);
        Employee worker4 = new Employee(id.getId(), "petrov", "evgenii",
                "ilyich", 56500, 5);
        Employee worker5 = new Employee(id.getId(), "иванов", "иван",
                "иванович", 22500, 2);
        Employee worker6 = new Employee(id.getId(), "kuzmin", "fediy",
                "sergeevich", 17590, 4);
        Employee worker7 = new Employee(id.getId(), "зверева", "александра",
                "витальевна", 20500, 2);
        Employee worker8 = new Employee(id.getId(), "попов", "женя",
                "витальевич", 57500, 5);
        Employee worker9 = new Employee(id.getId(), "калинин", "александр",
                "робинович", 20500, 2);
        Employee worker10 = new Employee(id.getId(), "дубин", "костя",
                "виниаминович", 57500, 5);
        Employee[] Employee1 = new Employee[]{worker1, worker2, worker3, worker4,worker5,
                worker6,worker7,worker8,worker9,worker10};

        listWorker(Employee1);
        System.out.println();
        calculateSalary(Employee1);
        System.out.println("общая сумма зарплат ->"+calculateSalary(Employee1));
        System.out.println();

        maxSalary(Employee1);
        System.out.println();

        minSalary(Employee1,calculateSalary(Employee1));
        System.out.println();

        averageSalary(calculateSalary(Employee1),Employee1.length);
        System.out.println("средняя зарплата -> "
                +averageSalary(calculateSalary(Employee1),Employee1.length));
        System.out.println();

        printWorkers(Employee1);

        System.out.println();

        indexingSalary(Employee1);

        interestСalculation(worker3.getSalary());

        countDeprtment(Employee1,worker1.getDepartament());
        int numberDeportment2=2;
        Employee [] deportament2=new Employee[countDeprtment(Employee1,numberDeportment2)];
        addDeportament(Employee1,deportament2);
        System.out.println(Arrays.toString(deportament2));
        System.out.println();
        minSalary(deportament2,calculateSalary(Employee1));
        maxSalary(deportament2);
        System.out.println("сумма зарплат отдела 2 -"+calculateSalary(deportament2));
        calculateSalary(deportament2);
        int average=averageSalary(calculateSalary(deportament2),deportament2.length);
        System.out.println("средняя зарплата отдела 2 -"+average);
        indexingSalary(deportament2);
        System.out.println(Arrays.toString(deportament2));
        System.out.println();
        listDeportament2(deportament2);
        System.out.println();
        int value=50000;
        moreValue(Employee1,value);
        System.out.println();
        lessValue(Employee1,value);





    }
    private static void lessValue(Employee[] employee1, int value) {
        System.out.println("сотрудники с зарплатой меньше "+value);
        for( Employee item:employee1){
            if(item.getSalary()<=value){
                System.out.println("id :"+item.id+" ,фамилия :"+item.getSecondName()+
                        " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName()+" ,зарплата:"+item.getSalary());
            }
        }
    }

    private static void moreValue(Employee[] employee1, int value) {
        System.out.println("сотрудники с зарплатой больше "+value);
        for( Employee item:employee1){
            if(item.getSalary()>=value){
                System.out.println("id :"+item.id+" ,фамилия :"+item.getSecondName()+
                        " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName()+" ,зарплата:"+item.getSalary());
            }
        }
    }

    private static void listDeportament2(Employee[] deportament2) {
        System.out.println("список сотрудников отдела 2 ");
        for( Employee item:deportament2){
            System.out.println("id :"+item.id+" ,фамилия :"+item.getSecondName()+
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

    private static int countDeprtment(Employee[]employees,int departament) {
        int count=0;
        for(Employee item:employees){
            if(item.getDepartament()==departament){
                count++;
            }
        }

        return count;
    }

    static int interestСalculation(int j) {
        double i=1.1;
        return j*=i;
    }

    static Employee [] indexingSalary(Employee[] employee1) {
        for(Employee item:employee1){
            item.setSalary(interestСalculation(item.getSalary()));
        }
        return employee1;
    }

    private static void printWorkers(Employee[] employee1) {
        for (Employee item : employee1){
            System.out.println("фамилия :"+item.getSecondName()+
                    " ,имя :"+item.getFirstName()+", отчество :"+item.getSurName());
        }
    }

    static int averageSalary(int i,int j) {
        i/=j;
        return i;
    }

    static void minSalary(Employee[] employee1,int i) {
        for (Employee item : employee1) {
            //int min=0;
            if (i > item.getSalary()) {
                i = item.getSalary();
            }
        }
        for (Employee item : employee1) {
            if (i == item.getSalary()) {
                System.out.println("сотрудник с минимальной зарплатой->"+item);
            }
        }
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

    private static void maxSalary(Employee[] employee1) {
        int max = 0;
        for (Employee item : employee1) {
            //int min=0;
            if (max < item.getSalary()) {
                max = item.getSalary();
            }
        }
        for (Employee item : employee1) {

            if (max == item.getSalary()) {
                System.out.println("сотрудник с максимальной зарплатой->"+item);
            }
        }
    }



}
