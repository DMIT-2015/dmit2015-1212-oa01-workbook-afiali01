package ca.nait.dmit.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AlbertaCovid19SummaryData {
    //Define data field for each column in the CSV field
    private int id;
    private LocalDate dataReported;
    private int numberOfLabsTests;
    private int cumulativeNumberOfLabTests;
    private int numberOfCases;
    private int cumulativeNumberOfCases;
    private int activeCases;
    private int currentlyHospitalized;
    private int currentlyInICU;
    private int cumulativeNumberOfDeaths;
    private int numberOfDeaths;
    private int numberOfVariantsOfConcern;
    private double percentOfPositivity;



}
