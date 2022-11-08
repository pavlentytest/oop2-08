public class TV {
    public String model;
    public int diagonal;
    private double weight;
    /*
    TV() {
       this.model = null; // null
       this.diagonal = 0; // 0
       this.weight = 0.0; // 0.0
    }
     */
    TV() {

    }

    public TV(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
