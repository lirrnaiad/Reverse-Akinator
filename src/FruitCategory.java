public class FruitCategory {
    public static class Fruit {
        private String name;
        private Properties properties;

        public Fruit(String name, Properties properties) {
            this.name = name;
            this.properties = properties;
        }

        public String getName() {
            return name;
        }

        public Properties getProperties() {
            return properties;
        }
    }

    public static class FruitProperties {
        public static Properties appleProperties() {
            return new Properties(1, 5,  1, 1, 5,1, 5, 1, 5, 5, 2, 5, 5, 5, 2, 5, 1, 5, 5, 1, 5, 2, 4, 4, 2, 1);
        }

        public static Properties bananaProperties() {
            return new Properties(5, 5, 1, 1, 3, 1, 5, 5, 5, 1, 2, 5, 5, 5,1, 5, 5, 5, 1, 4, 2, 5, 1,5, 5, 5);
        }

        public static Properties cherryProperties() {
            return new Properties(1, 5, 1, 1, 3, 1, 5, 1, 4, 3, 5, 5, 1, 5, 5, 5, 5, 1, 1, 5, 1, 5, 1, 4, 5, 1);
        }

        public static Properties grapeProperties() {
            return new Properties(1, 5, 1, 1, 3, 1, 5, 2, 5, 5, 1, 5, 5, 5, 2, 5, 1, 5, 1, 5, 1, 5, 1, 1, 1, 1);
        }

        public static Properties kiwiProperties() {
            return new Properties(2, 5, 2, 2, 2, 1, 5, 5, 5, 5, 2, 5, 5, 5, 3, 1, 5,5, 5, 2, 4, 5, 1, 1, 5, 5);
        }

    }

    public static class Properties {
        int isRound;
        int isBig;
        int isSmall;
        int isSweet;
        int isSour;
        int isLight;
        int isHeavy;
        int isOutsideRed;
        int isOutsideOrange;
        int isOutsideYellow;
        int isOutsideGreen;
        int isOutsideWhite;
        int isInsideRed;
        int isInsideOrange;
        int isInsideYellow;
        int isInsideGreen;
        int isInsideWhite;
        int isExpensive;
        int isSoft;
        int isOutsideHard;
        int isOutsideSoft;
        int isInsideHard;
        int isInsideSoft;
        int areSeedsEaten;
        int hasManySeeds;
        int isSkinEaten;

        public Properties(int isRound, int isBig, int isSmall, int isSweet, int isSour, int isLight, int isHeavy, int isOutsideRed, int isOutsideOrange, int isOutsideYellow, int isOutsideGreen, int isOutsideWhite, int isInsideRed, int isInsideOrange, int isInsideYellow, int isInsideGreen, int isInsideWhite, int isExpensive, int isSoft, int isOutsideHard, int isOutsideSoft, int isInsideHard, int isInsideSoft, int areSeedsEaten, int hasManySeeds, int isSkinEaten) {
            this.isRound = isRound;
            this.isBig = isBig;
            this.isSmall = isSmall;
            this.isSweet = isSweet;
            this.isSour = isSour;
            this.isLight = isLight;
            this.isHeavy = isHeavy;
            this.isOutsideRed = isOutsideRed;
            this.isOutsideOrange = isOutsideOrange;
            this.isOutsideYellow = isOutsideYellow;
            this.isOutsideGreen = isOutsideGreen;
            this.isOutsideWhite = isOutsideWhite;
            this.isInsideRed = isInsideRed;
            this.isInsideOrange = isInsideOrange;
            this.isInsideYellow = isInsideYellow;
            this.isInsideGreen = isInsideGreen;
            this.isInsideWhite = isInsideWhite;
            this.isExpensive = isExpensive;
            this.isSoft = isSoft;
            this.isOutsideHard = isOutsideHard;
            this.isOutsideSoft = isOutsideSoft;
            this.isInsideHard = isInsideHard;
            this.isInsideSoft = isInsideSoft;
            this.areSeedsEaten = areSeedsEaten;
            this.hasManySeeds = hasManySeeds;
            this.isSkinEaten = isSkinEaten;
        }

        public int getIsRound() {
            return isRound;
        }

        public int getIsBig() {
            return isBig;
        }

        public int getIsSmall() {
            return isSmall;
        }

        public int getIsSweet() {
            return isSweet;
        }

        public int getIsSour() {
            return isSour;
        }

        public int getIsLight() {
            return isLight;
        }

        public int getIsHeavy() {
            return isHeavy;
        }

        public int getIsOutsideRed() {
            return isOutsideRed;
        }

        public int getIsOutsideOrange() {
            return isOutsideOrange;
        }

        public int getIsOutsideYellow() {
            return isOutsideYellow;
        }

        public int getIsOutsideGreen() {
            return isOutsideGreen;
        }

        public int getIsOutsideWhite() {
            return isOutsideWhite;
        }

        public int getIsInsideRed() {
            return isInsideRed;
        }

        public int getIsInsideOrange() {
            return isInsideOrange;
        }

        public int getIsInsideYellow() {
            return isInsideYellow;
        }

        public int getIsInsideGreen() {
            return isInsideGreen;
        }

        public int getIsInsideWhite() {
            return isInsideWhite;
        }

        public int getIsExpensive() {
            return isExpensive;
        }

        public int getIsSoft() {
            return isSoft;
        }

        public int getIsOutsideHard() {
            return isOutsideHard;
        }

        public int getIsOutsideSoft() {
            return isOutsideSoft;
        }

        public int getIsInsideHard() {
            return isInsideHard;
        }

        public int getIsInsideSoft() {
            return isInsideSoft;
        }

        public int getAreSeedsEaten() {
            return areSeedsEaten;
        }

        public int getHasManySeeds() {
            return hasManySeeds;
        }

        public int getIsSkinEaten() {
            return isSkinEaten;
        }
    }
}