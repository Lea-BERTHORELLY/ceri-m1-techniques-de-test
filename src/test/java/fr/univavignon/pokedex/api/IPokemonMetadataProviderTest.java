package fr.univavignon.pokedex.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class IPokemonMetadataProviderTest {
	@Test
	public void AffichageTest() throws PokedexException {
		IPokemonMetadataProvider pokemonMetadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
		
		/*int indextest=0;
		String name="Bulbizarre";
		int attack=126;
		int defense = 126;
		int stamina = 90;*/
		
		int indextest=133;
		String name="Aquali";
		int attack=186;
		int defense = 168;
		int stamina = 260;

		PokemonMetadata pokemonMetadata = new PokemonMetadata(133, "Aquali", 186, 168, 260);
		pokemonMetadataProvider.getPokemonMetadata(133);
		//PokemonMetadata pokemonMetadata = pokemonMetadataProvider.getPokemonMetadata(indextest);
		//when(pokemonMetadata.getName()).thenReturn("Bulbizarre");
		//pokemonMetadataProvider.getPokemonMetadata(0);
		assertEquals(name, pokemonMetadata.getName());
		//assertEquals(name, pokemonMetadataProvider.getPokemonMetadata(indextest).getName());
		assertEquals(attack,pokemonMetadata.getAttack());
		assertEquals(defense, pokemonMetadata.getDefense());
		assertEquals(stamina, pokemonMetadata.getStamina());
	}
	
}
