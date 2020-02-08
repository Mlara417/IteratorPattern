package iteratorPattern;

public class RecipeBook implements Container {
	public String recipes[] = {
			"Banana Cake VI",
			"Chocolate Cupcakes", 
			"Cranberry-Pecan Coffee Cake",
			"Banana Breakfast Cookies", 
			"Bombshell Brownies"
			};
	
	@Override
	public Iterator getIterator() {
		return new recipeIterator();
	}
	
	private class recipeIterator implements Iterator {
		int index;
		
		@Override
		public boolean hasNext() {
			if(index < recipes.length) {
				return true;
			}
			return false;
		}
		
		@Override
		public Object next() {
			if(this.hasNext()) {
				return recipes[index++];
			}
			return null;
		}
	}

}
