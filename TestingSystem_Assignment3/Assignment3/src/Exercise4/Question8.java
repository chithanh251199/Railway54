package Exercise4;

public class Question8 {
	public static void main(String[] args) {
		String[] groupNames = { "Java with VTI", "Cách qua môn gia va", "Học Java có khó không?" };

		for (String groupName : groupNames) {
			if (groupName.contains("Java")) {
				System.out.println(groupName);
			}
		}
	}
}
