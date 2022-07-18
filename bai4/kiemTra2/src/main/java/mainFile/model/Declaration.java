package mainFile.model;

public class Declaration {
    private int id;
    private String name;
    private String date;
    private String vehicle;
    private String dateStar;
    private String dateEnd;
    private String note;

    public Declaration(int id, String name, String date, String vehicle, String dateStar, String dateEnd, String note) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.vehicle = vehicle;
        this.dateStar = dateStar;
        this.dateEnd = dateEnd;
        this.note = note;
    }

    public Declaration() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getDateStar() {
        return dateStar;
    }

    public void setDateStar(String dateStar) {
        this.dateStar = dateStar;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
