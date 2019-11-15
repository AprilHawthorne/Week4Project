import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class week4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//#1
		List<String> employeeNames = new ArrayList<String>();
		
		//#2
		Set<Integer> ids = new HashSet<Integer>();
		
		//#3
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//#4
		employeeNames.add("Leslie Knope");
		employeeNames.add("Rachel Green");
		employeeNames.add("Michael Scott");
		employeeNames.add("Dwight Schrute");
		employeeNames.add("Phoebe Buffay");
		
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		
		//#5
		int i = 0;
		for (int id : ids) {
			String employeeName = employeeNames.get(i);
			employeeMap.put(id, employeeName);
			i++;
			}
		
		//#6
		for (int key: employeeMap.keySet()) {
			System.out.println(key + ": " + employeeMap.get(key));
		}
		
		//#7
		StringBuilder idsBuilder = new StringBuilder();
		
		//#8
		for (int id : ids) {
			idsBuilder.append(id + "-");
		}
		// extra line to make console easier to read
		System.out.println();
		
		//#9
		System.out.println(idsBuilder.toString());
		
		//#10
		StringBuilder namesBuilder = new StringBuilder();
		
		//#11 (added "," with the space to read easier in the console)
		for (String name : employeeNames) {
			namesBuilder.append(name + ", ");
		}
		// extra line to make console easier to read
		System.out.println();
		
		//#12
		System.out.println(namesBuilder.toString());
		
	}

}
