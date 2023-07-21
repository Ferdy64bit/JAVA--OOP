import Interface.Phone;
public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;
    public Xiaomi(){
        //SET VOLUME AWAL
        this.volume=50;
    }
    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("handPohone menyala..");
        System.out.println("selamat datang di xiaomi");
        System.out.println("Android Versi 10");
    }
    public void powerOff(){
        isPowerOn = false;
        System.out.println("memetikan handphone");
    }
    @Override
    public void volumeUp(){
        if (isPowerOn){
            if (this.volume == MAX_VOLUME){
                System.out.println("volume sudah maksimal");
                System.out.println("volume ="+this.volume +"%");
            }else {
                this.volume += 10;
                System.out.println("volume sekarang"+this.volume+"%");
            }
        }else {
            System.out.println("handphone mati, silakan nyalakan dulu");
        }
    }

    @Override
    public void volumeDown(){
        if (isPowerOn){
            if (this.volume == MIN_VOLUME){

                System.out.println("volume ="+this.volume +"%");
            }else {
                this.volume -= 10;
                System.out.println("volume sekarang"+this.volume+"%");
            }
        }else {
            System.out.println("handphone mati, silakan nyalakan dulu");
        }
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }
    public void setPowerOn(boolean isPowerOn){
        this.isPowerOn = isPowerOn;
    }
}
