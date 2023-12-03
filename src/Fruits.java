public class Fruits {
    public static class Fruit {
        private String name;
        private FruitProperties properties;

        public Fruit(String name, FruitProperties properties) {
            this.name = name;
            this.properties = properties;
        }

        public String getName() {
            return name;
        }

        public FruitProperties getProperties() {
            return properties;
        }
    }

    public static class FruitPropertiesFactory {
        public static FruitProperties createAppleProperties() {
            return new FruitProperties(true, true, false, false, false,
                                false, true, false, true, true, false,
                        true, false);
        }

        public static FruitProperties createOrangeProperties() {
            return new FruitProperties(true, false, false, true, false,
                    false, true, false, true, false, true,
                    false, false);
        }

        public static FruitProperties createBananaProperties() {
            return new FruitProperties(false, false, true, false, true,
                    false, true, false, true, true, false,
                    false, false);
        }

        public static FruitProperties createWatermelonProperties() {
            return new FruitProperties(true, false, false, false, true,
                    true, false, true, false, true, false,
                    false, false);
        }

        public static FruitProperties createMangoProperties() {
            return new FruitProperties(false, false, true, false, true,
                    false, true, false, true, true, false,
                    false, false);
        }
    }

    public static class FruitProperties {
        boolean isRound;
        boolean isColorRed;
        boolean isColorYellow;
        boolean isColorOrange;
        boolean isColorGreen;
        boolean isHeavy;
        boolean isLight;
        boolean isBig;
        boolean isSmall;
        boolean isSweet;
        boolean isSour;
        boolean isEatenWithSkinOn;
        boolean isAssociatedWithHoliday;

        public FruitProperties(boolean isRound, boolean isColorRed, boolean isColorYellow, boolean isColorOrange, boolean isColorGreen, boolean isHeavy, boolean isLight, boolean isBig, boolean isSmall, boolean isSweet, boolean isSour, boolean isEatenWithSkinOn, boolean isAssociatedWithHoliday) {
            this.isRound = isRound;
            this.isColorRed = isColorRed;
            this.isColorYellow = isColorYellow;
            this.isColorOrange = isColorOrange;
            this.isColorGreen = isColorGreen;
            this.isHeavy = isHeavy;
            this.isLight = isLight;
            this.isBig = isBig;
            this.isSmall = isSmall;
            this.isSweet = isSweet;
            this.isSour = isSour;
            this.isEatenWithSkinOn = isEatenWithSkinOn;
            this.isAssociatedWithHoliday = isAssociatedWithHoliday;
        }

        // Getters for the attributes
        public boolean getIsRound() {
            return isRound;
        }

        public boolean getIsColorRed() {
            return isColorRed;
        }

        public boolean getIsColorYellow() {
            return isColorYellow;
        }

        public boolean getIsColorOrange() {
            return isColorOrange;
        }

        public boolean getIsColorGreen() {
            return isColorGreen;
        }

        public boolean getIsHeavy() {
            return isHeavy;
        }

        public boolean getIsLight() {
            return isLight;
        }

        public boolean getIsBig() {
            return isBig;
        }

        public boolean getIsSmall() {
            return isSmall;
        }

        public boolean getIsSweet() {
            return isSweet;
        }

        public boolean getIsSour() {
            return isSour;
        }

        public boolean getIsEatenWithSkinOn() {
            return isEatenWithSkinOn;
        }

        public boolean getIsAssociatedWithHoliday() {
            return isAssociatedWithHoliday;
        }
    }
}
