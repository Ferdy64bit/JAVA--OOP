package Interface;

public interface Phone {
    // constatnt field/atribute
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    //abstrack method
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
