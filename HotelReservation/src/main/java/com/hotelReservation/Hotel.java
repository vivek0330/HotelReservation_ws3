package com.hotelReservation;

public class Hotel {
    /**
     * <h6> Instance variables :: </h6>
     * <ol>
     *     <li> The name that will be used for the hotel name. </li>
     *     <li> The regularWeekdayRate that will be used for the hotel regular Weekday Rate. </li>
     *     <li> The regularWeekendRate that will be used for the hotel regular Weekend Rate. </li>
     *     <li> The rewardsWeekdayRate that will be used for the hotel rewards Weekday Rate. </li>
     *     <li> The rewardsWeekendRate that will be used for the hotel rewards Weekend Rate. </li>
     *     <li> The rating that will be used for the hotel rating. </li>
     * </ol>
     */
    private String name;
    private int regularWeekdayRate;
    private int regularWeekendRate;
    private int rewardsWeekdayRate;
    private int rewardsWeekendRate;
    private int rating;

    /**
     * Creates an Hotel with the specified name.
     *
     * @param name               The hotel name.
     * @param regularWeekdayRate The hotel regular weekday rate.
     * @param regularWeekendRate The hotel regular weekend rate.
     * @param rewardsWeekdayRate The hotel rewards weekday rate.
     * @param rewardsWeekendRate The hotel rewards weekend rate.
     * @param rating             The hotel rating.
     */
    public Hotel(String name, int regularWeekdayRate, int regularWeekendRate, int rewardsWeekdayRate, int rewardsWeekendRate, int rating) {
        this.name = name;
        this.regularWeekdayRate = regularWeekdayRate;
        this.regularWeekendRate = regularWeekendRate;
        this.rewardsWeekdayRate = rewardsWeekdayRate;
        this.rewardsWeekendRate = rewardsWeekendRate;
        this.rating = rating;
    }

    /**
     * Gets the hotel name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is a setter which sets the name
     *
     * @param name - the name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the hotel regular Weekday Rate.
     *
     * @return regularWeekdayRate
     */
    public int getRegularWeekdayRate() {
        return regularWeekdayRate;
    }

    /**
     * This is a setter which sets the regularWeekdayRate
     *
     * @param regularWeekdayRate - the regularWeekdayRate to be set
     */
    public void setRegularWeekdayRate(int regularWeekdayRate) {
        this.regularWeekdayRate = regularWeekdayRate;
    }

    /**
     * Gets the hotel regular Weekend Rate.
     *
     * @return regularWeekendRate
     */
    public int getRegularWeekendRate() {
        return regularWeekendRate;
    }

    /**
     * This is a setter which sets the regularWeekendRate
     *
     * @param regularWeekendRate - the regularWeekendRate to be set
     */
    public void setRegularWeekendRate(int regularWeekendRate) {
        this.regularWeekendRate = regularWeekendRate;
    }

    /**
     * Gets the hotel rewards Weekday Rate.
     *
     * @return rewardsWeekdayRate
     */
    public int getRewardsWeekdayRate() {
        return rewardsWeekdayRate;
    }

    /**
     * This is a setter which sets the rewardsWeekdayRate
     *
     * @param rewardsWeekdayRate - the rewardsWeekdayRate to be set
     */
    public void setRewardsWeekdayRate(int rewardsWeekdayRate) {
        this.rewardsWeekdayRate = rewardsWeekdayRate;
    }

    /**
     * Gets the hotel rewards Weekend Rate.
     *
     * @return rewardsWeekendRate
     */
    public int getRewardsWeekendRate() {
        return rewardsWeekendRate;
    }

    /**
     * This is a setter which sets the rewardsWeekendRate
     *
     * @param rewardsWeekendRate - the rewardsWeekendRate to be set
     */
    public void setRewardsWeekendRate(int rewardsWeekendRate) {
        this.rewardsWeekendRate = rewardsWeekendRate;
    }

    /**
     * Gets the hotel rating.
     *
     * @return rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * This is a setter which sets the rating
     *
     * @param rating - the rating to be set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }
}
