package fr.univavignon.pokedex.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class IPokemonMetadataProviderTest {
	@Test
	public void AffichageTest() {
		IPokemonMetadataProvider pokemonMetadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
		int indextest=0;
		String name="Bulbizarre";
		int attack=126;
		int defense = 126;
		int stamina = 90;
		try {
			//pokemonMetadataProvider.getPokemonMetadata(0);
			assertEquals(name, pokemonMetadataProvider.getPokemonMetadata(indextest).getName());
			assertEquals(attack,pokemonMetadataProvider.getPokemonMetadata(indextest).getAttack());
			assertEquals(defense, pokemonMetadataProvider.getPokemonMetadata(indextest).getDefense());
			assertEquals(stamina, pokemonMetadataProvider.getPokemonMetadata(indextest).getStamina());
		} catch (PokedexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*pokemonMetadata = new PokemonMetadata(0, "Bulbizarre", 0, 0, 0);
		assertEquals("Bulbizarre", pokemonMetadata.getName());*/
	}
	
}
