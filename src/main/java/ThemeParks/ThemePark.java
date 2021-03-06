package ThemeParks;

import Behaviours.IReviewed;
import ThemeParks.Attractions.Attraction;
import ThemeParks.Attractions.AttractionTypes.Dodgems;
import ThemeParks.Stalls.Stall;
import ThemeParks.Stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;

    public ThemePark() {
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
        reviewed = new ArrayList<>();
    }

    public int numberOfAttractions() {
        return this.attractions.size();
    }

    public int numberOfStalls() {
        return this.stalls.size();
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
        this.reviewed.add(attraction);

    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
        this.reviewed.add(stall);
    }

    public ArrayList getAllReviewed() {
        return this.reviewed;
    }

}
