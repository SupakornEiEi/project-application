package model;


public class Pets {

    private String name;
    private String type;
    private String[] nature;
    private String leg;
    private int price;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the nature
     */
    public String[] getNature() {
        return nature;
    }

    /**
     * @param nature the nutrient to set
     */
    public void setNature(String[] nature) {
        this.nature = nature;
    }

    /**
     * @return the Leg
     */
    public String getLeg() {
        return leg;
    }

    /**
     * @param Leg the spicy to set
     */
    public void setLeg(String leg) {
        this.leg = leg;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

}
