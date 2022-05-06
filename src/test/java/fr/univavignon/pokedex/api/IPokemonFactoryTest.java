package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;

import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonFactoryTest {
	@Test
	public void creationPokemonTest() {
		IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
		
		//Pokemon pokemon1 = pokemonFactory.createPokemon(133, 60, 100, 50, 10);
		//assertEquals(pokemon1.getCp(), (int)pokemon1.getCp());
		//System.out.println(pokemon1.getCp());
	}

}
