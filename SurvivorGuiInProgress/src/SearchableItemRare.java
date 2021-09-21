import java.util.Random;
import java.util.Set;

public enum SearchableItemRare {
	POCKET_KNIFE, _9MM_BULLETS, SANDWHICH, TWINKIE, STEAK;
	
	public String displayName() {
		return switch(this) {
			case POCKET_KNIFE-> "pocket knife";
			case SANDWHICH -> "sandwhich";
			case STEAK -> "steak";
			case TWINKIE -> "twinkie";
			case _9MM_BULLETS -> "9mm bullets";
		};
	}
	
	public static SearchableItemRare randomItem(Random rando, Set <SearchableItemRare> exclude) {
		
		SearchableItemRare[] items = SearchableItemRare.values();
		
		if(exclude.size() == items.length) {
		
			return null;
		}

		else {
			SearchableItemRare chosenItem = items[rando.nextInt(items.length)];
			
			while(exclude.contains(chosenItem)) {
				
				chosenItem = items[rando.nextInt(items.length)];
			}
				
			return chosenItem;
		}
	}
}
