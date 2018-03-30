package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {

    }

    private FizzBuzzGame game;

    @Before
    public void setup() {
        game = new FizzBuzzGame();
    }


    @Test
    public void test_SayNumber_say_original_input_when_not_matched_with_any_rules() {
        assertThat(game.sayNumber(11), is("11"));
        assertThat(game.sayNumber(17), is("17"));
        assertThat(game.sayNumber(19), is("19"));
        assertThat(game.sayNumber(97), is("97"));

    }


    @Test
    public void test_SayNumber_say_Fizz_when_number_contains_3() {
        assertThat(game.sayNumber(3), is("Fizz"));
        assertThat(game.sayNumber(13), is("Fizz"));
        assertThat(game.sayNumber(23), is("Fizz"));
        assertThat(game.sayNumber(43), is("Fizz"));
        assertThat(game.sayNumber(30), is("Fizz"));
        assertThat(game.sayNumber(31), is("Fizz"));
        assertThat(game.sayNumber(32), is("Fizz"));
        assertThat(game.sayNumber(33), is("Fizz"));
        assertThat(game.sayNumber(34), is("Fizz"));
        assertThat(game.sayNumber(35), is("Fizz"));
        assertThat(game.sayNumber(36), is("Fizz"));
        assertThat(game.sayNumber(37), is("Fizz"));
        assertThat(game.sayNumber(38), is("Fizz"));
        assertThat(game.sayNumber(39), is("Fizz"));
    }

    @Test
    public void test_SayNumber_say_Fizz_when_number_is_multiple_of_3() {
        assertThat(game.sayNumber(3), is("Fizz"));
        assertThat(game.sayNumber(6), is("Fizz"));
        assertThat(game.sayNumber(99), is("Fizz"));
    }
}
