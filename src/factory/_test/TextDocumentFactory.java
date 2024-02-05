package factory._test;

class TextDocumentFactory implements IDocumentFactory {
    @Override
    public TextDocument createOpen(String filename) {
        return new TextDocument(filename, true);
    }

    @Override
    public TextDocument createNew(String filename) {
        return new TextDocument(filename, false);
    }
}
