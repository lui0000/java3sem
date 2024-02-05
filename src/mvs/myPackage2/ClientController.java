package mvs.myPackage2;
public class ClientController {
    //Model Object
    // View Object
    private final Сlient model;
    private final ClientView view;
    public ClientController(Сlient model, ClientView view) {
        this.model = model;
        this.view = view;
    }
    // control model object
    public void setСlientName(String name) {
        model.setName(name);
    }
    public void setClientEge(Integer ege) {
        model.setEge(ege);
    }
    public void setСlientDirectionsInPainting(String directionsInPainting) {
        model.setDirectionsInPainting(directionsInPainting);
    }
    public void setСlientFavoriteMaterial(String favoriteMaterial) {
        model.setFavoriteMaterial(favoriteMaterial);
    }
    public String getСlientName() {
        return model.getName();
    }
    public Integer getСlientEge() {
        return model.getEge();
    }
    public String getСlientDirectionsInPainting() {
        return model.getDirectionsInPainting();
    }
    public String getlientFavoriteMaterial() {
        return model.getFavoriteMaterial();
    }
    //control view object
    public void updateView() {
        view.frame.setVisible(true);
    }
}
