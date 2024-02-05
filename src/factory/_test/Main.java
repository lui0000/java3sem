package factory._test;

public class Main {
    public static void main(String[] args) {


        System.out.println("demonstration of how createNew function works:\n");
        TextDocumentFactory factory = new TextDocumentFactory();
        TextDocument txtDoc = factory.createNew("1.txt");
        txtDoc.setFileContent("meow");
        System.out.println(txtDoc.getFileContent());




        System.out.println("demonstration of how createOpen function works:\n");
        TextDocumentFactory factory1 = new TextDocumentFactory();
        TextDocument txtDoc1 = factory1.createOpen("1.txt");
        txtDoc1.saveFile("saved content");
        System.out.println(txtDoc.getFileContent());



    }
}

