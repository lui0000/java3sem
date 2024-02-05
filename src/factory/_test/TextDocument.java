package factory._test;

import java.io.*;

class TextDocument implements IDocument {
    private final String filename;
    private String fileContent;

    public TextDocument(String filename, boolean open) {
        this.filename = filename;

        if (open) {
            openFile();
        } else {
            createNewDocument();
            openFile();
        }
    }
    public String getFileContent() {
        openFile(); // Update upon viewing
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        saveFile(this.fileContent = fileContent);
    }

    public boolean isFileExist() {
        File file = new File(FILE_SAVE_DIR + File.separator + filename);
        return file.exists();
    }

    @Override
    public void openFile() {
        File file = new File(FILE_SAVE_DIR + File.separator + filename);
        if (!isFileExist()) {
            System.err.println("Error: File does not exist.");
            System.exit(1);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
            fileContent = content.toString();
            System.out.println("File opened successfully. Content: \n" + fileContent);
        } catch (IOException e) {
            System.err.println("Error opening the file: " + e.getMessage());
        }
    }


    @Override
    public void createNewDocument() {
        if (isFileExist()) {
            System.err.println("Error: File already exists.");
            System.exit(1);
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_SAVE_DIR + File.separator + filename))) {
            bufferedWriter.write("");
            System.out.println("New text document created: " + filename);
        } catch (IOException e) {
            System.err.println("Error creating the new text document: " + e.getMessage());
        }
    }


    public void saveFile(String newText) {
        File file = new File(FILE_SAVE_DIR + File.separator + filename);

        if (!isFileExist()) {
            System.err.println("Error: File does not exist.");
            System.exit(1);
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(newText);
            System.out.println("File saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving the file: " + e.getMessage());
        }


    }


    // Assume that all text files are placed into files dir.
    // If `createOpen()` has been called check if such file exists.
    // if it does -- save its content somewhere where it can be easily manipulated.
    // If it doesn't -- catch exception and print something.
}
