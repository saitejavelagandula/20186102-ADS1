import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()) {
			sb.append(sc.nextLine() + "::");
		}
		String[] lines = sb.toString().split("::");
		for (String line : lines) {
			if (line.equals("JC")) {
				if (map.isEmpty()) {
					System.out.println("NO Registration");
				}
				else {
					// System.out.println(map);
					print(map);
				}
			}
			else {
				String[] tokens = line.split(",");
				map.put(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
				print(map);
			}
		}
	}

	public static void print(Map<Integer, Integer> map)  
    { 
        if (map.isEmpty())  
        { 
            System.out.println("map is empty"); 
        } 
          
        else
        { 
            System.out.println(map); 
        } 
    } 
}