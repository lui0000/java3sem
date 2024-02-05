package factory.chairfactory;

interface IAbstractChairFactory {
    IChair createVictorianChair();
    IChair createMagicChair ();
    IChair createFunctionalChair();
}
