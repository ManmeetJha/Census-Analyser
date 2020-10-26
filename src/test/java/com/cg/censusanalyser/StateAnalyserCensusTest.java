package com.cg.censusanalyser;


import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class StateAnalyserCensusTest {
    public static final String STATE_CENSUS_DATA_FILE = "F:\\4. MANMEET JHA\\JAVA\\JAVA_UC_PROBLEMS_INTELLIJ\\Census-Analyser"
            + "\\IndiaStateCensusData.csv";
    public static final String WRONG_STATE_CENSUS_DATA_FILE = "F:\\4. MANMEET JHA\\JAVA\\JAVA_UC_PROBLEMS_INTELLIJ\\Census-Analyser"
            + "\\IndiaStateCensusData.cv";


    @Test
    public void whenNumberOfRecordMatchesShouldPassTest() throws CustomCensusAnalyserException, IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        int totalEntriesInCsvFile = stateCensusAnalyser.loadCsvData(STATE_CENSUS_DATA_FILE);
        Assert.assertEquals(29, totalEntriesInCsvFile);
    }

    @Test
    public void whenFileIsNotInCsvFormatShouldThrowCustomException() throws IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            int totalEntriesInCsvFile = stateCensusAnalyser.loadCsvData(WRONG_STATE_CENSUS_DATA_FILE);
        } catch (CustomCensusAnalyserException e) {
            Assert.assertEquals(CustomCensusAnalyserException.ExceptionType.IncorrectCsvFile, e.type);
        }
    }


}