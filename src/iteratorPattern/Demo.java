package iteratorPattern;

public class Demo {
	public static void main(String[] args) {
		RecipeBook recipeBook = new RecipeBook();
		int count = 0;
		
		for(Iterator iter = recipeBook.getIterator(); iter.hasNext();) {
			String recipe = (String)iter.next();
			count++;
			
			System.out.println("Recipe " + count + ": " + recipe);
		}
	}
}
