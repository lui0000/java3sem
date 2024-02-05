package mvs.myPackage2;

public class DemoMVCPattern {
    public static void main(String[] args) {
        // Создаем объект модели (Сlient)
        Сlient clientModel = new Сlient();
        // Создаем объект представления (ClientView)
        ClientView clientView = new ClientView();
        // Создаем объект контроллера (ClientController) и связываем его с моделью и представлением
        ClientController clientController = new ClientController(clientModel, clientView);
        clientController.updateView();
        // Устанавливаем начальные значения модели
//        clientController.setСlientName("John Doe");
//        clientController.setClientEge(30);
//        clientController.setСlientDirectionsInPainting("Impressionism");
//        clientController.setСlientFavoriteMaterial("Oil Paint");

        // Обновляем представление
        clientController.updateView();
    }
}

