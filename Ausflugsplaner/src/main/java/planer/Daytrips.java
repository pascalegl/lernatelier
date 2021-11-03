package planer;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "daytrips")
@SessionScoped
public class Daytrips implements Serializable {

    private boolean weekday;
    private boolean niceWeather;
    private boolean duringHoliday;
    private boolean duringDay;
    private boolean kids;

    private boolean bowling;
    private boolean outPool;
    private boolean inPool;
    private boolean darkforest;
    private boolean music;
    private boolean breatBaking;
    private boolean mine;
    private boolean goCourses;
    private boolean billard;
    private boolean racing;
    private boolean openAirCinema;
    private boolean basketWeaving;
    private boolean waterfall;
    private boolean zoo;

    //Method to find the right Trips
    public String getTrips() {
        
        //Declaration of oposite Booleans
        boolean weekend = !weekday;
        boolean badWeather = !niceWeather;
        boolean duringSchool = !duringHoliday;
        boolean duringEvening = !duringDay;
        boolean noKids = !kids;

        //Comparing Input with Trips
        if (duringEvening || (weekend && duringDay)) {
            bowling = true;
        }

        if (niceWeather && duringDay) {
            outPool = true;
        }

        if (!(weekend && duringHoliday)) {
            inPool = true;
        }

        if (niceWeather && duringDay && !duringEvening) {
            darkforest = true;
        }

        if (duringEvening && duringSchool && !weekend) {
            music = true;
        }
        if (weekend && badWeather) {
            breatBaking = true;
        }

        if (duringDay || (weekend && duringHoliday)) {
            mine = true;
        }

        if ((weekend && badWeather) || (weekday && duringEvening && niceWeather)) {
            goCourses = true;
        }

        if (noKids && (duringEvening || weekend)) {
            billard = true;
        }

        if (noKids && duringDay && duringHoliday && weekend) {
            racing = true;
        }

        if (niceWeather && (duringEvening || weekend)) {
            openAirCinema = true;
        }

        if (duringHoliday && badWeather && weekday) {
            basketWeaving = true;
        }

        if (duringDay) {
            waterfall = true;
        }
        zoo = true;

        return "index.xhtml";
    }

    public Daytrips() {

    }

    //Setter and getter for userinput
    public boolean isWeekday() {
        return weekday;
    }

    public void setWeekday(boolean weekday) {
        this.weekday = weekday;
    }

    public boolean isNiceWeather() {
        return niceWeather;
    }

    public void setNiceWeather(boolean niceWeather) {
        this.niceWeather = niceWeather;
    }

    public boolean isDuringHoliday() {
        return duringHoliday;
    }

    public void setDuringHoliday(boolean duringHoliday) {
        this.duringHoliday = duringHoliday;
    }

    public boolean isDuringDay() {
        return duringDay;
    }

    public void setDuringDay(boolean duringDay) {
        this.duringDay = duringDay;
    }

    public boolean isKids() {
        return kids;
    }

    public void setKids(boolean kids) {
        this.kids = kids;
    }

    public boolean isBowling() {
        return bowling;
    }

    public void setBowling(boolean bowling) {
        this.bowling = bowling;
    }

    public boolean isOutPool() {
        return outPool;
    }

    public void setOutPool(boolean outPool) {
        this.outPool = outPool;
    }

    public boolean isInPool() {
        return inPool;
    }

    public void setInPool(boolean inPool) {
        this.inPool = inPool;
    }

    public boolean isDarkforest() {
        return darkforest;
    }

    public void setDarkforest(boolean darkforest) {
        this.darkforest = darkforest;
    }

    public boolean isMusic() {
        return music;
    }

    public void setMusic(boolean music) {
        this.music = music;
    }

    public boolean isBreatBaking() {
        return breatBaking;
    }

    public void setBreatBaking(boolean breatBaking) {
        this.breatBaking = breatBaking;
    }

    public boolean isMine() {
        return mine;
    }

    public void setMine(boolean mine) {
        this.mine = mine;
    }

    public boolean isGoCourses() {
        return goCourses;
    }

    public void setGoCourses(boolean goCourses) {
        this.goCourses = goCourses;
    }

    public boolean isBillard() {
        return billard;
    }

    public void setBillard(boolean billard) {
        this.billard = billard;
    }

    public boolean isRacing() {
        return racing;
    }

    public void setRacing(boolean racing) {
        this.racing = racing;
    }

    public boolean isOpenAirCinema() {
        return openAirCinema;
    }

    public void setOpenAirCinema(boolean openAirCinema) {
        this.openAirCinema = openAirCinema;
    }

    public boolean isBasketWeaving() {
        return basketWeaving;
    }

    public void setBasketWeaving(boolean basketWeaving) {
        this.basketWeaving = basketWeaving;
    }

    public boolean isWaterfall() {
        return waterfall;
    }

    public void setWaterfall(boolean waterfall) {
        this.waterfall = waterfall;
    }

    public boolean isZoo() {
        return zoo;
    }

    public void setZoo(boolean zoo) {
        this.zoo = zoo;
    }
    
}
