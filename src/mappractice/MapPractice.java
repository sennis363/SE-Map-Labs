package mappractice;

import java.util.*;

/**
 *
 * @author Sean Ennis
 */
public class MapPractice {

    public static void main(String[] args) {
        //Lab 1
        System.out.println("////////////////////////////LAB 1/////////////////////////////");

        Employee emp1 = new Employee(1, "Jenkins", "Leeroy", "111-111-111");
        Employee emp2 = new Employee(2, "Kurosaki", "Ichigo", "222-222-222");
        Employee emp3 = new Employee(3, "Scarlet", "Erza", "111-111-111");
        Employee emp4 = new Employee(4, "Lamperouge", "Lelouch", "444-444-444");

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println("Array List Content:");

        for (Employee e : employees) {
            System.out.println(e);
        }

        Set<Employee> set = new HashSet<Employee>(employees);

        System.out.println("\nHash Set Content:");

        for (Employee e : set) {
            System.out.println(e);
        }

        employees.clear();
        employees.addAll(set);

        System.out.println("\nFinal List Content:");

        for (Employee e : employees) {
            System.out.println(e);
        }

        //Lab 2
        System.out.println("\n////////////////////////////LAB 2/////////////////////////////");

        Map map = new HashMap();

        map.put("111-111-111", emp1);
        map.put("222-222-222", emp2);
        map.put("111-111-111", emp3);
        map.put("444-444-444", emp4);

        System.out.print("Retrieving the SSN of 111-111-111: ");
        Employee e = (Employee) map.get("111-111-111");
        System.out.println(e);

        Set keys = map.keySet();
        for (Object key : keys) {
            Employee found = (Employee) map.get(key);
            System.out.println(found.toString());
        }

        //Lab 3
        System.out.println("\n////////////////////////////LAB 3/////////////////////////////");
        System.out.println("Default Sorting:");
        Map<String,Employee> map2 = new TreeMap<String,Employee>(map);
        Set<String> keys2 = map2.keySet();
        
        for(String key : keys2) {
            Employee found = map2.get(key);
            System.out.println(found.toString());
        }
        
        System.out.println("\nSorting by Last Name:");
        Collection<Employee> values2 = map2.values();
        
        List<Employee> sortedList2 = new ArrayList<Employee>(values2);
        
        Collections.sort(sortedList2, new EmployeeByLastName());
        for(Employee emp : sortedList2) {
            System.out.println(emp);
        }


        //Lab 4
        System.out.println("\n////////////////////////////LAB 4/////////////////////////////");
        Set<Employee> set2 = new TreeSet<Employee>();
        set2.add(emp1);
        set2.add(emp2);
        set2.add(emp3);
        set2.add(emp4);

        Iterator it = set2.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element + " ");

        }
    }
}
