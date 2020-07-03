package zaj08_03_ver2.Interfejsy2;

//kiedy dziedzicze inne interfejsy wowczas uzywam extends
//a nie implements
public interface ICarWithClima extends IDrive, IClimaControl {
    boolean canIOpenWindow();
}
