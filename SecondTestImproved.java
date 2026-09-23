//this is the first iteration of SecondTest.java

public class Main
{
	public static void main(String[] args) {
	    String title, director, year;
        String actor1, actor2, actor3, actor4;
        String role1, role2, role3, role4;
        title = "The Hunter"; director = "Jane Campion"; year = "(1993)";
        String[] actors = {"Holly Hunter", "Vence Victim", "Sam Volvo", "Anna Gasfiller"};
        String[] roles = {"Lexus", "Baines", "Stewart", "Flora"};
        
        System.out.println(title + year + "\nA " + director + " film.\n\n");
        
        for (int i = 0; i < actors.length; i++) {
            
            System.out.print(roles[i] + "\t\t" + actors[i] + "\n");
        }
        
        
        
	}
}
