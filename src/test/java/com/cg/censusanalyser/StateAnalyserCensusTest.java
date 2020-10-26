package com.cg.censusanalyser;


import org.junit.Assert;
import org.junit.Test;

public class StateAnalyserCensusTest {
    public static final String STATE_CENSUS_DATA_FILE = "F:\\4. MANMEET JHA\\JAVA\\JAVA_UC_PROBLEMS_INTELLIJ\\Census-Analyser"
            + "\\IndiaStateCensusData.csv";


    @Test
    public void testSomeLibraryMethod() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        int entries = stateCensusAnalyser.loadCsvData(STATE_CENSUS_DATA_FILE);
        Assert.assertEquals(29, entries);
    }
}