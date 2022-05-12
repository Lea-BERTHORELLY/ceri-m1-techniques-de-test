package fr.univavignon.pokedex.api;


import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class IPokemonFactoryTest {
	protected static final Pokemon Pokemon = null;

	IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
	
	@Before
	public void init() {
		when(pokemonFactory.createPokemon(anyInt(), anyInt(), anyInt(), anyInt(), anyInt())).thenAnswer(new Answer<Pokemon>() {
			public Pokemon answer(InvocationOnMock invocation) {
        		Object[] args = invocation.getArguments();
        		int cp = (int) args[0];
        		int hp = (int) args[1];
        		int dust = (int) args[2];
        		int candy = (int) args[3];
        		return new Pokemon(133, "Aquali", 126, 126, 90, cp, hp, dust, candy, 0.56);
        	}
        });		
		//System.out.println(pokemonFactory.createPokemon(133, 60, 100, 50, 10));
		
		
		//System.out.println(pokemon2.getCp());
		//assertEquals(pokemon1.getCp(), (int)pokemon1.getCp());
		//System.out.println(pokemon1.getCp());
	}
	
	@Test
	public void creationPokemonTest() {
		Pokemon pokemon = pokemonFactory.createPokemon(2729, 202, 5000, 4, 133); //pour une raison qui m'échappe, l'id du pokemon doit être placé à la fin
		//pokemonFactory.createPokemon(0, 1, 2, 3, 4);
		assertEquals(133, pokemon.getIndex());
		assertEquals("Aquali", pokemon.getName());
		assertEquals(126, pokemon.getAttack());
		assertEquals(2729, pokemon.getCp());
		assertEquals(202, pokemon.getHp());
		assertEquals(5000, pokemon.getDust());
		assertEquals(4, pokemon.getCandy());
	}

}
