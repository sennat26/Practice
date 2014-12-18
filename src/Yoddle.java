import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Yoddle {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("triangle.txt");
		List<List<Integer>> valueList = new ArrayList<List<Integer>>();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line = bufferedReader.readLine();
		while (line != null) {
			List<Integer> lineList = new ArrayList<Integer>();
			String[] no = line.split(" ");
			for (String value : no) {
				lineList.add(Integer.parseInt(value));
			}
			valueList.add(lineList);
			line = bufferedReader.readLine();
			
		}
		
		List<Integer> finalList = findMax(valueList, 0);
		System.out.println(finalList.get(0));
 	}
	
	private static List<Integer> findMax(List<List<Integer>> valueList, int index) {
		
		if (index + 1 == valueList.size()) {
			List<Integer> maxList = new ArrayList<Integer>();
			List<Integer> noList = valueList.get(index);
			for (int i = 0; i < noList.size() - 1; i++) {
				maxList.add(getMaximum(noList, i));
			}
			return maxList;
		}
		
		List<Integer> returnMaxList = findMax(valueList, index + 1);
		if (index == 0) {
			List<Integer> finalList = new ArrayList<Integer>();
			finalList.add(valueList.get(0).get(0) + returnMaxList.get(0));
			return finalList;
		}
		
		List<Integer> addList = new ArrayList<Integer>();
		List<Integer> noList = valueList.get(index);
		for (int i = 0; i < noList.size(); i++) {
			addList.add(noList.get(i) + returnMaxList.get(i));
		}
		List<Integer> maxList = new ArrayList<Integer>();
		for (int i = 0; i < addList.size() - 1; i++) {
			maxList.add(getMaximum(addList, i));
		}
		return maxList;
		
		
	}
	
	private static int getMaximum(List<Integer> numberList, int index) {
		if (numberList.get(index) > numberList.get(index + 1)) {
			return numberList.get(index);
		} else {
			return numberList.get(index + 1);
		}
	}
	

}
