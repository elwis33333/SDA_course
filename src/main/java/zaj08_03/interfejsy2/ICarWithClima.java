package zaj08_03.interfejsy2;

//kiedy dziedzicze inne inerfejsy, wówczas używam extends
public interface ICarWithClima extends IClimaControl, IDrive {
    boolean canIOpenWindow();
}
