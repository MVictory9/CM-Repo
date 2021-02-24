
public class StringTask {

	public static void main(String[] args) {
		
		String frisrName = "Mahmoud";
		String medelName = "Nasr";
		String lastName = "Amin";
		
		String fullName = frisrName +" "+ medelName +" "+ lastName;
		
		
		boolean equal = frisrName.equals(medelName);
		System.out.println("The names is equal ?: "+equal);
		
		
		boolean contain = fullName.contains("Amin");
		System.out.println("If the full names contain name Amin? "+contain);

		
		
	}
}
