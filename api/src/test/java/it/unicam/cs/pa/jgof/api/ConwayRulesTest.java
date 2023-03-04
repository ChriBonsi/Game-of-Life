package it.unicam.cs.pa.jgof.api;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ConwayRulesTest {
    @Test
    public void shouldDieForUnderpopulation(){
        ConwayState s =ConwayState.ALIVE;
        List<ConwayState> others = getOthers(3,1);
        UnderpopulationRule r = new UnderpopulationRule();
        testRuleResult(s, others, r, ConwayState.DEAD);
    }

    @Test
    public void underpopulationRuleIsNotApplicable(){
        ConwayState s =ConwayState.ALIVE;
        List<ConwayState> others = getOthers(2,2);
        UnderpopulationRule r = new UnderpopulationRule();
        testRuleIsNotApplied(s, others, r);
    }

    @Test
    public void ruleForUnderpopulationOnDeadState(){
        ConwayState s = ConwayState.DEAD;
        List<ConwayState> others = getOthers(3,1);
        UnderpopulationRule r = new UnderpopulationRule();
        testRuleIsNotApplied(s, others, r);
    }

    @Test
    public void liveCellShouldSurvive(){
        ConwayState s =ConwayState.ALIVE;
        List<ConwayState> others = getOthers(2,2);
        SurvivalRule r = new SurvivalRule();
        testRuleResult(s, others, r, ConwayState.ALIVE);
    }


    private void testRuleResult(ConwayState initialState, List<ConwayState> others, Rule<ConwayState> r, ConwayState resultState) {
        Optional<ConwayState> result = r.apply(initialState, others);
        assertTrue(result.isPresent());
        assertEquals(resultState, result.get());
    }

    private void testRuleIsNotApplied(ConwayState initialState, List<ConwayState> others, Rule<ConwayState> r) {
        Optional<ConwayState> result = r.apply(initialState, others);
        assertFalse(result.isPresent());
    }

    private List<ConwayState> getOthers(int dead, int alive) {
    return IntStream.range(0, dead+alive)
            .mapToObj(i->(i<dead?ConwayState.DEAD : ConwayState.ALIVE))
            .toList();
    }

}