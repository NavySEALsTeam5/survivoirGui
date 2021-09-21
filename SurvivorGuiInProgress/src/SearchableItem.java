
import java.util.*;

public enum SearchableItem {
	SOCK, STAPLER, BROKEN_COFFEE_MUG, PENCIL, DEAD_BODY, HAND, TOE, FINGER, CASINGS, CAN, CAR_KEYS, EAR, RAG, HAT, GLOVE, PURSE;
	
	public String displayName() {
		
		return switch(this) {
			case SOCK-> "sock";
			case BROKEN_COFFEE_MUG -> "broken coffee mug";
			case CAN -> "can";
			case CAR_KEYS -> "car keys";
			case CASINGS -> "casings";
			case DEAD_BODY -> "dead body";
			case EAR -> "ear";
			case FINGER -> "finger";
			case GLOVE -> "glove";
			case HAND -> "hand";
			case HAT -> "hat";
			case PENCIL -> "pencil";
			case PURSE -> "purse";
			case RAG -> "rag";
			case STAPLER -> "stapler";
			case TOE -> "toe";
				
		};
		
	}
	
	public static SearchableItem randomItem(Random rando) {
		SearchableItem[] items = SearchableItem.values();
		return items[rando.nextInt(items.length)];
	}
	
	
//	obtainableItemsCommon[0] = "sock";
//	obtainableItemsCommon[1] = "stapler";
//	obtainableItemsCommon[2] = "broken coffee mug";
//	obtainableItemsCommon[3] = "pencil";
//	obtainableItemsCommon[4] = "dead body";
//	obtainableItemsCommon[5] = "hand";
//	obtainableItemsCommon[6] = "old papers";
//	obtainableItemsCommon[7] = "hair";
//	obtainableItemsCommon[8] = "toe";
//	obtainableItemsCommon[9] = "finger";
//	obtainableItemsCommon[10] = "casings";
//	obtainableItemsCommon[11] = "can";
//	obtainableItemsCommon[12] = "car keys";
//	obtainableItemsCommon[13] = "ear";
//	obtainableItemsCommon[14] = "rag";
//	obtainableItemsCommon[15] = "hat";
//	obtainableItemsCommon[16] = "glove";
//	obtainableItemsCommon[17] = "purse";
}
