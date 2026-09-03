public class TV {
    private int channel;
    private int volume_level;
    private boolean on;

    TV(){
        on = false;
        channel = 1;
        volume_level = 50;
        System.out.println("La tele esta lista para prender.\n");
    }

    public void turnOn(){
        if(on){
            System.out.println("La tele ya esta prendida.\n");
        }else{
            on = true;
            System.out.println("La tele ahora esta prendida.\n");
        }
    }

    public void turnOff(){
        if(on){
            on = false;
            System.out.println("La tele ahora esta apagada\n");
        }else{
            System.out.println("La tele ya esta apagada.\n");
        }
    }

    public void setChannel(int channel){
        if(on){
            if(channel >= 1 && channel <= 26){
                if(this.channel == channel){
                    System.out.println("La tele ya esta en el canal " + this.channel + ".\n");
                }else {
                    this.channel = channel;
                    System.out.println("La tele cambio al canal " + this.channel + ".\n");
                }
            }else{
                System.out.println("El canal " + channel + " no esta disponible.\n");
            }
        }else{
            System.out.println("La tele esta apagada.\n");
        }

    }

    public void ChannelUp(){
        if(on){
            if(channel < 26){
                channel++;
            }else{
                channel = 1;
            }
            System.out.println("La tele cambio al canal " + channel + ".\n");
        }else{
            System.out.println("La tele esta apagada.\n");
        }

    }

    public void ChannelDown(){
        if(on){
            if(channel > 1){
                channel--;
            }else{
                channel = 26;
            }
            System.out.println("La tele cambio al canal " + channel + ".\n");
        }else{
            System.out.println("La tele esta apagada.\n");
        }

    }

    public void volumeUp(){
        if(on){
            if(volume_level < 100){
                volume_level++;
            }
            System.out.println("La tele esta a " + volume_level + " de volumen.\n");
        }else{
            System.out.println("La tele esta apagada.\n");
        }
    }

    public void volumeDown(){
        if(on){
            if(volume_level > 1){
                volume_level--;
            }
            System.out.println("La tele esta a " + volume_level + " de volumen.\n");
        }else{
            System.out.println("La tele esta apagada.\n");
        }
    }








}
