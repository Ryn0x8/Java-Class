class SevenWonders {
    public void displayInfo() {
        System.out.println("Seven Wonders of the World");
    }
}

class TajMahal extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Taj Mahal - Located in India, a symbol of love built by Emperor Shah Jahan.");
    }
}

class GreatWallOfChina extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Great Wall of China - A series of fortifications made of stone and brick.");
    }
}

class Petra extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Petra - An archaeological site in Jordan, famous for its rock-cut architecture.");
    }
}

class ChristTheRedeemer extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Christ the Redeemer - A massive statue in Rio de Janeiro, Brazil.");
    }
}

class MachuPicchu extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Machu Picchu - An Incan citadel set high in the Andes Mountains in Peru.");
    }
}

class Colosseum extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Colosseum - An oval amphitheater in Rome, Italy.");
    }
}

class ChichenItza extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("Chichen Itza - A large pre-Columbian archaeological site in Mexico.");
    }
}

public class Wonders {
    public static void main(String[] args) {
        SevenWonders[] wonders = {
            new TajMahal(),
            new GreatWallOfChina(),
            new Petra(),
            new ChristTheRedeemer(),
            new MachuPicchu(),
            new Colosseum(),
            new ChichenItza()
        };

        for (SevenWonders wonder : wonders) {
            wonder.displayInfo();
        }
    }
}
