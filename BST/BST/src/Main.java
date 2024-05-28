import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
	    public static void main(String[] args) {
	    	tester(10);
	    	tester(100);
	    	tester(1000);
	    	tester(2000);
	    }
	    	private static void tester(int size) {
	    	int numOfTests = 100;	
	    	long totalResult = 0;
	    	for(int i = 0; i < numOfTests; i++) {
	    	List<Integer> list = generateRandomList(size);
	    	BinarySearchTree bst = new BinarySearchTree();
	    	long start = System.nanoTime();
	    	for(int value : list) {
	    		bst.add(value);
	    	}
	    	long end = System.nanoTime();
	    	long result = end - start;
	    	totalResult += result;
	    	}
	    	long time = totalResult/numOfTests;
	    	System.out.println("Average ime of sorting BTS tree with size " + size + " is: " + time);
	    	System.out.println();
	    	}	
	    private static List<Integer> generateRandomList(int size){
	    List<Integer> arr = new ArrayList<>();
        Random random = new Random();
        
        	for(int i =0; i < size;i++) {
        		if(i==0) {
        			arr.add(0);
        		}
        		else {
        			int prev = arr.get(i-1);
        			int next = prev + 1 + random.nextInt(1000);
        			arr.add(next);
        		}
        	}
        return arr;	
	    }
}

