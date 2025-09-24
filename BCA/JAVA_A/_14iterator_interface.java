// Java program to show the usage of Iterator()
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class _14iterator_interface  {
	public static void main(String[] args)
	{
		// create a list
		List<String> list = new LinkedList<>();
		list.add("Welcome");
		list.add("to");
		list.add("iterator interface");

		System.out.println("The list is given as : "
						+ list);
			
		// get the iterator on the list
		Iterator<String> itr = list.iterator();

		// Returns true if there are more number of
		// elements.
		while (itr.hasNext()) {                      //will keep incresing till the last element
			// Returns the next element.
			System.out.println(itr.next());        // used to display the data 
		}

		// Removes the last element.
		itr.remove();
		System.out.println(
			"After the remove() method is called : "
			+ list);
	}
}
