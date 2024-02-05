package mvs.myPackage2;

public class Сlient {
    private String Name;
    private Integer Ege;
    private String directionsInPainting;
    private String favoriteMaterial;

    public void setEge(Integer ege) {
        Ege = ege;
    }

    public void setDirectionsInPainting(String directionsInPainting) {
        this.directionsInPainting = directionsInPainting;
    }

    public void setFavoriteMaterial(String favoriteMaterial) {
        this.favoriteMaterial = favoriteMaterial;
    }


    public void setName(String name) {
        Name = name;
    }



    public String getName() {
        return Name;
    }

    public Integer getEge() {
        return Ege;
    }

    public String getDirectionsInPainting() {
        return directionsInPainting;
    }

    public String getFavoriteMaterial() {
        return favoriteMaterial;
    }

}
