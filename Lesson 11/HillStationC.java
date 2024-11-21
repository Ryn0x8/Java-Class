class HillStation{
    void location(){
        System.out.println("Location: Hill Station");
    }
    void famousFor(){
        System.out.println("Famous for: Hill Station");
    }
}


class NuwakotHillStation extends HillStation{
    @Override
    void location(){
        System.out.println("Location: Nuwakot");
    }

    @Override
    void famousFor(){
        System.out.println("Famous for: Natural Beauty of Trishuli River");
    }

}

class NagarkotHillStation extends HillStation{
    @Override
    void location(){
        System.out.println("Location: Nagarkot");
    }

    @Override
    void famousFor(){
        System.out.println("Famous for: Clear View of Mount Everest");
    }

}

class IllamHillStation extends HillStation{
    @Override
    void location(){
        System.out.println("Location: Illam");
    }
    @Override
    void famousFor(){
        System.out.println("Famous for: Illam's Tea");
    }

}

class GorkhaHillStation extends HillStation{
    @Override

    void location(){
        System.out.println("Location: Gorkha, Nepal");
    }
    @Override

    void famousFor(){
        System.out.println("Famous for: Birth of Prithivi Narayan Shah and also Khukuri");
    }

}

public class HillStationC {

    public static void main(String[] args) {
        HillStation station = new NuwakotHillStation();
        station.location();
        station.famousFor();
        
        station = new NagarkotHillStation();
        station.location();
        station.famousFor();

        station = new IllamHillStation();
        station.location();
        station.famousFor();
        
        station = new GorkhaHillStation();
        station.location();
        station.famousFor();
}
}
