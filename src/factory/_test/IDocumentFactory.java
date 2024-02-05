package factory._test;

interface IDocumentFactory {
    IDocument createOpen(String name); // creates new object related to already existing file

    IDocument createNew(String name); // create new object related to the new FILE
}
